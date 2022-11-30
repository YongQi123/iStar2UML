---
layout: page
title: RM2PT Case Study
permalink: /casestudy/libms/
typora-root-url: ../../../rm2pt-website
---

# Supermarket System - CoCoME

### Use Case Diagram

<img src="/imgs/library-usecase.png" alt="Alt text" style="zoom: 67%;" />

### Conceptual Class Diagram

<img src="/imgs/library-ccd.png" alt="Alt text" style="zoom:50%;" />

### Main Contracts of System Operations

```
/* Search book */
Contract SearchBook::searchBookByBarCode(barcode:String): Set(Book) {

	precondition:
		barcode.oclIsTypeOf(String)

	postcondition:
		result = Book.allInstance()->select(book:Book | book.Copys->exists(c:BookCopy | c.Barcode = barcode))
}

Contract SearchBook::searchBookByTitle(title:String): Set(Book) {

	precondition:
		title <> ""

	postcondition:
		result = Book.allInstance()->select(book:Book | book.Title = title)         
}

Contract SearchBook::searchBookByAuthor(authorname:String) : Set(Book) {

	precondition:
		authorname <> ""

	postcondition:
		result = Book.allInstance()->select(book:Book | book.Author = authorname)
}

Contract SearchBook::searchBookByISBN(ISBNnumber:String): Set(Book) {

	precondition:
		ISBNnumber.oclIsTypeOf(String)

	postcondition:
		result = Book.allInstance()->select(book:Book | book.ISBn = ISBNnumber)
}

Contract SearchBook::searchBookBySubject(subject:String): Set(Book) {

	precondition:
		subject.oclIsTypeOf(String)

	postcondition:
		result = Book.allInstance()->select(book:Book | book.Subject->exists(s:Subject | s.Name = subject))
}

/* Main functions */
Contract LibraryManagementSystem::makeReservation(uid:String, barcode:String) : Boolean {

	definition:
		user:User = User.allInstance()->any(u:User | u.UserID = uid),
		copy:BookCopy = BookCopy.allInstance()->any(bc:BookCopy | bc.Barcode = barcode)

	precondition:
		user.oclIsUndefined() = false and
		copy.oclIsUndefined() = false and
		copy.Status = CopyStatus::LOANED and
		copy.IsReserved = false

	postcondition:
		let res:Reserve in
		res.oclIsNew() and
		copy.IsReserved = true and
		res.IsReserveClosed = false and
		res.ReserveDate.isEqual(Today) and
		res.ReservedUser = user and
		res.ReservedCopy = copy and
		user.ReservedBook->includes(res) and
		copy.ReservationRecord->includes(res) and
		Reserve.allInstance()->includes(res) and
		result = true

}

Contract LibraryManagementSystem::cannelReservation(uid:String, barcode:String) : Boolean {

	definition:
		user:User = User.allInstance()->any(u:User | u.UserID = uid),
		copy:BookCopy = BookCopy.allInstance()->any(bc:BookCopy | bc.Barcode = barcode),
		res:Reserve = Reserve.allInstance()->any(r:Reserve | r.ReservedCopy = copy and r.ReservedUser = user)

	precondition:
		user.oclIsUndefined() = false and
		copy.oclIsUndefined() = false and
		copy.Status = CopyStatus::LOANED and
		copy.IsReserved = true and
		res.oclIsUndefined() = false and
		res.IsReserveClosed = false

	postcondition:
		copy.IsReserved = false and
		res.IsReserveClosed = true and
		result = true

}

Contract LibraryManagementSystem::borrowBook(uid:String, barcode:String) : Boolean {

	definition:
		user:User = User.allInstance()->any(u:User | u.UserID = uid),
		stu:Student = Student.allInstance()->any(s:Student | s.UserID = uid),
		fac:Faculty = Faculty.allInstance()->any(f:Faculty | f.UserID = uid),
		copy:BookCopy = BookCopy.allInstance()->any(bc:BookCopy | bc.Barcode = barcode),
		res:Reserve = Reserve.allInstance()->any(r:Reserve | r.ReservedCopy = copy and r.ReservedUser = user and r.IsReserveClosed = false)

	precondition:
		user.oclIsUndefined() = false and
		copy.oclIsUndefined() = false and
		user.BorrowStatus = BorrowStatus::NORMAL and
		user.SuspensionDays = 0 and
		if
			user.oclIsTypeOf(Student)
		then
			if
				stu.Programme = Programme::BACHELOR
			then
				stu.LoanedNumber < 20
			else
				if
					stu.Programme = Programme::MASTER
				then
					stu.LoanedNumber < 40
				else
					stu.LoanedNumber < 60
				endif
			endif
		else
			fac.LoanedNumber < 60
		endif and
		(copy.Status = CopyStatus::AVAILABLE or
			(copy.Status = CopyStatus::ONHOLDSHELF and
				copy.IsReserved = true and
				res.oclIsUndefined() = false and
				res.IsReserveClosed = false
			)
		)

	postcondition:
		let loan:Loan in
		loan.oclIsNew() and
		loan.LoanedUser = user and
		loan.LoanedCopy = copy and
		loan.IsReturned = false and
		loan.LoanDate = Today and
		user.LoanedNumber = user.LoanedNumber@pre + 1 and
		user.LoanedBook->includes(loan) and
		copy.LoanedRecord->includes(loan) and
		if
			user.oclIsTypeOf(Student)
		then
			loan.DueDate = Today.After(30)
		else
			loan.DueDate = Today.After(60)
		endif and
		if
			copy.Status@pre = CopyStatus::ONHOLDSHELF
		then
			copy.IsReserved = false and
			res.IsReserveClosed = true
		endif and
		copy.Status = CopyStatus::LOANED and
		loan.OverDue3Days = false and
		loan.OverDue10Days = false and
		loan.OverDue17Days = false and
		loan.OverDue31Days = false and
		Loan.allInstance()->includes(loan) and
		result = true

}

Contract LibraryManagementSystem::returnBook(barcode:String) : Boolean {

	definition:
		copy:BookCopy = BookCopy.allInstance()->any(bc:BookCopy | bc.Barcode = barcode and bc.Status = CopyStatus::LOANED),
		loan:Loan = Loan.allInstance()->any(l:Loan | l.LoanedCopy = copy and l.IsReturned = false),
		loans:Set(Loan) = Loan.allInstance()->select(l:Loan | l.LoanedUser = loan.LoanedUser and l.IsReturned = false and l.DueDate.isAfter(Today)),
		res:Reserve = copy.ReservationRecord->any(r:Reserve | r.ReservedCopy = copy)

	precondition:
		copy.oclIsUndefined() = false and
		loan.oclIsUndefined() = false

	postcondition:
		loan.LoanedUser.LoanedNumber = loan.LoanedUser.LoanedNumber@pre - 1 and
		loan.IsReturned = true and
		loan.ReturnDate = Today and
		if
			copy.IsReserved = true
		then
			copy.Status = CopyStatus::ONHOLDSHELF and
			sendNotificationEmail(res.ReservedUser.Email)
		else
			copy.Status = CopyStatus::AVAILABLE
		endif and
		result = true
}

Contract LibraryManagementSystem::renewBook(uid:String, barcode:String) : Boolean {

	definition:
		user:User = User.allInstance()->any(u:User | u.UserID = uid),
		stu:Student = Student.allInstance()->any(s:Student | s.UserID = uid),
		fac:Faculty = Faculty.allInstance()->any(f:Faculty | f.UserID = uid),
		copy:BookCopy = BookCopy.allInstance()->any(bc:BookCopy | bc.Barcode = barcode and bc.Status = CopyStatus::LOANED),
		loan:Loan = Loan.allInstance()->any(l:Loan | l.LoanedUser = user and l.LoanedCopy = copy)

	precondition:
		user.BorrowStatus = BorrowStatus::NORMAL and
		user.oclIsUndefined() = false and
		copy.oclIsUndefined() = false and
		loan.oclIsUndefined() = false and
		copy.IsReserved = false and
		loan.DueDate.isAfter(Today) and
		if
			user.oclIsTypeOf(Student)
		then
			loan.RenewedTimes < 3
		else
			loan.RenewedTimes < 6
		endif and
		loan.OverDueFee = 0

	postcondition:
		loan.RenewedTimes = loan.RenewedTimes@pre + 1 and
		loan.RenewDate = Today and
		if
			user.oclIsTypeOf(Student)
		then
			if
				stu.Programme = Programme::BACHELOR
			then
				loan.DueDate = loan.DueDate@pre.After(20)
			else
				if
					stu.Programme = Programme::MASTER
				then
					loan.DueDate = loan.DueDate@pre.After(40)
				else
					loan.DueDate = loan.DueDate@pre.After(60)
				endif
			endif
		else
			loan.DueDate = loan.DueDate@pre.After(60)
		endif and
		result = true
}
```

### ATM Requirements Model - Fully Download

[Download RM2PT project - LibMS](https://github.com/RM2PT/CaseStudies)

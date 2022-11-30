---
layout: page
title: RM2PT Case Study
permalink: /casestudy/loanps/
typora-root-url: ../../../rm2pt-website
---

# Loan Processing System - LoanPS

### Use Case Diagram

<img src="/imgs/Loan-ucd.png" alt="Alt text" style="zoom:50%;" />

### System Sequence Diagrams

<img src="/imgs/Loan-ssd.png" alt="Alt text" style="zoom:50%;" />

### Conceptual Class Diagram

<img src="/imgs/Loan-ccd.png" alt="Alt text" style="zoom:50%;" />

### Main Contracts of System Operations

```
//entity create operation
Contract  SubmitLoanRequestModule::enterLoanInformation(requestid : Integer, name : String, loanamount : Real, loanpurpose : String, income : Real, phonenumber : Integer, postaladdress : String, zipcode : Integer, email : String, workreferences : String, creditreferences : String, checkingaccountnumber : Integer, securitynumber : Integer) : Boolean {

	/* definition: find specific LoanRequest instance by requestid */
	definition:
		loanrequest:LoanRequest = LoanRequest.allInstance()->any(loa:LoanRequest | loa.RequestID = requestid)

	/* precondition: the instance loanrequest was not found in the system */
	precondition:
		loanrequest.oclIsUndefined() = true

	/* postcondition:
	 * A LoanRequest instance loa was created.
	 * all properties of loa became the same values as inputs.
	 */
	postcondition:
		let loa:LoanRequest in
		loa.oclIsNew() and
		loa.RequestID = requestid and
		loa.Name = name and
		loa.LoanAmount = loanamount and
		loa.LoanPurpose = loanpurpose and
		loa.Income = income and
		loa.PhoneNumber = phonenumber and
		loa.PostalAddress = postaladdress and
		loa.ZipCode = zipcode and
		loa.Email = email and
		loa.WorkReferences = workreferences and
		loa.CreditReferences = creditreferences and
		loa.CheckingAccountNumber = checkingaccountnumber and
		loa.SecurityNumber = securitynumber and
		LoanRequest.allInstance()->includes(loa) and
		self.CurrentLoanRequest = loa and
		result = true
}

Contract SubmitLoanRequestModule::creditRequest() : Boolean {

	/* precondition: skeleton */
	precondition:
		self.CurrentLoanRequest.oclIsUndefined() = false

	/* postcondition: skeleton */
	postcondition:
		let his:CreditHistory in
		his.oclIsNew() and
		his = getCreditHistory(CurrentLoanRequest.SecurityNumber, CurrentLoanRequest.Name) and
		CurrentLoanRequest.RequestedCreditHistory = his and

		CreditHistory.allInstance()->includes(his) and
		result = true

}

//Contract SubmitLoanRequestModule::accountStatusRequest Skeleton
Contract SubmitLoanRequestModule::accountStatusRequest() : Boolean {

	/* precondition: skeleton */
	precondition:
		self.CurrentLoanRequest.oclIsUndefined() = false

	/* postcondition: skeleton */
	postcondition:
		let ca:CheckingAccount in
		ca.oclIsNew() and
		ca = getCheckingAccountStatus(self.CurrentLoanRequest.CheckingAccountNumber) and
		self.CurrentLoanRequest.RequestedCAHistory = ca and
		CheckingAccount.allInstance()->includes(ca) and
		result = true
}

//Contract SubmitLoanRequestModule::calculateScore Skeleton
Contract SubmitLoanRequestModule::calculateScore() : Integer {

	/* precondition: skeleton */
	precondition:
		self.CurrentLoanRequest.oclIsUndefined() = false and
		CurrentLoanRequest.RequestedCAHistory.oclIsUndefined() = false and
		CurrentLoanRequest.RequestedCreditHistory.oclIsUndefined() = false

	/* postcondition: skeleton */
	postcondition:
		// outstandingdebt,  baddebits,  balance,  checkingaccountstatus,  income
		self.CurrentLoanRequest.CreditScore = 100 and
		self.CurrentLoanRequest.Status = LoanRequestStatus::SUBMITTED and
		result = self.CurrentLoanRequest.CreditScore
}

// LoanStatus[SUBMITTED|REFERENCESVALIDATED|APPROVED|READYFORREVIEW|INCOMPLETEINFORMATION]
//Contract EnterValidatedCreditReferencesModule::listSubmitedLoanRequest Skeleton
Contract EnterValidatedCreditReferencesModule::listSubmitedLoanRequest() : Set(LoanRequest) {

	definition:
		rs:Set(LoanRequest) = LoanRequest.allInstance()->select(r:LoanRequest | r.Status =  LoanRequestStatus::SUBMITTED)

	/* precondition: skeleton */
	precondition:
		rs.size() > 0

	/* postcondition: skeleton */
	postcondition:
		self.CurrentLoanRequests = rs and
		result = rs
}

//Contract EnterValidatedCreditReferencesModule::chooseLoanRequest Skeleton
Contract EnterValidatedCreditReferencesModule::chooseLoanRequest(requestid : Integer) : LoanRequest {

	definition:
		rs:LoanRequest = self.CurrentLoanRequests->any(r:LoanRequest | r.RequestID = requestid)

	/* precondition: skeleton */
	precondition:
		rs.oclIsUndefined() = false

	/* postcondition: skeleton */
	postcondition:
		self.CurrentLoanRequest = rs and
		result = rs
}

//Contract EnterValidatedCreditReferencesModule::markRequestValid Skeleton
Contract EnterValidatedCreditReferencesModule::markRequestValid() : Boolean {

	/* precondition: skeleton */
	precondition:
		self.CurrentLoanRequest.oclIsUndefined() = false

	/* postcondition: skeleton */
	postcondition:
		self.CurrentLoanRequest.Status = LoanRequestStatus::REFERENCESVALIDATED and
		result = true
}

//Contract EvaluateLoanRequestModule::listTenLoanRequest Skeleton
Contract EvaluateLoanRequestModule::listTenLoanRequest() : Set(LoanRequest) {

	definition:
		rs:Set(LoanRequest) = LoanRequest.allInstance()->select(r:LoanRequest | r.Status =  LoanRequestStatus::REFERENCESVALIDATED)

	/* precondition: skeleton */
	precondition:
		rs.oclIsUndefined() = false

	/* postcondition: skeleton */
	postcondition:
		self.CurrentLoanRequests = rs and
		result = rs
}

//Contract EvaluateLoanRequestModule::chooseOneForReview Skeleton
Contract EvaluateLoanRequestModule::chooseOneForReview(requestid : Integer) : LoanRequest {

	definition:
		rs:LoanRequest = self.CurrentLoanRequests->any(r:LoanRequest | r.RequestID = requestid)

	/* precondition: skeleton */
	precondition:
		rs.oclIsUndefined() = false

	/* postcondition: skeleton */
	postcondition:
		self.CurrentLoanRequest = rs and
		result = rs
}

//Contract EvaluateLoanRequestModule::checkCreditHistory Skeleton
Contract EvaluateLoanRequestModule::checkCreditHistory() : CreditHistory {

	/* precondition: skeleton */
	precondition:
		self.CurrentLoanRequest.oclIsUndefined() = false and
		CurrentLoanRequest.RequestedCreditHistory.oclIsUndefined() = false

	/* postcondition: skeleton */
	postcondition:
		result = CurrentLoanRequest.RequestedCreditHistory
}

//Contract EvaluateLoanRequestModule::reviewCheckingAccount Skeleton
Contract EvaluateLoanRequestModule::reviewCheckingAccount() : CheckingAccount {

	precondition:
		self.CurrentLoanRequest.oclIsUndefined() = false and
		CurrentLoanRequest.RequestedCAHistory.oclIsUndefined() = false

	postcondition:
		result = CurrentLoanRequest.RequestedCAHistory

}

//Contract EvaluateLoanRequestModule::listAvaiableLoanTerm Skeleton
Contract EvaluateLoanRequestModule::listAvaiableLoanTerm() : Set(LoanTerm) {

	/* precondition: skeleton */
	precondition:
		true

	/* postcondition: skeleton */
	postcondition:
		result = LoanTerm.allInstance()
}

//Contract EvaluateLoanRequestModule::addLoanTerm Skeleton
Contract EvaluateLoanRequestModule::addLoanTerm(termid : Integer) : Boolean {

	/* definition skeleton */
	definition:
		loanterm:LoanTerm = LoanTerm.allInstance()->any(loa:LoanTerm | loa.ItemID = termid)

	/* precondition: skeleton */
	precondition:
		self.CurrentLoanRequest.oclIsUndefined() = false and
		loanterm.oclIsUndefined() = false

	/* postcondition: skeleton */
	postcondition:
		CurrentLoanRequest.AttachedLoanTerms->includes(loanterm) and
		result = true
}

//Contract EvaluateLoanRequestModule::approveLoanRequest Skeleton
Contract EvaluateLoanRequestModule::approveLoanRequest() : Boolean {

	/* precondition: skeleton */
	precondition:
		self.CurrentLoanRequest.oclIsUndefined() = false

	/* postcondition: skeleton */
	postcondition:
		self.CurrentLoanRequest.Status = LoanRequestStatus::APPROVED and
		result = true
}

//Contract GenerateLoanLetterAndAgreementModule::listApprovalRequest Skeleton
Contract GenerateLoanLetterAndAgreementModule::listApprovalRequest() : Set(LoanRequest) {

	definition:
		rs:Set(LoanRequest) = LoanRequest.allInstance()->select(r:LoanRequest | r.Status =  LoanRequestStatus::APPROVED)

	/* precondition: skeleton */
	precondition:
		rs.oclIsUndefined() = false

	/* postcondition: skeleton */
	postcondition:
		self.CurrentLoanRequests = rs and
		result = rs
}

//Contract GenerateLoanLetterAndAgreementModule::genereateApprovalLetter Skeleton
Contract GenerateLoanLetterAndAgreementModule::genereateApprovalLetter(id : Integer) : Boolean {

	/* definition skeleton */
	definition:
		r:LoanRequest = LoanRequest.allInstance()->any(lr:LoanRequest | lr.RequestID = id)

	/* precondition: skeleton */
	precondition:
		r.oclIsUndefined() = false

	/* postcondition: skeleton */
	postcondition:
		let l:ApprovalLetter in
		l.oclIsNew() and
		l.Content = "ApprovalLetterContent" and
		r.AttachedApprovalLetter = l and
		self.CurrentLoanRequest = r and
		ApprovalLetter.allInstance()->includes(l) and
		result = true
}

//Contract GenerateLoanLetterAndAgreementModule::emailToAppliant Skeleton
Contract GenerateLoanLetterAndAgreementModule::emailToAppliant() : Boolean {

	/* precondition: skeleton */
	precondition:
		self.CurrentLoanRequest.oclIsUndefined() = false

	/* postcondition: skeleton */ // "Your Loan Request was approved"
	postcondition:
		sendEmail(CurrentLoanRequest.Email, CurrentLoanRequest.Name, "Your Loan Request was approved") and
		result = true
}

//Contract GenerateLoanLetterAndAgreementModule::generateLoanAgreement Skeleton
Contract GenerateLoanLetterAndAgreementModule::generateLoanAgreement() : Boolean {

	/* precondition: skeleton */
	precondition:
		self.CurrentLoanRequest.oclIsUndefined() = false

	/* postcondition: skeleton */
	postcondition:
		let la:LoanAgreement in
		la.oclIsNew() and
		la.Content = "Loan Agreement" and
		self.CurrentLoanRequest.AttachedLoanAgreement = la and
		LoanAgreement.allInstance()->includes(la) and
		result = true
}

//Contract GenerateLoanLetterAndAgreementModule::printLoanAgreement Skeleton
Contract GenerateLoanLetterAndAgreementModule::printLoanAgreement(number : Integer) : Boolean {

	/* precondition: skeleton */
	precondition:
		self.CurrentLoanRequest.oclIsUndefined() = false

	/* postcondition: skeleton */
	postcondition:
		print(CurrentLoanRequest.AttachedLoanAgreement.Content, number) and
		result = true
}
//entity create operation
Contract  LoanManagementModule::bookNewLoan(requestid : Integer, loanid : Integer, accountid: Integer, startdate : Date, enddate : Date, repaymentdays : Integer) : Boolean {

	/* definition: find specific Loan instance by loanid */
	definition:
		loan:Loan = Loan.allInstance()->any(loa:Loan | loa.LoanID = loanid),
		r:LoanRequest = LoanRequest.allInstance()->any(lr:LoanRequest | lr.RequestID = requestid),
		la:LoanAccount = LoanAccount.allInstance()->any(lacc:LoanAccount | lacc.LoanAccountID = accountid)

	/* precondition: the instance loan was not found in the system */
	precondition:
		loan.oclIsUndefined() = true and
		r.oclIsUndefined() = false

	/* postcondition:
	 * A Loan instance loa was created.
	 * all properties of loa became the same values as inputs.
	 */
	postcondition:
		let loa:Loan, lacc:LoanAccount in
		loa.oclIsNew() and
		loa.LoanID = loanid and
		loa.StartDate = startdate and
		loa.EndDate = enddate and
		loa.RePaymentDays = repaymentdays and
		loa.Status = LoanStatus::LSOPEN and
		loa.RepaymentAmount = r.LoanAmount and
		loa.CurrentOverDueDate = startdate.After(repaymentdays) and
		if
			la.oclIsUndefined() = true
		then
			lacc = createLoanAccount(accountid) and
			LoanAccount.allInstance()->includes(lacc) and		
			lacc.Balance = r.LoanAmount and
			loa.BelongedLoanAccount = lacc
		else
			la.Balance = la.Balance@pre + r.LoanAmount 	
		endif and
		transferFunds(accountid, r.LoanAmount) and
		loa.RemainAmountToPay = r.LoanAmount and
		Loan.allInstance()->includes(loa) and
		r.ApprovalLoan = loa and
		loa.ReferedLoanRequest = r and
		result = true
}

Contract LoanManagementModule::generateStandardPaymentNotice() : Boolean {

	/* definition skeleton */
	definition:
		loans:Set(Loan) = Loan.allInstance()->select(loa:Loan | loa.Status = LoanStatus::LSOPEN and Today.After(3).isAfter(loa.CurrentOverDueDate))

	/* precondition: skeleton */
	precondition:
		loans.oclIsUndefined() = false

	/* postcondition: skeleton */
	postcondition:
		loans->forAll(l:Loan |
			sendEmail(l.ReferedLoanRequest.Email, "OverDueSoon", "You account is OverDueSoon"))
		and
		result = true
}

Contract LoanManagementModule::generateLateNotice() : Boolean {

	/* definition skeleton */
	definition:
		loans:Set(Loan) = Loan.allInstance()->select(loa:Loan | loa.Status = LoanStatus::LSOPEN and Today.isAfter(loa.CurrentOverDueDate))

	/* precondition: skeleton */
	precondition:
		loans.oclIsUndefined() = false

	/* postcondition: skeleton */
	postcondition:
		loans->forAll(l:Loan |
			sendEmail(l.ReferedLoanRequest.Email, "OverDued", "You are overdued, please repayment ASAP"))
		and
		result = true
}

//Contract LoanManagementModule::loanPayment Skeleton
Contract LoanManagementModule::loanPayment(loanid : Integer) : Boolean {

	/* definition skeleton */
	definition:
		loan:Loan = Loan.allInstance()->any(loa:Loan | loa.LoanID = loanid)

	/* precondition: skeleton */
	precondition:
		loan.oclIsUndefined() = false and
		loan.Status = LoanStatus::LSOPEN

	/* postcondition: skeleton */
	postcondition:
		loan.RemainAmountToPay = loan.RemainAmountToPay@pre - loan.RepaymentAmount and
		result = true
}

//Contract LoanManagementModule::closeOutLoan Skeleton
Contract LoanManagementModule::closeOutLoan(loanid : Integer) : Boolean {

	/* definition skeleton */
	definition:
		loan:Loan = Loan.allInstance()->any(loa:Loan | loa.LoanID = loanid)

	/* precondition: skeleton */
	precondition:
		loan.oclIsUndefined() = false and
		loan.Status = LoanStatus::LSOPEN

	/* postcondition: skeleton */
	postcondition:
		loan.Status = LoanStatus::CLOSED and
		result = true
}
```

### ATM Requirements Model - Fully Download

[Download RM2PT project - LoanPS](https://github.com/RM2PT/CaseStudies)

---
layout: page
title: RM2PT Case Study
permalink: /casestudy/cocome/
typora-root-url: ../../../rm2pt-website
---

# Supermarket System - CoCoME

### Use Case Diagram

<img src="/imgs/cocome-usecase.png" alt="Alt text" style="zoom:67%;" />

### System Sequence Diagrams

<img src="/imgs/cocome-ssd.png" alt="Alt text" style="zoom:50%;" />

### Conceptual Class Diagram

<img src="/imgs/cocome-ccd.png" alt="Alt text" style="zoom:50%;" />

### Main Contracts of System Operations

```
Contract CoCoMEProcessSale::makeNewSale() : Boolean {

	/* preconditions:  none */
	precondition:
		currentCashDesk.oclIsUndefined() = false and
		currentCashDesk.IsOpened = true and
		(currentSale.oclIsUndefined() = true or
			(currentSale.oclIsUndefined() = false and
				currentSale.IsComplete = true
			)
		)

	/* postconditions:
	 * A sale instance s was created (instance creation).
	 * s was associated with the current CashDesk (association formed)
	 * Attribute IsComplete of s was initialized as false. (object initialization)
	 * currentSale became s
	 */
	postcondition:
		let s:Sale in
		s.oclIsNew() and
		s.BelongedCashDesk = currentCashDesk and
		currentCashDesk.ContainedSales->includes(s) and
		s.IsComplete = false and
		s.IsReadytoPay = false and
		Sale.allInstance()->includes(s) and
		self.currentSale = s and
		result = true
}

Contract CoCoMEProcessSale::enterItem(barcode : Integer, quantity : Integer) : Boolean {

	/* Definition: find specific Item instance by barcode */
	definition:
		item:Item = Item.allInstance()->any(i:Item | i.Barcode = barcode)

	/* Precondition: there is a sale underway */
	precondition:
		currentSale.oclIsUndefined() = false and
		currentSale.IsComplete = false and
		item.oclIsUndefined() = false and
		item.StockNumber > 0

	/**
	 * A salesLineItem instance sli was created (instance creation).
	 * sli was associated with the current Sale (association formed).
	 * sli.quantity became quantity (attribute modification).
	 * sli was associated with a Item (association formed).
	 * subamount became item.price * quantity
	 */
	postcondition:
		let sli:SalesLineItem in
		sli.oclIsNew() and
		self.currentSaleLine = sli and
		sli.BelongedSale = currentSale and
		currentSale.ContainedSalesLine->includes(sli) and
		sli.Quantity = quantity and
		sli.BelongedItem = item and
		item.StockNumber = item.StockNumber@pre - quantity and
		sli.Subamount = item.Price * quantity and
		SalesLineItem.allInstance()->includes(sli) and
		result = true

}

Contract CoCoMEProcessSale::endSale() : Real {

	definition:

		sls:Set(SalesLineItem) = currentSale.ContainedSalesLine,
		sub:Set(Real) = sls->collect(s:SalesLineItem | s.Subamount)

	/* Precondition: there is a sale underway and no more items. */
	precondition:
		currentSale.oclIsUndefined() = false and
		currentSale.IsComplete = false and
		currentSale.IsReadytoPay = false

	/**
	 * Postcondition:
	 * add all sub amount of SalesLineItem up to the Amount of currentSale (compute amount).
	 * currentSale.IsReadytoPay became true
	 */
	postcondition:
		currentSale.Amount = sub.sum() and
		currentSale.IsReadytoPay = true and
		result = currentSale.Amount
}

Contract CoCoMEProcessSale::makeCashPayment(amount : Real) : Boolean {

	/* Precondition: There is a sale underway, the sale is ready to pay, and tendered amount is greater than or equal to the amount of current Sale*/
	precondition:
		currentSale.oclIsUndefined() = false and
		currentSale.IsComplete = false and
		currentSale.IsReadytoPay = true and
		amount >= currentSale.Amount

	/**
	 * A CashPayment instance cp was created (instance creation).
	 * cp.amountTendered became amount (attribute modification).
	 * cp was associated with the current Sale (association formed).
	 * The current Sale was associated with the Store (association formed).
	 * Sale.isComplete became true (attribute modification).
	 * Sale.time became now  (attribute modification).
	 * cp.Balance became the value of tendered amount minus current Sale amount
	 */
	postcondition:
		let cp:CashPayment in
		cp.oclIsNew() and
		cp.AmountTendered = amount and
		cp.BelongedSale = currentSale and
		currentSale.AssoicatedPayment = cp and
		currentSale.Belongedstore = currentStore and
		currentStore.Sales->includes(currentSale) and
		currentSale.IsComplete = true and
		currentSale.Time.isEqual(Now) and
		cp.Balance = amount - currentSale.Amount and
		CashPayment.allInstance()->includes(cp) and
		result = true

}

Contract CoCoMEProcessSale::makeCardPayment(cardAccountNumber : String, expiryDate : Date, fee: Real) : Boolean {

	/* Precondition: An underway sale exists and all items have been entered. */
	precondition:
		currentSale.oclIsUndefined() = false and
		currentSale.IsComplete = false and
		currentSale.IsReadytoPay = true and
		thirdPartyCardPaymentService(cardAccountNumber, expiryDate, fee)

	/**
	 * a CardPayment cdp was created
	 * cdp was associated with the current Sale
	 * cdp.CardAccountNumber = cardAccountNumber, cdp.expiryDate = expiryDate
	 * invoke third party card payment service
	 * sale was associated with the Store as a completed sale
	 * The current sale is complete
	 * Sale.time became now
	 */
	postcondition:
		let cdp:CardPayment in
		cdp.oclIsNew() and
		cdp.AmountTendered = fee and
		cdp.BelongedSale = currentSale and
		currentSale.AssoicatedPayment = cdp and
		cdp.CardAccountNumber = cardAccountNumber and
		cdp.ExpiryDate = expiryDate and
		CardPayment.allInstance()->includes(cdp) and
		currentSale.Belongedstore = currentStore and
		currentStore.Sales->includes(currentSale) and
		currentSale.IsComplete = true and
		currentSale.Time.isEqual(Now) and
		result = true

}
```

### ATM Requirements Model - Fully Download

[Download RM2PT project - CoCoME](https://github.com/RM2PT/CaseStudies)

package com.sumsoft.design.patterns.facade;

/*
 * @author Sumith Puri
 */
public class LedgerManager {

	public void initOnInvoice(Integer invoiceId) {
		System.out.println("Ledger Manager: Initializing Invoice - " + invoiceId);
	}
	
	public void cascadeDeleteInvoice(Integer invoiceId) {
		System.out.println("Ledger Manager: Cascade Delete - " + invoiceId);	
	}
}

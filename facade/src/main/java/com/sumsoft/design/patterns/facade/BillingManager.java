package com.sumsoft.design.patterns.facade;

/*
 * @author Sumith Puri
 */
public class BillingManager {

	public void initOnInvoice(Integer invoiceId) {
		System.out.println("Billing Manager: Initializing Invoice - " + invoiceId);
	}
	
	public void deleteInvoice(Integer invoiceId) {
		System.out.println("Billing Manager: Deleting Invoice - " + invoiceId);	
	}
}

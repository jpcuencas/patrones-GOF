package com.sumsoft.design.patterns.facade;

/*
 * @author Sumith Puri
 */
public class OrderManager {

	public void initOnInvoice(Integer invoiceId) {
		System.out.println("Order Manager: Initializing Invoice - " + invoiceId);
	}
	
	public void purgeInvoice(Integer invoiceId) {
		System.out.println("Order Manager: Purging Invoice - " + invoiceId);	
	}
}

package com.sumsoft.design.patterns.facade;

/*
 * @author Sumith Puri
 */
public interface InvoiceSessionFacade {

	public void addInvoice(Invoice invoice);
	
	public void deleteInvoice(Invoice invoice);
}

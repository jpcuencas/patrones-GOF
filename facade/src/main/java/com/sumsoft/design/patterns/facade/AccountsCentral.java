package com.sumsoft.design.patterns.facade;

/*
 * @author Sumith Puri
 */
public class AccountsCentral {

	public static void main(String args[]) {
		Invoice invoice01 = new Invoice(new Integer("121007"), new String("CorporateParty"));
		Invoice invoice02 = new Invoice(new Integer("121008"), new String("TeamLunch"));
		
		InvoiceSessionFacade facade = new InvoiceSessionFacadeImpl();
		facade.addInvoice(invoice01);
		facade.addInvoice(invoice02);
		
		facade.deleteInvoice(invoice01);
		
	}
} 

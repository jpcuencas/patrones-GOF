package com.sumsoft.design.patterns.facade;

/*
 * @author Sumith Puri
 */
public class Invoice {
	
	public Integer invoiceId;
	public String invoiceName;
	
	public Invoice(Integer invoiceId, String invoiceName) {
		this.invoiceId = invoiceId;
		this.invoiceName = invoiceName;
	}
	
	/**
	 * @return the invoiceId
	 */
	public synchronized Integer getInvoiceId() {
		return invoiceId;
	}
	
	/**
	 * @param invoiceId the invoiceId to set
	 */
	public synchronized void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}
	
	/**
	 * @return the invoiceName
	 */
	public synchronized String getInvoiceName() {
		return invoiceName;
	}
	
	/**
	 * @param invoiceName the invoiceName to set
	 */
	public synchronized void setInvoiceName(String invoiceName) {
		this.invoiceName = invoiceName;
	}
}

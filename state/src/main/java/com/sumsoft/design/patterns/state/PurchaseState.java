package com.sumsoft.design.patterns.state;

/*
 * @author Sumith Puri
 */
public class PurchaseState implements State {

	OnlineShopping shopping;
	
	public PurchaseState(OnlineShopping shopping) {
		this.shopping = shopping;
	}
	
	@Override
	public void assemble() {
		System.out.println("Cannot Assemble Unless Authorised");
		
	}

	@Override
	public void authorise() {
		System.out.print("-> Authorise");
		shopping.setCurrentState(shopping.getAuthoriseState());
		
	}

	@Override
	public void dispatch() {
		System.out.println("Cannot Dispatch Unless Authorised");
		
	}

	@Override
	public void purchase() {
		System.out.println("Already Purchased");
		
	}

	@Override
	public void complete() {
		System.out.println("-> Complete");
		shopping.setCurrentState(shopping.getSelectionState());		
	}

}

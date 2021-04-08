package com.sumsoft.design.patterns.state;

/*
 * @author Sumith Puri
 */
public class AuthoriseState implements State {

	OnlineShopping shopping;
	
	public AuthoriseState(OnlineShopping shopping) {
		this.shopping = shopping;
	}
	
	@Override
	public void assemble() {
		System.out.print("-> Assemble");
		shopping.setCurrentState(shopping.getAssembleState());
		
	}

	@Override
	public void authorise() {
		System.out.println("Already Authorised");
		
	}

	@Override
	public void dispatch() {
		System.out.print("-> Dispatch");
		shopping.setCurrentState(shopping.getDispatchState());
		
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

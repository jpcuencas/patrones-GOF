package com.sumsoft.design.patterns.state;

/*
 * @author Sumith Puri
 */
public class DispatchState implements State {

	OnlineShopping shopping;
	
	public DispatchState(OnlineShopping shopping) {
		this.shopping = shopping;
	}
	
	@Override
	public void assemble() {
		System.out.println("Already Assembled");
		
	}

	@Override
	public void authorise() {
		System.out.println("Already Authorised");
		
	}

	@Override
	public void dispatch() {
		System.out.println("Already Dispatched");
		
	}

	@Override
	public void purchase() {
		System.out.println("Already Purchased");
		
	}
	
	public void complete() {
		System.out.println("-> Back to Selection");
		shopping.setSelectionState(shopping.getSelectionState());
	}

	
}

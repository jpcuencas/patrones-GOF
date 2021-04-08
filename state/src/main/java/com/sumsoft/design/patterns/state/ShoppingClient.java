package com.sumsoft.design.patterns.state;

/*
 * @author Sumith Puri
 */
public class ShoppingClient {

	public static void main(String args[]) {
		OnlineShopping shopping = new OnlineShopping();
		shopping.purchase("Sony Cam X100");
		shopping.dispatch();
		shopping.assemble();
		shopping.complete();
		
		
		shopping.purchase("Freeview G951");
		shopping.authorise();
		shopping.assemble();
		shopping.dispatch();
		shopping.complete();
		
		
		shopping.purchase("PlugPlay Cord");
		shopping.authorise();
		shopping.dispatch();
		shopping.complete();
		
		
		shopping.purchase("AgeOfEmpires CD");
		shopping.authorise();
		shopping.authorise();
		shopping.dispatch();
		shopping.complete();
	}
}

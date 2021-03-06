package com.sumsoft.design.patterns.observer;

/*
 * @author Sumith Puri
 */
public class InvestmentHandler implements Observer {

	Subject stockData = null;
	
	public InvestmentHandler(Subject stockData) {
		this.stockData = stockData;
		stockData.addObserver(this);
	}
	
	@Override
	public void update(String stockSymbol, Float stockValue, Integer stockUnits) {
		System.out.println("InvestmentHandler received changes... ");
	}

}

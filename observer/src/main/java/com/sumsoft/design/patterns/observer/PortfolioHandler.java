package com.sumsoft.design.patterns.observer;

/*
 * @author Sumith Puri
 */
public class PortfolioHandler implements Observer {

	Subject stockData = null;
	
	public PortfolioHandler(Subject stockData) {
		this.stockData = stockData;
		stockData.addObserver(this);
	}
	
	@Override
	public void update(String stockSymbol, Float stockValue, Integer stockUnits) {
		System.out.println("PortfolioHandler received changes... ");
	}

}

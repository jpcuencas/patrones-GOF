package com.sumsoft.design.patterns.observer;

/*
 * @author Sumith Puri
 */
public interface Observer {
	
	public void update(String stockSymbol, Float stockValue, Integer stockUnits);
    
}

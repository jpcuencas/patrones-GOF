package com.sumsoft.design.patterns.decorator;

/*
 * @author Sumith Puri
 */
public class Italian extends Pizza {

	public Italian(String description) {
		this.description = description  + ", Italian";
	}
	
	@Override
	public double cost() {
		
		return 1.20;
	}

}

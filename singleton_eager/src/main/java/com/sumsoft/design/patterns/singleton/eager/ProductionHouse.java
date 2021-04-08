package com.sumsoft.design.patterns.singleton.eager;

/*
 * @author Sumith Puri
 */
public class ProductionHouse {
	
	private static ProductionHouse productionHouse = new ProductionHouse();
	
	private ProductionHouse() {
		
	}
	
	public static synchronized ProductionHouse getInstance() {
		
		return productionHouse;
	} 
}

package com.sumsoft.design.patterns.singleton.threadsafe;

/*
 * @author Sumith Puri
 */
public class ProductionHouse {
	
	private static ProductionHouse productionHouse = null;
	
	private ProductionHouse() {
		
	}
	
	public static synchronized ProductionHouse getInstance() {
		
		if(productionHouse == null) {
			productionHouse = new ProductionHouse();
		}
		
		return productionHouse;
	} 
}

package com.sumsoft.design.patterns.singleton.doublechecked;

/*
 * @author Sumith Puri
 */
public class ProductionHouse {
	
	private static ProductionHouse productionHouse = null;
	
	private ProductionHouse() {
		
	}
	
	public static ProductionHouse getInstance() {
		
		if(productionHouse == null) {
			synchronized(ProductionHouse.class) {
				if(productionHouse == null) {
					productionHouse = new ProductionHouse();		
				}
			}
		}
		
		return productionHouse;
	} 
}

package com.sumsoft.design.patterns.factory.abstract_;

/*
 * @author Sumith Puri
 */
public class NokiaStore extends MobileStore {

	@Override
	protected Mobile createMobile(String make) {
		Mobile mobile = null;
		
		if(make.equals("ASeries")) {
			mobile = new NokiaASeries();
		} else if(make.equals("BSeries")) {
			mobile = new NokiaBSeries();
		} else if(make.equals("CSeries")) {
			mobile = new NokiaCSeries();
		}
		
		return mobile;
	}
}

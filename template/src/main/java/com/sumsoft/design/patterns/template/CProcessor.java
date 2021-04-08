package com.sumsoft.design.patterns.template;

/*
 * @author Sumith Puri
 */
public class CProcessor extends SoftwareProcessor {

	@Override
	public void implementModules() {
		System.out.println("C Implementation by C Engineers");
		
	}

	@Override
	public boolean isPlatformIndependent() {
		return false;
	}
	
	@Override
	public void platformTest() {
		System.out.println("C Platform Testing by Platform Engineers");
		
	}

	@Override
	public void testModules() {
		System.out.println("C Testing by QA");
		
	}
	

}

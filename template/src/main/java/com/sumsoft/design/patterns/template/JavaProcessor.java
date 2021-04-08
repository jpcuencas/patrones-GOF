package com.sumsoft.design.patterns.template;

/*
 * @author Sumith Puri
 */
public class JavaProcessor extends SoftwareProcessor {

	@Override
	public void implementModules() {
		System.out.println("Java Implementation by Java Engineers");
		
	}

	@Override
	public boolean isPlatformIndependent() {
		return true;
	}
	
	@Override
	public void platformTest() {
		System.out.println("Java is Platform Independent!");
		
	}

	@Override
	public void testModules() {
		System.out.println("Java Testing by Java CoE QA");
		
	}
}

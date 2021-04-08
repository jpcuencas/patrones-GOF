package com.sumsoft.design.patterns.template;

/*
 * @author Sumith Puri
 */
public class SoftwareConsultants {

	public static void main(String args[]) {
		
		SoftwareProcessor softwareProcessor01 = new CProcessor();
		softwareProcessor01.deliverSoftware();
		
		SoftwareProcessor softwareProcessor02 = new JavaProcessor();
		softwareProcessor02.deliverSoftware();
	}
}

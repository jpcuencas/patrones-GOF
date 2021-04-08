package com.sumsoft.design.patterns.adapter;

/*
 * @author Sumith Puri
 */
public class PCAssembler {

	public static void main(String args[]) {
		System.out.println("Testing Concrete Implementation...");
		
		Computer computer = new SamsungComputer();
		performOperation(computer);
		
		System.out.println("Testing Adapter Implementation...");
		
		computer = new SeagateAdapter(new SeagateDrive());
		performOperation(computer);
	}
	
	public static void performOperation(Computer computer) {
		computer.bufferData();
		computer.flushData();
		computer.purgeData();
	}
}

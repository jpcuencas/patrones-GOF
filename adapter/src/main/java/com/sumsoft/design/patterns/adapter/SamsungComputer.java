package com.sumsoft.design.patterns.adapter;

/*
 * @author Sumith Puri
 */
public class SamsungComputer implements Computer {

	@Override
	public void bufferData() {
		System.out.println("Samsung PC ready to read...");

	}

	@Override
	public void flushData() {
		System.out.println("Samsung PC ready to write...");

	}

	@Override
	public void purgeData() {
		System.out.println("Samsung PC ready to purge...");

	}

}

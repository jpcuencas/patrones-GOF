package com.sumsoft.design.patterns.adapter;

/*
 * @author Sumith Puri
 */
public class SeagateDrive implements SeagateGeneric {

	@Override
	public void read() {
		System.out.println("Reading @ 7200 RPM from Seagate B Series");

	}

	@Override
	public void write() {
		System.out.println("Writing @ 1 Mbps to Seagate B Series");

	}

}

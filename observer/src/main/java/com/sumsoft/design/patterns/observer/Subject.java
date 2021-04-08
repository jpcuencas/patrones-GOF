package com.sumsoft.design.patterns.observer;

/*
 * @author Sumith Puri
 */
public interface Subject {

	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}

package com.design.mode.adapter;

public class Adapter extends Target {
	private Adaptee adaptee = new Adaptee();

	public void Request() {
		adaptee.SpecificRequest();
	}
}

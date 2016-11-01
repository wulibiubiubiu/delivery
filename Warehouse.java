package com.hy;

import java.io.Serializable;

public class Warehouse implements Serializable{
	
	private static final long serialVersionUID = -2625796231575925651L;
	
	private int a;
	private int b;
	private int c;
	private int distance;
	private int priority;
	
	public Warehouse(int a, int b, int c, int priority,int distance) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.priority = priority;
		this.setDistance(distance);
	}

	public Warehouse() {
		super();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
}

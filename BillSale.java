package com.hy;

/**
 * ³ö»õµ¥
 * @author 
 */
public class BillSale {
	private int dh;
	private String name;
	private int num;
	private String warehouse;
	
	public BillSale() {
		super();
	}
	
	public BillSale(int dh, String name, int num, String warehouse) {
		super();
		this.dh = dh;
		this.name = name;
		this.num = num;
		this.warehouse = warehouse;
	}
	public int getDh() {
		return dh;
	}
	public void setDh(int dh) {
		this.dh = dh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
}

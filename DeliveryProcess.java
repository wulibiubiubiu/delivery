package com.hy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 发货处理
 * @author 
 */
public class DeliveryProcess {
	
	/**
	 * 三个仓库
	 */
	Warehouse warehouseA = new Warehouse(1,2,2,1,1);
	Warehouse warehouseB = new Warehouse(2,1,2,2,2);
	Warehouse warehouseC = new Warehouse(1,3,1,3,2);
	
	public void process(String type,int num){
		
		List<Warehouse> warehouses = new ArrayList<Warehouse>();
		warehouses.add(warehouseA);
		warehouses.add(warehouseB);
		warehouses.add(warehouseC);
		if(type.equals("a")){
			Collections.sort(warehouses, new Comparator<Warehouse>() {
				@Override
				public int compare(Warehouse w1, Warehouse w2) {
					return w1.getA() - w2.getA();
				}
			});
		}else if(type.equals("b")){
			Collections.sort(warehouses, new Comparator<Warehouse>() {
				@Override
				public int compare(Warehouse w1, Warehouse w2) {
					return w1.getB() - w2.getB();
				}
			});
		}else if(type.equals("c")){
			Collections.sort(warehouses, new Comparator<Warehouse>() {
				@Override
				public int compare(Warehouse w1, Warehouse w2) {
					return w1.getB() - w2.getB();
				}
			});
		}
		
		for(int i = 0;i < warehouses.size();i++){
			Warehouse w1 = warehouses.get(i);
			if(type.equals("a")){
				
			}else if(type.equals("b")){
				
			}else if(type.equals("c")){
				
			}
		}
		
	}
}

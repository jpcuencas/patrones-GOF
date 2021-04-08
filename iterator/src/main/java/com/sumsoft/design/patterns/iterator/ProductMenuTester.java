package com.sumsoft.design.patterns.iterator;

/*
 * @author Sumith Puri
 */
public class ProductMenuTester {

	public static void main(String args[]) {
		
		ProductMenu productMenu = new ProductMenu(4);
		productMenu.addReplaceItem(0, new ProductItem(new Integer(100), new String("Hammer"), new Double("2.00")));
		productMenu.addReplaceItem(1, new ProductItem(new Integer(101), new String("Chisel"), new Double("1.60")));
		productMenu.addReplaceItem(2, new ProductItem(new Integer(102), new String("Plier"), new Double("2.40")));
		productMenu.addReplaceItem(3, new ProductItem(new Integer(103), new String("Hacksaw"), new Double("2.70")));
		
		Iterator it = productMenu.createIterator();
		
		while(it.hasNext()) {
			ProductItem productItem = (ProductItem) it.next();
			System.out.println(productItem.getProductId() + ":" + productItem.getProductName() + ":" + productItem.getProductCost());
		}
	}
}

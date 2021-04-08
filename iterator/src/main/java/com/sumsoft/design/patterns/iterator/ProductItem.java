package com.sumsoft.design.patterns.iterator;

/*
 * @author Sumith Puri
 */
public class ProductItem {

	public Integer productId;
	public String productName;
	public Double productCost;
	
	public ProductItem(Integer productId, String productName, Double productCost) {
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}
	
	/**
	 * @return the productId
	 */
	public synchronized Integer getProductId() {
		return productId;
	}
	
	/**
	 * @param productId the productId to set
	 */
	public synchronized void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	/**
	 * @return the productName
	 */
	public synchronized String getProductName() {
		return productName;
	}
	
	/**
	 * @param productName the productName to set
	 */
	public synchronized void setProductName(String productName) {
		this.productName = productName;
	}
	
	/**
	 * @return the productCost
	 */
	public synchronized Double getProductCost() {
		return productCost;
	}
	
	/**
	 * @param productCost the productCost to set
	 */
	public synchronized void setProductCost(Double productCost) {
		this.productCost = productCost;
	}
}

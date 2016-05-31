package com.gaurav.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ProductDetail")
@XmlType(propOrder={"name", "sku", "price"})
public class Product {
	private String sku;
	private String name;
	private double price;
	
	public Product(String sku, String name, double price){
		this.sku = sku;
		this.name = name;
		this.price = price;
	}
	
	public Product(){
	}
	
	@XmlElement(name="ProductSku")
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}
	@XmlElement(name="ProductName")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@XmlElement(name="ProductPrice")
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [sku=" + sku + ", name=" + name + ", price=" + price + "]";
	}
	
}

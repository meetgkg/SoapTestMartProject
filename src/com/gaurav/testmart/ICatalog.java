package com.gaurav.testmart;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.gaurav.model.Product;

@WebService(name="TestCatalog", targetNamespace="http://www.testcatalog.com")
public interface ICatalog {
	
	@WebMethod
	public abstract List<String> getProductCategories();
	
	@WebMethod
	public abstract List<String> getProducts(String category);
	
	@WebMethod
	public abstract List<String> addProduct(String category, String product);
	
	@WebMethod
	public abstract List<Product> getProductsv2(String category);

}
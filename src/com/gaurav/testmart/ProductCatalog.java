package com.gaurav.testmart;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.gaurav.business.ProductServiceImpl;
import com.gaurav.model.Product;

@WebService(name="TestMartCatalog", portName="TestMartCatalogPort", serviceName="TestMartCatalogService", targetNamespace="http://www.testmart.com")
public class ProductCatalog { 
	ProductServiceImpl service = new ProductServiceImpl();
	
	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public List<String> getProductCategories(){
		return service.getProductCategories();
	}
	
	@WebMethod()
	public List<String> getProducts(String category){
		return service.getProducts(category);
	}
	
	@WebMethod()
	public List<String> addProduct(String category, String product){
		return service.addProduct(category, product);
	}
	
	@WebMethod()
	public List<Product> getProductsv2(String category){
		return service.getProductsv2(category);
	}

}

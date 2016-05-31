package com.gaurav.testmart;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.gaurav.business.ProductServiceImpl;
import com.gaurav.model.Product;

@WebService(endpointInterface="com.gaurav.testmart.ICatalog", portName="TestCatalogPort", serviceName="TestCatalogService")
public class Catalog implements ICatalog { 
	ProductServiceImpl service = new ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see com.gaurav.testmart.ICatalog#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories(){
		return service.getProductCategories();
	}
	
	/* (non-Javadoc)
	 * @see com.gaurav.testmart.ICatalog#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category){
		return service.getProducts(category);
	}
	
	/* (non-Javadoc)
	 * @see com.gaurav.testmart.ICatalog#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public List<String> addProduct(String category, String product){
		return service.addProduct(category, product);
	}
	
	/* (non-Javadoc)
	 * @see com.gaurav.testmart.ICatalog#getProductsv2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsv2(String category){
		return service.getProductsv2(category);
	}

}

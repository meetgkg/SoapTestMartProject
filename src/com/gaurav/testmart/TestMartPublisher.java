package com.gaurav.testmart;

import javax.xml.ws.Endpoint;

public class TestMartPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:2345/ProductCatalog", new Catalog());
	}

}

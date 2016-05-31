package com.gaurav.business;

import java.util.ArrayList;
import java.util.List;

import com.gaurav.model.Product;

public class ProductServiceImpl {
	
	List<String> moviesList = new ArrayList<String>();
	List<String> booksList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	
	public ProductServiceImpl(){
		moviesList.add("Shawshank Redemption");
		moviesList.add("The Godfather");
		moviesList.add("Mission Impossible");
		
		booksList.add("Inferno");
		booksList.add("Joyland");
		booksList.add("Game of Thrones");
		
		musicList.add("Arijit Singhs");
		musicList.add("Kumar Sanu");
		musicList.add("Kailash Kher");
	}
	
	public List<String> getProducts(String category){
		switch(category){
		case "Books":
			return booksList;
		case "Movies":
			return moviesList;
		case "Music":
			return musicList;
		}
		return new ArrayList<String>();
	}
	
	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<String>();
		categories.add("Movies");
		categories.add("Books");
		categories.add("Music");
		return categories;
	}

	public List<String> addProduct(String category, String product) {
		switch(category){
		case "Books":
			booksList.add(product);
		case "Movies":
			moviesList.add(product);
		case "Music":
			musicList.add(product);
		}
		return new ArrayList<String>();
	}
	
	public List<Product> getProductsv2(String category){
		List<Product> list = new ArrayList<Product>();
		list.add(new Product("1001", "Spring In Action", 30.99));
		list.add(new Product("1002", "Big Data for Summies", 40.99));
		return list;
	}

}

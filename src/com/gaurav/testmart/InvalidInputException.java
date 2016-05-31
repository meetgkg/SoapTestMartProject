package com.gaurav.testmart;

public class InvalidInputException extends Exception {
	private String errorDetails;
	public InvalidInputException(String reason, String errorDetails){
		super(reason);
		this.errorDetails=errorDetails;
	}
	public String getFaultInfo(){
		return this.errorDetails;
	}
}

package com.yash.exception.customise.exception;


public class ResultException extends RuntimeException{
	
	String msg;
	
	public ResultException(String msg) {
		
		super(msg);
		
		
	}

}

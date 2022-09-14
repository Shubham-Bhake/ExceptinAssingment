package com.yash.exception.chaining;

public class ApplicationException extends Exception {
	
	 public ApplicationException(Exception e) {          
	      super(e);
	   }

}

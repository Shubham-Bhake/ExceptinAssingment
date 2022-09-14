package com.yash.exception.chaining;

public class ChainException {
	public static void main(String[] args) {
	      try {
	         test();
	      }catch(ApplicationException e) {          
	         System.out.println(e.getMessage());
	      }
	   }  

	   public static void test() throws ApplicationException {
	      try {
	         int a = 0;
	         int b = 100;
	         System.out.println(b/a);
	      }catch(Exception e) {
	         throw new ApplicationException(e);
	      }
	   }
	}



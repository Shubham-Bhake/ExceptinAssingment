package com.yash.exception.password;

public class TestPassword {
	
	static Password pass=new Password();
	
	public static void main(String[] args)
    {
 
        String password1 = "ShubhamBhake@17";
 
        if (pass.isValid(password1)) {
            System.out.println(password1 + " - Valid Password");
        }
        else {
            System.out.println(password1 + " - Invalid Password!");
        }
 
        String password2 = "Shubhamb";
        if (pass.isValid(password2)) {
            System.out.println(password2 + " - Valid Password");
        }
        else {
            System.out.println(password2 + " - Invalid Password!");
        }
    }
	

}

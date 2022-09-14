package com.yash.exception.tryresourceexample;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		
		try( FileOutputStream fos=new FileOutputStream("D:/Notes/ExceptionPractise/tryResource")){
			
			String mymsg="EkDinHongeKambiyab";
			byte bytAarray[]=mymsg.getBytes();
			fos.write(bytAarray);
			System.out.println("data stored to textS");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			System.out.println("finaly block excecutes");
		
	}
	
		
		
	}
}

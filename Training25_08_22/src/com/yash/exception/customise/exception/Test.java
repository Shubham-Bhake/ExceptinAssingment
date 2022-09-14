package com.yash.exception.customise.exception;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		Student s = new Student();
		System.out.println("Enter student rollNo:");
		Integer rollno = sc.nextInt();
		s.setRollno(rollno);
		System.out.println("Enter student name:");
		String sname = sc.next();
		s.setSname(sname);
		System.out.println("Enter student address:");
		String sAddr = sc.next();
		s.setSaddress(sAddr);


		StudentResult sr = new StudentResult();
		System.out.println("Enter math marks:");
		Integer mathMrks = sc.nextInt();
		sr.setMathMrks(mathMrks);
		System.out.println("Enter Physics marks :");
		Integer PhyscMrks = sc.nextInt();
		sr.setPhyscicsMrks(PhyscMrks);
		System.out.println("Enter Chemistry marks :");
		Integer ChemMrks = sc.nextInt();
		sr.setChemMrks(ChemMrks);
		
		s.setSrobj(sr);
		
		int total=(mathMrks+PhyscMrks+ChemMrks)*100;
		int avg=total/300;
		System.out.println("Avg:"+avg);
		try{
			
		if(mathMrks <0)
		{
			throw new ResultException("Negative marks not allowed");
		}else if(PhyscMrks<0)
		{
			throw new ResultException("Negative marks not allowed");
		}else
		{
	
		}if(avg < 40)
		{
			throw new ResultException("Student failed");
		}else
		{
			System.out.println("student passed");
		}
		
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}

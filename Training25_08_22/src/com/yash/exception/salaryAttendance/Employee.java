package com.yash.exception.salaryAttendance;

import java.util.Scanner;

public class Employee {


	   public static void main(String[] args) {
	         int sal=500;
	        int count=0;
	        int temp=0;
	        int val=0;
	        int num=0;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the size of array");
	        int size=sc.nextInt();
	        String presentDay[]=new String[size];
	        System.out.println("Enter"+" "+size+" "+"Element");
	        for(int i=0;i<presentDay.length;i++)
	        {
	            presentDay[i]=sc.nextLine();
	        }
	        
	        for(int j=0;j<presentDay.length;j++)
	        {
	            System.out.println(presentDay[j]);
	            
	              if(presentDay[j]=="P")
	              {
	                  count++;
	              } else if(presentDay[j]=="L")
	              {
	                  temp++;
	                  }
	              else if(presentDay[j]=="A")
	              {
	                  val++;
	                  } else if(presentDay[j]=="N")
	                  {
	                      num++;
	                      }
	              } if(temp>2)
	              {
	                  try
	                  {
	                      throw new
	              LeaveExceedLimit("You have exceeded the maximum number of leave");
	             }catch(Exception e)
	                  {
	                 System.out.println(e);
	                 }
	                  } else if(num>4)
	                  {
	                      try
	                  {
	                      throw new
	              EmployeeAbscondingException("You are Absconded");
	                      }catch(Exception e)
	                      {
	              System.out.println(e);
	              }
	             
	        }else {
	            System.out.println(sal*count);
	        }
	              System.out.println(count);
	    }
}

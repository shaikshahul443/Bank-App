package com.pack1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Bank 
{
	  static double balance = 0;
	  static String name;
	  
	  public static void main(String[] args) throws InterruptedException
	  {
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    int option = 0;
	    
	    System.out.println("/ / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /");
	    Thread.sleep(500);
	    System.out.println("/ /                                                                           / /");
	    Thread.sleep(500);
	    System.out.println("/ /                    Welcome to the STATE BANK OF INDIA!                    / /");
	    Thread.sleep(500);
	    System.out.println("/ /                                                                           / /");
	    Thread.sleep(500);
	    System.out.println("/ / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /");
	    System.out.println("                                                          Date :"+ LocalDate.now());
	    System.out.println("                                                          Time :"+ LocalTime.now());
	    Thread.sleep(500);
	    System.out.print('L');
	    Thread.sleep(500);
	    System.out.print('O');
	    Thread.sleep(500);
	    System.out.print('A');
	    Thread.sleep(500);
	    System.out.print('D');
	    Thread.sleep(500);
	    System.out.print('I');
	    Thread.sleep(500);
	    System.out.print('N');
	    Thread.sleep(500);
	    System.out.print('G');
	    Thread.sleep(500);
	    System.out.print('.');
	    Thread.sleep(500);
	    System.out.print('.');
	    Thread.sleep(500);
	    System.out.print('.');
	    System.out.println();
	    System.out.println("Insert your ATM card");
	    System.out.println("Enter your name ===>");
	    name=sc.nextLine();
	    while(true) 
	    {
	    System.out.println("******Please Enter your PIN number******");
	    int pin = sc.nextInt();
	    int[] al= {1234,2345,3456,4567};
	    if((int)al[0]==pin || (int)al[1]==pin || (int)al[2]==pin || (int)al[3]==pin)
	    {
	    	System.out.println("/ / / / / /  welcome "+name+"/ / / / / /");	   
	    while (option != 4) 
	    {
	      System.out.println("please choose a option");
	      System.out.println("1. Check Balance");
	      System.out.println("2. Deposit");
	      System.out.println("3. Withdraw");
	      System.out.println("4. Exit");
	      
	      System.out.println("Enter an option: ");
	      option = sc.nextInt();
	      switch (option) 
	      {
	        case 1:
	          checkBalance();
	          break;
	        case 2:
	          deposit();
	          break;
	        case 3:
	          withdraw();
	          break;
	        case 4:
	          exit();
	          break;
	        default:
	          System.out.println("Invalid option. Try again.");
	          break;
	      }
	    }
	  }
	    else
	    {    	
	    	System.out.println("please Enter a valid Pin number!!!!");
	    }
	    }
	  }
	  public static void checkBalance() 
	  {
	    System.out.println(name+" Your current balance is $" + balance+"\n");
	  }
	  public static void deposit() 
	  {
	    Scanner sc = new Scanner(System.in);
	    System.out.print(name+" Enter the amount to deposit: $");
	    double amount = sc.nextDouble();
	    balance += amount;
	    System.out.println("$" + amount + " has been deposited to your account.");
	    checkBalance();
	  }
	  public static void withdraw() 
	  {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the amount to withdraw: $");
	    double amount = sc.nextDouble();
	    if (amount > balance) 
	    {
	      System.out.println("Insufficient funds.");
	    } else 
	    {
	      balance -= amount;
	      System.out.println("$" + amount + " has been withdrawn from your account.");
	    }
	    checkBalance();
	  }
	  public static void exit() 
	  {
	    System.out.println("Thank you for banking with us "+name+". Have a great day!");
	  }	  
}

package bank_pack;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class Bank
{         static Scanner sc=new Scanner(System.in);
		  static double balance = 0;
		  static String name;
		  static int pin =0;
		  public static void main(String[] args) throws InterruptedException
		  {
			  	System.out.println("/ / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / ");
			    System.out.println("/ /                                                                         📶/ /");
			    System.out.println("/ /           🏧 Welcome to the STATE BANK OF INDIA! 🏧             	      / /");
			    System.out.println("/ /                                                                           / /");
			    System.out.println("/ / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /");
			    System.out.println("                                                          Date :"+ LocalDate.now());
			    System.out.println("                                                          Time :"+ LocalTime.now());
			    System.out.print('L');
			    System.out.print('O');
			    System.out.print('A');
			    System.out.print('D');
			    System.out.print('I');
			    System.out.print('N');
			    System.out.print('G');
			    Thread.sleep(500);
			    System.out.print("█");
			    Thread.sleep(500);
			    System.out.print("█");
			    Thread.sleep(500);
			    System.out.print("█");
			    Thread.sleep(500);
			    System.out.print("█");
			    Thread.sleep(500);
			    System.out.print("██");
			    Thread.sleep(500);
			    System.out.print("██100%");
			    System.out.println();
			    System.out.println("Insert your ATM card 💳");
			    System.out.println("Enter your name ===>");
			    name=sc.nextLine();
			    int option = 0;
			    System.out.println("***Please Enter your PIN number***"+"\n");
			    pin =sc.nextInt();
		
		   
		    System.out.println("You have not entered a 4-digit pin");
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
		          System.out.println("Invalid option.Please Try Again.");
		          break;
		      }//end switch
		    }//end while loop
		    }//end if loop
		    
		    
		    else
		    {	System.out.println("please Enter a valid Pin number!!!!");
		        System.out.println("your account locked for 30 seconds...");
		    	Thread.sleep(10000);
		    	main(null);
		    	
		        }
		    }// while loop end
		  
		  public static void checkBalance() 
		  {
		    System.out.println(name+" Your current balance is $" + balance+"\n");
		  }

		  public static void deposit() 
		  {
		    @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
		    System.out.print(name+" Enter the amount to deposit: $ "); //\u20B9 for rupees
		    double amount = sc.nextDouble();
		    balance += amount;
		    System.out.println("$" + amount + " has been deposited to your account.");
		    checkBalance();
		  }
		  public static void withdraw() 
		  {
		    @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
		    System.out.print("Enter the amount to withdraw: $");
		    double amount = sc.nextDouble();
		    if (amount > balance) 
		    {
		      System.out.println("Insufficient funds. 🤷‍♂️🤷‍♂️🤷‍♂️");
		    } else 
		    {
		      balance -= amount;
		      System.out.println("$" + amount + " has been withdrawn from your account.");
		    }
		    checkBalance();	   
		  }
		  public static void exit() 
		  {
		    System.out.println("★★★★★ 🙏🏻🙏🏻🙏🏻  Thank you for banking with us "+name+". Have a great day! 🙏🏻🙏🏻🙏🏻 ★★★★★");

		    System.exit(0);
		  }
}



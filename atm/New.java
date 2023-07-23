package atm;

import java.util.ArrayList;
import java.util.Scanner;

public class New extends Customer {
	
	

	Scanner input = new Scanner(System.in);
	
	public static Customer collect(Scanner input, ArrayList<Customer> customers) {
		
		boolean young = false;
		String phone = null;
	    
	    Customer newuser = new Customer();

	    System.out.println("Please enter your name:");
	    String name = input.nextLine();

	    System.out.println("Please enter your age:");
	    int age = input.nextInt();
	    input.nextLine(); 
	    if(age < 18 ) {
	    	
	    	System.out.println("Too young to have a bank account");
	    	Shared.acc="Young";
	    	return null;
	    }
	    
	    boolean number = false;

	    while(!number) {
	        System.out.println("Please enter your phone number: ");
	        phone = input.nextLine();

	        boolean found = false;

	        for (Customer customer : customers) {
	            
	            if(phone.equals(customer.getPhone())) {
	                System.out.println("Phone number already used. Please enter a different phone number.");
	                found = true;
	                break;
	            }
	        }

	        if(!found) {
	            number = true;
	        }
	    }


	    	
	    	
	   
	    System.out.println("Please enter your address:");
	    String address = input.nextLine();

	    System.out.println("Please enter your gender:");
	    String gender = input.nextLine();

	    System.out.println("Please enter your nationality:");
	    String nationality = input.nextLine();
	    while(true) {
	    System.out.println("Please enter your pin from 4 numbers:");
	   int pin1 = input.nextInt();
	    input.nextLine();
	    if( pin1 > 9999) {
			   System.out.println("Pin is larger than 4 numbers. Try again");
			   continue;
		   }
		   if(pin1<1000) {
			   System.out.println("Pin is smaller than 4 numbers. Try again");
			   continue;
		   }
		    newuser.setPin(pin1);
		    break;
		    }
	   
	    System.out.println("Please enter your first security question: ");
	    String security1 = input.nextLine();
	    newuser.setSecurity1(security1);
	    System.out.println("Pleas enter your answer for the first security questions: ");
	    String security1a = input.nextLine();
	    newuser.setSecuritya1(security1a);
	    System.out.println("Please enter your second security question: ");
	    String security2 = input.nextLine();
	    newuser.setSecurity2(security2);
	    System.out.println("Pleas enter your answer for the second security questions: ");
	    String security2a = input.nextLine();
	    newuser.setSecuritya2(security2a);
	   
	    System.out.println("Please enter your balance in your main account:");
	    System.out.println("If you don't have a main account, please enter a negative number:");
	    double main = input.nextDouble();
	    input.nextLine(); 

	    System.out.println("Please enter your balance in your saving account:");
	    System.out.println("If you don't have a saving account, please enter a negative number:");
	    double saving = input.nextDouble();
	    input.nextLine(); 

	    System.out.println("Please enter your balance in your investment account:");
	    System.out.println("If you don't have an investment account, please enter a negative number:");
	    double investment = input.nextDouble();
	    input.nextLine(); 

	    System.out.println("Please enter how many accounts you have:");
	    int accounts = input.nextInt();
	    input.nextLine(); 

	    
	    newuser.setName(name);
	    newuser.setAge(age);
	    newuser.setAccounts(accounts);
	    newuser.setSaving(saving);
	    newuser.setMain(main);
	    newuser.setInvestment(investment);
	    newuser.setAddress(address);
	    newuser.setGender(gender);
	    newuser.setNation(nationality);
	    newuser.setPhone(phone);
	    
	    return newuser;
	}

	

}

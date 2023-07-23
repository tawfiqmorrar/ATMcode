package atm;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInfo extends Customer {
	
	
	public  static void info(String name, ArrayList<Customer> customers, Scanner input) {
		
		for (Customer customer : customers) {
            if ( name.equalsIgnoreCase(customer.getName())) {
                System.out.println("The user info for " + name + " is: ");
                System.out.println("Name: " + customer.getName());
                System.out.println("Phone Number: "+customer.getPhone());
                System.out.println("Gender: " + customer.getGender());
                System.out.println("Age: " + customer.getAge());
                System.out.println("Accounts: " + customer.getAccounts());
                System.out.println("Address: " + customer.getAddress());
                if(customer.getMain() > 0)
                	System.out.println("Main account balance:"+ customer.getMain());
                else 
                	System.out.println("You dont have a main account");
                if(customer.getSaving() > 0)
                	System.out.println("Saving account balance:"+ customer.getSaving());
                else 
                	System.out.println("You dont have a saving account");
                if(customer.getInvestment() > 0)
                	System.out.println("Investment account balance:"+ customer.getInvestment());
                else 
                	System.out.println("You dont have an investment account account");
                
                return;
		
		
		
		
		
	}
}
}
}
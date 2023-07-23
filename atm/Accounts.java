package atm;

import java.util.ArrayList;
import java.util.Scanner;



public class Accounts extends Customer {
	
	Scanner input1 = new Scanner(System.in);
	
	public static  String accounts(String name, ArrayList<Customer> customers, Scanner input1) {
		
		
		
		char choice;
		
		for (Customer customer : customers) {
			
			
				
			
			if (name.equalsIgnoreCase(customer.getName())) {
				
				System.out.println("Please choose an account: ");
				System.out.println("M for Main account:");
				System.out.println("S for Saving account:");
				System.out.println("I for Investment account:");
				choice = input1.nextLine().charAt(0);
				
				switch (choice) {
				
				case 'M':
					
					if(customer.getMain() < 0) {
						System.out.println("You dont have a Main account");
						return Shared.acc;
					}
						
					else {
						
						return Shared.acc="Main";
					}
				case 'S':
					
					if(customer.getSaving() < 0) {
						System.out.println("You dont have a Saving account");
						return Shared.acc;
					}
					else {
						Shared.acc = "Saving";
						
						
						
						return Shared.acc = "Saving";
					}
				case 'I':
					if(customer.getInvestment() < 0) {
						System.out.println("You dont have an Investment account");
						return Shared.acc;
					}
					else {
						Shared.acc = "Investment";
						
						
					
						return Shared.acc = "Investment";
					}
				
				}
				}
				
				
				
				
			}
			
			
			
			
		
	return Shared.acc = "Main";	
	}	

}

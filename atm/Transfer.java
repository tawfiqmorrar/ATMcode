package atm;

import java.util.ArrayList;
import java.util.Scanner;
public class Transfer  extends Customer {

	
	public static void transfer(String name, ArrayList<Customer> customers) {
		
		Scanner input = new Scanner(System.in);
		
		boolean correct=false;
		 
		double temp;
		
		String acctrans;
		
		String account;
		
		Customer to = null;
		
		double transfer;
	 
		Customer sender = null;
		for (Customer c : customers) {
	        if (name.equals(c.getName())) {
	            sender = c;
	            break;
	            
	        }
	        
	    }
		
		System.out.println("Please enter the name you want to transfer for: ");
		acctrans = input.nextLine();
		
for (Customer c : customers) {
            
			if (acctrans.equals(c.getName())) {
				
					
					System.out.println("Customer name is correct");
					correct = true;
					to = c;
					break;
			}
}
		if(correct == false ) {
			System.out.println("No customer by this name: "+ acctrans);
		
			return;
		}

		System.out.println("From which account do you want to transfer: ");
		account = input.nextLine();
		if(account.equalsIgnoreCase("main") && sender.getMain() < 0) {
			System.out.println("You dont have a main account ");
			return;
		}
		if(account.equalsIgnoreCase("saving") && sender.getSaving() < 0) {
			System.out.println("You dont have a saving account ");
			return;
		}
		
		if(account.equalsIgnoreCase("investment") && sender.getInvestment() < 0) {
			System.out.println("You dont have an Investment account ");
			return;
		}
		
		
		
		
		
		
		while(true) {
			
			System.out.println("How much do you want to transfer and to which account: ");
			transfer = input.nextDouble();
			input.nextLine();
		
		
		if(account.equalsIgnoreCase("main") && transfer > sender.getMain() ) {
			
			System.out.println("Insuffcient balance. Please try a different amount");
			continue;
			
		}
		
		if(account.equalsIgnoreCase("Main")) {
			temp = sender.getMain();
			sender.setMain(sender.getMain() - transfer);
			to.setMain(to.getMain()+transfer);
			System.out.println("Transfer successfully");
			System.out.println("your balance before the transfer is: "+temp);
			System.out.println("your balance after the transfer is: "+sender.getMain());
			return;
		}
			
if(account.equalsIgnoreCase("Saving") && transfer > sender.getSaving() ) {
			
			System.out.println("Insuffcient balance. Please try a different amount");
			continue;
			
		}
		
		if(account.equalsIgnoreCase("Saving")) {
			temp=sender.getSaving();
			
			sender.setSaving(sender.getSaving() - transfer);
			to.setMain(to.getMain() + transfer);
			System.out.println("Transfer successfully");
		System.out.println("your balance before the transfer is: "+temp);
		System.out.println("your balance after the transfer is: "+sender.getSaving());
			return;
		}
		
if(account.equalsIgnoreCase("Investment") && transfer > sender.getInvestment() ) {
			
			System.out.println("Insuffcient balance. Please try a different amount");
			continue;
			
		}
		
		if(account.equalsIgnoreCase("Investment")) {
			temp = sender.getInvestment();
			sender.setInvestment(sender.getInvestment() - transfer);
			to.setMain(to.getMain() + transfer);
			System.out.println("Transfer successfully");
			System.out.println("your balance before the transfer is: "+temp);
			System.out.println("your balance after the transfer is: "+sender.getInvestment());
			return;
		}
		
	
		}
}	
		
	
	
	}


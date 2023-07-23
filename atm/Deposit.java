package atm;

import java.util.ArrayList;
import java.util.Scanner;

public class Deposit extends Customer {
	
	
	public static void deposit(String name, ArrayList<Customer> customers) {
		
			Scanner input = new Scanner(System.in);
        	
			double money;
			
			double updated;
			
			for (Customer customer : customers) {
            
        		if (name.equalsIgnoreCase(customer.getName())) {
				
        			System.out.println("Please enter how much money you want to deposit: ");
        			
        			money = input.nextInt();
        			
        			input.nextLine();
        			
        			if(Shared.acc.equalsIgnoreCase("Main")){
        			 
        			System.out.println(" Your balance before the deposit is: "+ customer.getMain());
        		
        			updated = customer.getMain() + money;
        			
        			customer.setMain(updated);
        		
        			System.out.println("Your balance after the deposit is: "+ customer.getMain());
        		}	
				
        			if(Shared.acc.equalsIgnoreCase("Saving")){
           			 
            			System.out.println(" Your balance before the deposit is: "+ customer.getSaving());
            		
            			updated = customer.getSaving() + money;
            			
            			customer.setSaving(updated);
            		
            			System.out.println("Your balance after the deposit is: "+ customer.getSaving());
            		}	

        			
        			if(Shared.acc.equalsIgnoreCase("Investment")){
           			 
            			System.out.println(" Your balance before the deposit is: "+ customer.getInvestment());
            		
            			updated = customer.getInvestment() + money;
            			
            			customer.setInvestment(updated);
            		
            			System.out.println("Your balance after the deposit is: "+ customer.getInvestment());
            		}	
    				
				
				
			}
		
		
		
		
		
	}

}
}
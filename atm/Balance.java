package atm;

import java.util.ArrayList;

public class Balance extends Customer {
	
	
	public static void balance (String name, ArrayList<Customer> customers) {
		
		for (Customer customer : customers) {
            
			if (name.equalsIgnoreCase(customer.getName())) {
				
				if(Shared.acc.equalsIgnoreCase("Main")) {
       
            	System.out.println("Your balance is: "+ customer.getMain());
				
				}
				
				if (Shared.acc.equalsIgnoreCase("Saving")) {
					
				System.out.println("Your balance is: "+customer.getSaving());
				
				}
				
				if(Shared.acc.equalsIgnoreCase("Investment")) {
					
					System.out.println(" Your balance is: "+customer.getInvestment());
					
				}
       
                return;
            }
        }
		
		
		
	}
	

}

package atm;

import java.util.ArrayList;
import java.util.Scanner;

public class Withdraw extends Customer {
	
	public static void withdraw(String name, ArrayList<Customer> customers) {
		

		Scanner input = new Scanner(System.in);
		
		double with;
		
		double updated;
		
		for (Customer customer : customers) {
            
			if (name.equalsIgnoreCase(customer.getName())) {
				
					
					System.out.println("Please enter how much you want to withdraw: ");
					
					with = input.nextInt();
					
					input.nextLine();
					
					if(Shared.acc.equalsIgnoreCase("Main") && with > customer.getMain()) {
						
						System.out.println("Insuffiecent Balance.");
						
						break;
					}
						
					if(Shared.acc.equalsIgnoreCase("Main")) {
						
					
					System.out.println("Your balance before the withdraw is: "+ customer.getMain());
					
					updated = customer.getMain() - with;
					
					customer.setMain(updated);
					
					System.out.println("Your balance after the withdraw is: "+ customer.getMain());
					
			}
					

					if(Shared.acc.equalsIgnoreCase("Saving") && with > customer.getSaving()) { 
						
						System.out.println("Insuffiecent Balance.");
						break;
					}
						
					if(Shared.acc.equalsIgnoreCase("Saving")) {
						
					
					System.out.println("Your balance before the withdraw is: "+ customer.getSaving());
					
					updated = customer.getSaving() - with;
					
					customer.setSaving(updated);
					
					System.out.println("Your balance after the withdraw is: "+ customer.getSaving());
					
			}
					

					if(Shared.acc.equalsIgnoreCase("Investment") && with > customer.getInvestment()) {
						
						System.out.println("Insuffiecent Balance.");
						
						break;
			}
					if(Shared.acc.equalsIgnoreCase("Investment")) {
						
					
					System.out.println("Your balance before the withdraw is: "+ customer.getInvestment());
					
					updated = customer.getInvestment() - with;
					
					customer.setInvestment(updated);
					
					System.out.println("Your balance after the withdraw is: "+ customer.getInvestment());
					
			}
			}
		
		
		
		
		
	}

}
}
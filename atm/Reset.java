package atm;

import java.util.ArrayList;
import java.util.Scanner;
public class Reset extends Customer {
	
	
	
	public static void reset( String name, ArrayList<Customer> customers) {
		String answer;
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int temp = 0;
		int counter2 = 0;
		int temp2 = 0;
		for (Customer customer : customers) {
            if ( name.equals(customer.getName())) {
            System.out.println("You have three tries to answer correctly each question");	
            
		for (int i = 1; i <= 3 ; i++) {
		System.out.println("What is your answer for'"+customer.getSecurity1());
		answer = input.nextLine();		
		if(answer.equals(customer.getSecuritya1())) {
			System.out.println("answer is correct");
		break;
            }
		else {
			counter ++;
			temp = counter ;
			counter = 3 - counter;
			System.out.println("Incorrect answer. Try again");
			System.out.println("You have "+ counter + " more tries");
			counter = temp;
			if(counter == 3) {
				
				System.out.println("No more tries");
				return;
			}
		}
		
	}

		for (int i = 1; i <= 3 ; i++) {
			System.out.println("What is your answer for'"+customer.getSecurity2());
			answer = input.nextLine();		
			if(answer.equals(customer.getSecuritya2())) {
				System.out.println("answer is correct");
			break;
	            }
			else {
				counter2 ++;
				temp2 = counter2;
				counter2 = 3 - counter2;
				System.out.println("Incorrect answer. Try again");
				System.out.println("You have "+ counter2 + " more tries");
				counter --;
				if(counter2 == 3) {
					
					System.out.println("No more tries");
					return;
				}
			}
			
		}
		
		System.out.println("Your answers are correct. Enter your new pin");
		int pin = input.nextInt();
		input.nextLine();
		customer.setPin(pin);
		System.out.println("Pin reset succesfully");
		
}
}
	}
}
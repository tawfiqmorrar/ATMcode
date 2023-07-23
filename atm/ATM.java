package atm;
import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
	
	static ArrayList<Customer> customers = new ArrayList<Customer>();

	public static void main(String[] args) {
		String name;
		
		String address;
		
		int age;
		
		String gender;
		
		String nation;
		
		int pin;
		
		String test;
		
		int testpin;
		Scanner input = new Scanner(System.in);
		
		double number;
		
		
		//Customer ahmad = new Customer();
		//ahmad.setName("Ahmad");
		//ahmad.setAddress("Amman");
		//ahmad.setAge(26);
		//ahmad.setGender("male");
		//ahmad.setAccounts(2);
		//ahmad.setNation("Jordan");
		//ahmad.setPin(1234);
		//ahmad.setMain(10000);
		//ahmad.setSaving(2000);
	
		
		//Customer tawfiq = new Customer();
		//tawfiq.setName("Tawfiq");
		//tawfiq.setAddress("Amman");
		//tawfiq.setAge(23);
		//tawfiq.setAccounts(3);
		//tawfiq.setGender("male");
		//tawfiq.setNation("Jordan");
		//tawfiq.setPin(5678);
		//tawfiq.setMain(30000);
		//tawfiq.setSaving(12000);
		//tawfiq.setInvestment(100000);
		
		//Customer sara = new Customer();
		//sara.setName("Sara");
		//sara.setAddress("Irbid");
		//sara.setAge(28);
		//sara.setAccounts(1);
		//sara.setGender("female");
		//sara.setNation("Jordan");
		//sara.setPin(9123);
		//sara.setMain(5000);
		
		//ArrayList<Customer> customers = new ArrayList<Customer>();
		
		//customers.add(ahmad);
		//customers.add(tawfiq);
		//customers.add(sara);
		
		
		while (true) {
			
		System.out.println("Please enter your Name: ");
		System.out.println("If you are a new user please enter 'new user' ");
		
		
		test = input.nextLine();
		
		if(test.equalsIgnoreCase("new user")) {
			
			Customer newUser = New.collect(input, customers);
			if(Shared.acc.equalsIgnoreCase("Young")) 
			continue;
			
			customers.add(newUser);
			System.out.println("Information saved successfully");
			continue;
		}
		
		Customer match = null;
		String match1 = null;
		for (Customer customer:customers) {
			
			if (test.equals(customer.getName())) {
				match = customer ;
				match1=match.getName();
				break ;
	}
			
			
}
		if( match == null) {
			
			
			System.out.println(" The name you entered is incorrect. Please try again");
		continue;
		}
		System.out.println("***********");
		System.out.println("Please enter your pin: ");
		testpin = input.nextInt();
		input.nextLine();
		
		if(testpin == match.getPin())
			System.out.println("Access Granted");
		else { 
			System.out.println("Wrong Name or Pin, Try again");
		continue;
		}
		
		char option;
		
		
		boolean logout = false;
		
		Shared.acc = "Main";
		
		while(!logout) {
			System.out.println(""+Shared.acc+" account");
            System.out.println("Please enter an option in a capital letter: ");
            System.out.println("U - UserInfo");
            System.out.println("D - Deposit");
            System.out.println("W - Withdraw");
            System.out.println("A - Accounts");
            System.out.println("C - Check Balance");
            System.out.println("T - Transfers");
            System.out.println("L - Logout");
            option = input.nextLine().charAt(0);

            switch (option) {
                
            case 'U':
                	UserInfo.info(match1 , customers, input);
                    continue;
                
            case 'D':
                    Deposit.deposit(match1, customers);
                    continue;
                
            case 'W':
                    Withdraw.withdraw(match1,customers);
                    continue;
                
            case 'C':
                    Balance.balance( match1, customers);
                    continue;
               
                
            case 'A':
            	Accounts.accounts(match1, customers,input);
            	continue;
                    
            case 'T':
            	Transfer.transfer(match1, customers);
            	continue;
            	
            
            case 'L':
                    System.out.println("Logging out...");
                    
                    logout = true;
                    
                    break;
               
            default:
                    System.out.println("Invalid option. Please try again.");
                    continue;
                   
                    	
		
		
		
		
        }
		}
			
		}
	}
}
		
		
			
		 
		
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
	


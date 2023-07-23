package atm;

import java.util.Scanner;

public class Customer {
	
	private String name ;
	
	private String Address;
	
	private int age;
	
	private double main = -1;
	
	private double saving = -1;
	
	private double investment = -1;
	
	private int accounts;
	
	private String gender;
 
	private String nation;
	
	private int pin;
	
	private String phone;

	private String security1;
	
	private String security2;
	
	private String securitya1;
	
	private String securitya2;
	
	public String getPhone() {
		return phone;
	}

	public String getSecurity1() {
		return security1;
	}

	public void setSecurity1(String security1) {
		this.security1 = security1;
	}

	public String getSecurity2() {
		return security2;
	}

	public void setSecurity2(String security2) {
		this.security2 = security2;
	}

	public String getSecuritya1() {
		return securitya1;
	}

	public void setSecuritya1(String securitya1) {
		this.securitya1 = securitya1;
	}

	public String getSecuritya2() {
		return securitya2;
	}

	public void setSecuritya2(String securitya2) {
		this.securitya2 = securitya2;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAccounts() {
		return accounts;
	}

	public void setAccounts(int accounts) {
		this.accounts = accounts;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getMain() {
		return main;
	}

	public void setMain(double main) {
		this.main = main;
	}

	public double getSaving() {
		return saving;
	}

	public void setSaving(double saving) {
		this.saving = saving;
	}

	public double getInvestment() {
		return investment;
	}

	public void setInvestment(double investment) {
		this.investment = investment;
	}

	


}

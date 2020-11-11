package coe528.project;

import java.io.*;
import java.util.Scanner;

public class BankAcc {
	private User customer;
	private double balance;
	
	public BankAcc(User customer, double balance) {
		this.customer = customer;
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws IOException {
		if(getUpdatedBalance() >= amount) {
			balance = getUpdatedBalance() - amount;
                        updateFile(customer.getUsername());
		}
                checkLevel();
	}
	
	public void deposit(double amount) throws FileNotFoundException, IOException {
		if(amount > 0) {
                    File file = new File(customer.getUsername() + ".txt");
                    //Scanner scan = new Scanner(file);
                    //String [] component;
                  //  component = scan.nextLine().split(" ");
                  
                    double b = getBalance();
                    balance = b + amount;
                    System.out.println("" + getUpdatedBalance());
                            
                            
                    updateFile(customer.getUsername());
                    
                    
//                    balance = balance + amount;
//                    BufferedWriter writer = new BufferedWriter(new FileWriter(customer.getUsername() + ".txt"));
//                    String update
//                    writer.write(string);
                    
                    
                    
                    
			//balance = balance + amount;
		}
                checkLevel();
	}

//	public User getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

	public double getBalance() throws IOException {
            File file = new File(customer.getUsername() + ".txt");
            Scanner scan = new Scanner(file);
            String [] component;
            component = scan.nextLine().split(" ");
            balance = Double.parseDouble(component[3]);
            //BufferedWriter writer = new BufferedWriter(new FileWriter(customer.getUsername() + ".txt"));
            
		return balance;
	}
        public double getUpdatedBalance(){
            return balance;
        }

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void updateFile(String fileName) throws IOException { 
                System.out.println("UPDATING" + fileName);
		File file = new File(fileName + ".txt");
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".txt"));
                String updatedFile = ("customer" + " " + fileName + " " + customer.getPassword() + " " + getUpdatedBalance() + " ");
                writer.write(updatedFile);
                writer.close();
                
                Scanner scan = new Scanner(file);
                String [] component;
                component = scan.nextLine().split(" ");
                System.out.println(component[0] + " " + component[1] + " " + component[2] + " " + component[3]);
                
		
	}
        
        public void onlinePurchae(double pAmount) throws IOException{
            System.out.println("TESTINGONKINEPURCHASE:               ");
            System.out.println(customer.getLevel());
            System.out.println("ONLINEAMOUNT: "+ pAmount);
            System.out.println("CHECKING BALNCE" +balance);
            System.out.println("CHECK GETBALANCE" + getBalance());
             if(getUpdatedBalance() >= pAmount){
                if(customer.getLevel() == "Silver"){
                    System.out.println("IN SILVER IF STAT");
                    balance = balance - pAmount - 20;
                }
                if(customer.getLevel() == "Gold"){
                    System.out.println("IN GOLD IF STATE");
                    balance = balance - pAmount - 10;
          
                }
                if(customer.getLevel() == "Platinum"){
                    System.out.println("IN PLATINUM IFSTATEMENT");
                    balance = balance - pAmount;
                }
                updateFile(customer.getUsername());
            }
             checkLevel();
            
            
            
            
            
            
            
//            String level = getLevel();
//            if(getUpdatedBalance() >= pAmount){
//                if(level == "silver"){
//                    balance = balance - pAmount - 20;
//                }
//                if(level == "gold"){
//                    balance = balance - pAmount - 10;
//           
//                }
//                if(level == "platinum"){
//                    balance = balance - pAmount;
//                }
//                updateFile(customer.getUsername());
//            }
                        
        }
        
        public void checkLevel(){
             if(balance < 10000){
                    customer = new Silver(customer.getUsername(), customer.getPassword());
                }
                if(balance>10000 && balance<20000){
                    customer = new Gold(customer.getUsername(), customer.getPassword());
                }
                if(balance>20000){
                    customer = new Plat(customer.getUsername(), customer.getPassword());
                }
        }
        
        public String checkState(){
            String s = customer.getLevel();
            return s;
                    
            
        }
             
        
//	
//	public String getLevel() {
//           // User u;
//		if(getUpdatedBalance() < 10000) {
//                    customer = new Silver(getUsername());
//			return "silver";
//		}
//		if(getUpdatedBalance()>10000 && balance<20000) {
//			return "gold";
//		}
//		if(getUpdatedBalance()>20000) {
//                    u= new plat()
//			return "platinum";
//		}
//		return null;
//	}
	
	
	

}

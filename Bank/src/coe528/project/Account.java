package coe528.project;

import coe528.project.BankAcc;
import coe528.project.BankAcc;
import java.awt.BorderLayout;
//import coe528.project.Customer;
//import coe528.project.Customer;
import java.io.*;
import java.util.Scanner;

public class Account {
	//Manager can add or delete customer
	//Add customer to a file => Uername:____  Password:_____ Role: _____ BankAccount:______
	
	public boolean checkLogin(String role, String username, String password) throws FileNotFoundException{
		// RETURNS true if the role is manager and the username and password are admin. 
                 if(role == "manager") {
			if(username == "admin" && password == "admin") {
				return true;
			}
		}
            
		if(role == "customer") {
                        //Creates file with the username.txt
			File file = new File(username + ".txt");
                        //Checks if file exists
                       boolean check = file.exists();
                            //System.out.println("The file" + check);
			if(check = false) {
                               // System.out.println("RETURNED FALSE ONE");
				return false;
			}
			Scanner scan = new Scanner(file);
                           // System.out.println();
                                
		// a b c d 
			String [] component;
			component = scan.nextLine().split(" ");
                            System.out.println(component[0] + " " + component[1] + " " + component[2]);
                        System.out.println(component[2]);
                        System.out.println(password);
                        String p = component[2];
                        if(password == p){
                            System.out.println("IT WILL RETURN FALSE");
                            return false;
                        }
                                
			if(component[0].equals(role) && component[1].equals(username)) {
                            System.out.println("CAUGHT HERE");
                            if(component[2].equals(password)){
                                System.out.println("CAUGHT TWO");
                                return true;
                            }
                                //System.out.println("RETURNED TRUE");
				return false;
			}
                        
                      
                        
		}
		
		return false;
	}
	
        //Adds the customer. This method creates a text file username.txt ig appropriate conditions are emt
	public void addCustomer(String role, String username, String password) throws IOException{
		if(role == "customer") {
			try {
			File f = new File(username + ".txt");
			//PrintWriter printWriter = new PrintWriter(username + ".txt");
			User cust = new Silver(username, password);//Initial balance is 100 thus new user is always at silver level
			BankAcc newAcc = new BankAcc(cust, 100);
                          //  System.out.println("please work");
                            String information = (role + " " + username + " " + password + " " + "100");
                            BufferedWriter writer = new BufferedWriter(new FileWriter(username + ".txt"));
                                writer.write(information);
                                writer.close();
			//printWriter.printf("%s %s %s %lf", role, cust.getUsername(), cust.getPassword(), newAcc.getBalance());
			}catch(FileNotFoundException e) {
				System.out.println("error");
			}
		}	
	}

	
	//this method deleted the user file
	public void deleteCustomer(String username) {
            System.out.println(username + "dasdsa");
                File f = new File(username + ".txt");
                System.out.println(f.getAbsolutePath());
                f.delete();
//                
//		File file = new File(username + ".txt");
//                file.delete();
//                file.D
//                boolean check = file.exists();
//		if(check = true) {
//                        System.out.println("IS IT INSIDEIF");
//			file.delete();
//		}
//		else {
//			System.out.println("file not found");
//		}
	}
	
	
	

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

/**
 *
 * @author jason
 */
public class Plat extends User {
    

    public Plat(String username, String password) {
        super(username, password);
    }
    
    //Since platinum is a type of User. Returns Customer
    String getRole() {
		String role = "customer";
		return role;
	}
    //Returns the state. In this case it is platinum (account balance is > 20000)
        public String getLevel(){
        return "Platinum";
    
    }
    
}
    
    


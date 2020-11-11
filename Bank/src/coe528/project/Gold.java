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
public class Gold extends User{
    
    public Gold(String username, String password) {
        super(username, password);
    }
    //Returns customer
    String getRole() {
		String role = "customer";
		return role;
	}
    //returns the state. IN this instance it returns "Gold". (account balance of this customer is > 10000 and < 20000)
    public String getLevel(){
        return "Gold";
    
    }
    
}
    

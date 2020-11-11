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
public class Silver extends User {

    public Silver(String username, String password) {
        super(username, password);
    }
    //Returns customer since silver is of type User
    String getRole() {
		String role = "customer";
		return role;
	}
    //return the state. Which is silver. (account balance for this use is < 10000)
        public String getLevel(){
        return "Silver";
    
    }
    
}

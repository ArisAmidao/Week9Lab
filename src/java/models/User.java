/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.io.Serializable;

public class User implements Serializable{
    
    private String email;
    private String fname;
    private String lname;
    private String password;
    private int role;
    
    public User(){
        
    }
    
    public User(String email, String fname, String lname, String password, int role) {
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.password = password;
        this.role = role;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRole(int role) {
        this.role = role;
    }
    
    public String getEmail() {
        return email;
    }
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public String getPassword() {
        return password;
    }
    public int getRole() {
        return role;
    }
    
}

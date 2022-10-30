/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author amida
 */
public class Role {
    
    int roleID;
    String roleName;
    
    public Role(){
        
    }
    
    public Role(int roleID, String roleName) {
        this.roleID = roleID;
        this.roleName = roleName;
    }
    
    public void setRoleID(int roleID){
        this.roleID = roleID;
    }
    
    public int getRoleID() {
        return roleID;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    public String getRoleName() {
        return roleName;
    }
    
}

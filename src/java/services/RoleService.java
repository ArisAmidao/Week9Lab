
package services;

import models.Role;
import dataaccess.RoleDB;
import java.util.List;

public class RoleService {

    public List<Role> getAllRoles() throws Exception {
        RoleDB roleDB = new RoleDB();
        List<Role> roles = roleDB.getAllRoles();
        return roles;
    }

    public int getRoleID(Role role) {
        String name = role.getRoleName();
        if (name.equals("system admin")) {
            return 1;
        } else {
            return 2;
        }
    }

    public int getRoleID(String userRoleName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

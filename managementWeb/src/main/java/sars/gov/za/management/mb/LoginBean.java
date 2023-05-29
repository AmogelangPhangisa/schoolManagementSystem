/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sars.gov.za.management.mb;

import javax.faces.bean.ManagedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.RequestScope;
import sars.gov.za.management.common.PersonType;
import sars.gov.za.management.common.SystemUserStatus;
import sars.gov.za.management.domain.User;
import sars.gov.za.management.service.UserServiceLocal;

/**
 *
 * @author S2028873
 */
@ManagedBean
@RequestScope
public class LoginBean extends BaseBean{
    
    @Autowired
    private UserServiceLocal userService;
    
    private String username;
    private String password;
    
    public void login(){
    
        User user = userService.findUserByUserNameAndPassword(username, password);
        
        if(user != null){
        
        if (user.getPersonType().equals(PersonType.ADMINISTRATOR)&& user.getSystemUserStatus().equals(SystemUserStatus.ACTIVE)){
        
            System.out.println("Logged in");
        
        }
        } 
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}

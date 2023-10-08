/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author kunaltibe
 */
public class User extends Person {
    private String neuid;
    private String username;
    private ArrayList<String> passwordList = new ArrayList<>();
    
    private final String salt = BCrypt.gensalt();
   
    public ArrayList<String> getPasswordList() {
        return passwordList;
    }
    
    public int getsize(){
        return passwordList.size()-1;
    }
    public void setPasswordList(String password) {
        String hashedPassword = BCrypt.hashpw(password, salt);
        this.passwordList.add(hashedPassword);  
    }
    
    public boolean pwdAuth(String oldpwd, String newpwd){
        return BCrypt.checkpw(newpwd, oldpwd);
    }

    public String getNeuid() {
        return neuid;
    }
    public void setNeuid(String neuid) {
        this.neuid = neuid;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
    @Override
    public String toString(){
        return neuid;
    }
    
}

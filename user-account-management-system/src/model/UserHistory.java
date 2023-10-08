/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kunaltibe
 */
public class UserHistory {
    private ArrayList<User> userList;

    public UserHistory() {
       this.userList = new ArrayList<User>();
    }

    public ArrayList<User> getUserList() {
        return userList;
    }
    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
    
    public User createUser(){
        User user = new User();
        userList.add(user);
        return user;
        }
    
    public User searchUser(String neuid){
        for(User user: userList){
            if(user.getNeuid().equals(neuid)){
                return user;
            }
        }
        return null;
    }
    
    public void blockUser(User user){
        userList.remove(user);
    } 
    
    public User userAuth(String username, String password){
        for(User user : userList){
            if(user.getUsername().equals(username)){
                if(user.pwdAuth(user.getPasswordList().get(user.getsize()), password)){
                   return user;
                }
            }
        }
    return null;
    }
}

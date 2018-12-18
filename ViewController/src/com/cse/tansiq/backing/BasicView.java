package com.cse.tansiq.backing;



import com.cse.tansiq.BAL.BAOfactory;
import com.cse.tansiq.BAL.GMBAO;
import com.cse.tansiq.DTO.User;

import java.io.Serializable;

import java.util.List;

import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="dtBasicView")
@ViewScoped

public class BasicView {

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    private List<User> users;
    private User user;
    private GMBAO gm = BAOfactory.createGMBAO();
    
    @PostConstruct
    public void init() {
        users = gm.getALLUsers();
        System.out.print(users.get(0).getEmail());
        user = users.get(0);
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

     

//    @ManagedProperty("#{GMBAO}") 
//    public void setService(CarService service) {
//        this.service = service;
//    }
}
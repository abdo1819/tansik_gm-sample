package com.cse.tansiq.backing;



import com.cse.tansiq.BAL.BAOfactory;
import com.cse.tansiq.BAL.GMBAO;
import com.cse.tansiq.DTO.User;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

@ManagedBean(name="dtBasicView")
@ViewScoped

public class BasicView {
    
    private Integer slectedUserOption;
    private Integer slectedFacultyOption;
    private Integer slectedYearOption;

    public void setSlectedFacultyOption(Integer slectedFacultyOption) {
        this.slectedFacultyOption = slectedFacultyOption;
    }

    public Integer getSlectedFacultyOption() {
        return slectedFacultyOption;
    }

    public void setSlectedYearOption(Integer slectedYearOption) {
        this.slectedYearOption = slectedYearOption;
    }

    public Integer getSlectedYearOption() {
        return slectedYearOption;
    }


    public void setUserMap(Map<String, Integer> usersMap) {
        this.userMap = usersMap;
    }

    public Map<String, Integer> getUserMap() {
        return userMap;
    }

    public void setFacultyMap(Map<String, Integer> facultyMap) {
        this.facultyMap = facultyMap;
    }

    public Map<String, Integer> getFacultyMap() {
        return facultyMap;
    }

    public void setYearMap(Map<String, Integer> yearMap) {
        this.yearMap = yearMap;
    }

    public Map<String, Integer> getYearMap() {
        return yearMap;
    }


    private List<User> users;
    private GMBAO gm = BAOfactory.createGMBAO();
    private Map<String, Integer> userMap; 
    private Map<String, Integer> facultyMap; 
    private Map<String, Integer> yearMap; 
    
    @PostConstruct
    public void init() {
        //move to button method
        users = gm.getALLUsers();
        
        //map for user selection
        userMap = new HashMap<>();
        userMap.put("Student", 1);
        userMap.put("Admin", 2);
        
        //map for faculty sould be dynamic get edu year first
        facultyMap = new HashMap<>();
        facultyMap.put("engi",1);
        facultyMap.put("scince",2);
        facultyMap.put("computer",3);

        yearMap = new HashMap<>();
        yearMap.put("e3dady",1);
        yearMap.put("three electric",2);
        yearMap.put("three mechanics",3);
    }
    
    public String search(){
    //use data layer
        System.out.println(slectedUserOption+"  -  "+slectedFacultyOption+"  -  "+slectedYearOption); 
        gm.getALLUsers(); 
        gm.getAllStudent();
        gm.getAllAdmins();
        return null;
    }
        
        
    public void setUsers(List<User> users) {
        this.users = users;
    }
    
    public List<User> getUsers() {
        return users;
    }
    
//        private String selectedUser;
//
//    public void setSelectedUser(String selectedUser) {
//        this.selectedUser = selectedUser;
//    }
//
//    public String getSelectedUser() {
//        return selectedUser;
//    }


    //    private List<String> users_list;
//    public void OrderListBean() { 
//        users_list = new ArrayList<String>();
//        users_list.add("all");
//        users_list.add("all");
//        users_list.add("student");
//        users_list.add("admin");
//
//        //more players 
//        }

     

//    @ManagedProperty("#{GMBAO}") 
//    public void setService(CarService service) {
//        this.service = service;
//    }
    public void setSlectedUserOption(Integer slectedUserOption) {
        this.slectedUserOption = slectedUserOption;
    }

    public Integer getSlectedUserOption() {
        return slectedUserOption;
    }
}

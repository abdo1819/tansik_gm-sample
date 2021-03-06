package com.cse.tansiq.BAL;
import java.util.List;

import com.cse.tansiq.DTO.*;
import com.cse.tansiq.DAL.*;

import java.util.ArrayList;

public interface GMBAO    {
  
    public final int student_role = 0;
    public final int admin_role = 1;
    public final int gm_role = 2;
  
  
    /**
     * aouthor :abdelrhman ragab hashem
     * date : 12/2
     * returns a list of all users in data base
     *
     * @param void no need for params
     * @return List<Users> 
     *        
     *  */  
  
    public ArrayList<User> getUsers();
   
  
    /**
     * aouthor :abdelrhman ragab hashem
     * date : 12/2
     * returns a list of users in database with certain role  
     *
     * @param void no need for params
     * @return List<Users> 
     *        
     *  */  
  
    public ArrayList<User> getUsers(Integer role);
 
    
    /**
     * aouthor :abdelrhman ragab hashem
     * date : 12/2
     * 
     * 
     * returns a list of all users in the DB with role and edu year
     * 
     * if the DataBase is found and the view will update its pages (the page that will have the result) 
     * according to that list  
     *
     * @param void no need for params
     * @return List<Users> 
     *        
     *  */  
 
    public  ArrayList<User> getUsers(Integer role,EduYear edu_year);

    public  ArrayList<User> getUsers(Integer role,EduYear edu_year,int id);

    public  ArrayList<EduYear> getEduYear();





    /**
     *author : abdelrahman ragab hashem
     *date 12/3
     * 
     * 
     * get all pages from db based in role of viewers
     * @return
     */
    
  public ArrayList<com.cse.tansiq.DTO.Page> get_all_pages();
  public ArrayList<com.cse.tansiq.DTO.Page> get_all_admin_pages();
  public ArrayList<com.cse.tansiq.DTO.Page> get_all_student_pages();
  
//  boolean editUser(User user);
//  boolean addAdmin(Admin admin);
//  boolean removeAdmin(Admin admin);
  

}

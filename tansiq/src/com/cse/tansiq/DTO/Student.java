package com.cse.tansiq.DTO;
import  java.util.*;
public class Student extends User {
    private Subject[] subjects;


/**
 * replace by a hash map in calculation admin methode
*/
//    private Department Department;




    private ArrayList< Request> requests=new ArrayList();
    
    private String nationalID;
    
    private float degree;
    private int year;

    public void setSubjects(Subject[] subjects) {
        // copying info
        // this.subjects = subjects;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setDepartment(Department Department) {
        // copying info
        // this.Department = Department;
    }

    public Department getDepartment() {
        return null;
    }

  

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setDegree(float degree) {
        this.degree = degree;
    }

    public float getDegree() {
        return degree;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }

    public ArrayList<Request> getRequests() {
        return requests;
    }
}

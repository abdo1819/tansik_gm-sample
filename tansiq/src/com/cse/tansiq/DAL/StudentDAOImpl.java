package com.cse.tansiq.DAL;

import com.cse.tansiq.DTO.Department;
import com.cse.tansiq.DTO.Message;
import com.cse.tansiq.DTO.Request;
import com.cse.tansiq.DTO.Student;
import com.cse.tansiq.DTO.User;

import java.util.Collections;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    

    @Override
    public Department getDepartment(Student student) {
        // TODO Implement this method
        return null;
    }

    @Override
    public boolean isExist(String username, String password) {
        // TODO Implement this method
        return false;
    }

    @Override
    public User getUser(String username, String password) {
        // TODO Implement this method
        return null;
    }

    @Override
    public boolean addMessage(Message message) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean deletMessage(Message message) {
        // TODO Implement this method
        return false;
    }

    @Override
    public List<Message> getMessages(User user) {
        // TODO Implement this method
        return Collections.emptyList();
    }

    @Override
    public boolean addRequest(Request request, Student student) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean deletRequest(Request request, Student student) {
        // TODO Implement this method
        return false;
    }

    @Override
    public List<Request> getAllRequests(Student student) {
        // TODO Implement this method
        return Collections.emptyList();
    }
}

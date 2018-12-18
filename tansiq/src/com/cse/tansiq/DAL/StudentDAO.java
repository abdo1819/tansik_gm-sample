package com.cse.tansiq.DAL;

import com.cse.tansiq.DTO.*;

public interface StudentDAO extends UserDAO{

    
    /*
    *   get student department after
    *   coordination finshes
    */
    Department getDepartment(Student student);

}

package com.cse.tansiq.BAL;

public class BAOfactory {
    
    public static GMBAO createGMBAO(){
        return new GMBAOImpl();
    }
    
    
}

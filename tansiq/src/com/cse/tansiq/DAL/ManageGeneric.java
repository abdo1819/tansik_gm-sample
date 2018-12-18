package com.cse.tansiq.DAL;

public class ManageGeneric<T> {
    
    private T t;
    public void add (T t){
        this.t=t;
  }
    public T get(){
        return this.t;
    }
    
    
    
    
    
    
    
}

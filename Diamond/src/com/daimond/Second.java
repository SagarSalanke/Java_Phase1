package com.daimond;

public interface Second {
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 

}

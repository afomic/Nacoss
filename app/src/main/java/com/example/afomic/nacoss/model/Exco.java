package com.example.afomic.nacoss.model;

/**
 * Created by afomic on 17-Oct-16.
 */
public class Exco extends Person {
    String department;
    String post;
    public Exco(String name, String level, String option, String office, String number,String email){
        super(name,number,email,level);
        post=office;
        department=option;
    }
    public String getDepartment() {
        return department;
    }

    public String getPost() {
        return post;
    }
}

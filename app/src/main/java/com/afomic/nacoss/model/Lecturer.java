package com.afomic.nacoss.model;

/**
 * Created by afomic on 17-Oct-16.
 *
 */
public class Lecturer extends Person {
     private String areaOfSpecialization;
    private  String roomNumber;
    private String degrees;

    public Lecturer(String name,String rank,String degrees,String areaOfspec,String roomNumber,String email,String number){
        super(name,number,email,rank);
        this.degrees=degrees;
        areaOfSpecialization=areaOfspec;
        this.roomNumber=roomNumber;
    }

    public String getAreaOfSpecialization() {
        return areaOfSpecialization;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getDegrees() {
        return degrees;
    }
}

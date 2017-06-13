package com.afomic.nacoss.model;

import android.content.Context;
import android.graphics.Bitmap;

import com.afomic.nacoss.util.PictureUtil;

/**
 * Created by afomic on 17-Oct-16.
 *
 */
public class Person {
    String name;
    String telephoneNumber;
    String email;
    String level;
    public Person(String name, String telephoneNumber, String email,String level) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.level=level;
    }


    public String getName() {
        return name;
    }

    public void setName(String namez) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }


    public String getEmail() {
        return email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Bitmap getBitmap(Context a){
        return PictureUtil.getImage(a, name);
    }
}

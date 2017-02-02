package com.afomic.nacoss.data;

import com.afomic.nacoss.model.Exco;

import java.util.ArrayList;

/**
 * Created by afomic on 09-Jan-17.
 * this are the data of the excos in the department
 */

public class ExcoData {
    static ArrayList<Exco> excos=new ArrayList<>();
    public static  void  addExcos(){
        excos.add(new Exco("ADEOYE Adela","Part 5","Computer Science with Maths","President","08166034592","adeoye.adela@gmail.com"));
        excos.add(new Exco("DANIEL Folashade","Part 3","Computer Science with Maths","Vice President","08108704876","nomail@gmail.com"));
        excos.add(new Exco("ADENIYI Kehinde","Part 5","Computer Engineering","General Secretary","08167785376","nomail@gmail.com"));
        excos.add(new Exco("ISHOLA Tosin","Part 3","Computer Engineering","Financial Secretary","08101057100","habystar09@gmail.com"));
        excos.add(new Exco("OLAIYA Omotayo","Part 3","Computer Science with Economics","P.R.O","07056908934","nomail@gmail.com"));
        excos.add(new Exco("ANI Kenechi","Part 3","Computer Engineering","Librarian","0810672468","nomail@gmail.com"));
        excos.add(new Exco("UKRAPOR Usi","Part 3","Computer Science with Maths","Director of Sports","09092776803","nomail@gmail.com"));
        excos.add(new Exco("EGBEDO Daniel","Part 2","Computer Science with Economics","Director of Socials","08148220497","nomail@gmail.com"));
        excos.add(new Exco("FADUNSIN Olawale","Part 3","Computer Engineering","ASS. GEN.SEC","08132001982","fadusin4s@gmail.com"));
        excos.add(new Exco("ADELEYE Jeremiah","Part 2","Computer Science with Maths","ASS. Librarian","08100933935","nomail@gmail.com"));

    }
    public static ArrayList<Exco> getExcos(){
        if(excos.isEmpty()){
            addExcos();
        }
        return excos;
    }
    public static Exco getExco(int position){
        if(excos.isEmpty()){
            addExcos();
        }
        return excos.get(position);
    }
}

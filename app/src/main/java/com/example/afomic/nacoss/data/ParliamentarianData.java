package com.example.afomic.nacoss.data;

import com.example.afomic.nacoss.model.Exco;

import java.util.ArrayList;

/**
 * Created by afomic on 30-Oct-16.
 */
public class ParliamentarianData {
    static ArrayList<Exco> parliamentarys=new ArrayList<>();
    public static  void  addParliamentarys(){
        parliamentarys.add(new Exco("AGBENLA Sulaimen","Part 5","Computer Engineering","Speaker","08181509461",""));
        parliamentarys.add(new Exco("AKINDIPE Olumide","Part 3","Computer Science with Maths","Deputy Speaker","08134563779","akindipe.olumideib1@gmail.com"));
        parliamentarys.add(new Exco("OGUNDARE seun","Part 5","Computer Science with Maths","Chief Whip","07062738235",""));
        parliamentarys.add(new Exco("OGBAMEN Olamide","Part 3","Computer Science with Economics","Clerk","08162592965",""));
        parliamentarys.add(new Exco("OLOWOLAGBA Qadir","Part 5","Computer Engineering","Member","08132846866",""));
        parliamentarys.add(new Exco("UHIARA Nnabueze","Part 5","Computer Engineering","Member","08162773741",""));
        parliamentarys.add(new Exco("IMALELE Ehimwenma","Part 5","Computer Engineering","Member","08162773741",""));
        parliamentarys.add(new Exco("OLARIBIGBE Monsur","Part 4","Computer Science with Economics","Member","07066255200",""));
        parliamentarys.add(new Exco("AMOO Abeeb","Part 4","Computer Engineering","Member","09032626366",""));
        parliamentarys.add(new Exco("OLALUDE Abigail","Part 3","Computer Science with Maths","Member","08111788751",""));
        parliamentarys.add(new Exco("AJALA Seunfunmi","Part 3","Computer Science with Economics","Member","08170592407",""));
        parliamentarys.add(new Exco("HAMZA Bashir","Part 2","Computer Engineering","Member","08133230618",""));
        parliamentarys.add(new Exco("AWORINDE Sukurat","Part 2","Computer Science with Maths","Member","08167861936",""));
        parliamentarys.add(new Exco("UTULOR Ugonna","Part 2","Computer Science with Economics","Member","08104811269",""));
        parliamentarys.add(new Exco("ADUNOYE Isreal","Part 2","Computer Science with maths","Member","08137765214",""));
        parliamentarys.add(new Exco("FESOMADE Alli","Part 1","Computer Science with maths","Member","08175879358",""));
        parliamentarys.add(new Exco("OMOKHUA Johnpaul","Part 1","Computer Engineering","Member","08103645339",""));
        parliamentarys.add(new Exco("ADERINTO Ibrahim","Part 1","Computer Science with Maths","Member","08103143539",""));
        parliamentarys.add(new Exco("OLADIPO Mercy","Part 1","Computer Science with Economics","Member","09095697134",""));
        parliamentarys.add(new Exco("ALADE oluwafemi","Part 1","Computer Science with Economics","Member","08180922062",""));
    }
    public static ArrayList<Exco> getparliamentarys(){
        if(parliamentarys.isEmpty()){
            addParliamentarys();
        }
        return parliamentarys;
    }
    public static Exco getparliamentary(int position){
        if(parliamentarys.isEmpty()){
            addParliamentarys();
        }
        return parliamentarys.get(position);
    }
}

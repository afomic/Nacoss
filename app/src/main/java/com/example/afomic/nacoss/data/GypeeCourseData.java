package com.example.afomic.nacoss.data;

import android.content.Context;
import android.util.Log;

import com.example.afomic.nacoss.model.Course;

import java.util.ArrayList;

/**
 * Created by afomic on 18-Oct-16.
 */
public class GypeeCourseData {
    static  ArrayList<Course> courses=new ArrayList<>();
    public static  void addCourse(){
        courses.add(new Course("CSC 101",4,2,1,1,null,"Introduction to Computing I"));
        courses.add(new Course("CSC 102",4,2,1,2,null,"Introduction to Computing II"));
        courses.add(new Course("CPE 203",4,2,2,1,null,"Introduction to Digital Computer System I"));
        courses.add(new Course("CPE 204",4,2,2,2,null,"Introduction to Digital Computer System II"));
        courses.add(new Course("CPE 301",4,3,3,1,"CSC 201","Low Level Languages"));
        courses.add(new Course("CSC 307",4,2,3,1,"MTH 201","Numerical Computation I"));
        courses.add(new Course("CSC 302",4,3,3,2,"CSC 201","Object-Oriented Programming"));
        courses.add(new Course("CSC 306",4,3,3,2,"CPE 301","Intro. to Human-Computer Interaction Design"));
        courses.add(new Course("CSC 308",4,2,3,2,"CSC 307","Numerical Computation II"));
        courses.add(new Course("CPE 310",4,2,3,2,null,"Introduction to Agent based Systems"));
        courses.add(new Course("CPE 316",4,2,3,2,"CPE 301","Introduction to Artificial Intelligence"));
        courses.add(new Course("CPE 401",4,3,4,1,"CPE 301","Computer Architecture and Organization"));
        courses.add(new Course("CPE 405",4,3,4,1,"CPE 204","Introduction to Microprocessor Tech. & Microprogramming"));
        courses.add(new Course("CSC 403",4,3,4,1,"CSC 201","Principles of Compilers"));
        courses.add(new Course("CSC 415",4,3,4,1,"CSC 201","Operating Systems and system programming"));
        courses.add(new Course("CSC 505",4,2,5,1,"CSC 302","Object Oriented Modeling"));
        courses.add(new Course("CPE 517",4,3,5,1,"CPE 401","Digital Computer Networks"));
        courses.add(new Course("CPE 502",4,3,5,2,"CPE 503","Hardware Systems Studies"));
        courses.add(new Course("CPE 506",4,2,5,2,null,"Industrial Applications Studies"));
        courses.add(new Course("CPE 508",4,3,5,2,null,"Computer System Project Management"));
        courses.add(new Course("CPE 510",4,3,5,2,null,"Natural Language Processing & Applications"));
        //restricted electives
        courses.add(new Course("CPE 514",4,2,5,2,null,"Computer Graphics(R.E)"));
        courses.add(new Course("CPE 520",4,2,5,2,null,"Expert Systems(R.E)"));
        courses.add(new Course("CPE 522",4,2,5,2,null,"Information Storage Retrieval(R.E)"));
        courses.add(new Course("CPE 524",4,2,5,2,null,"Techniques in Data Analysis(R.E)"));

        //computer sciences
        courses.add(new Course("CPE 206",1,2,2,2,null,"Digital Laboratory I"));
        courses.add(new Course("CSC 305",1,3,3,1,null,"Introduction to Database Systems"));
        courses.add(new Course("CSC 311",1,2,3,1,null,"Introduction to Information Systems"));
        courses.add(new Course("CSC 315",1,3,3,1,null,"Data Structures & Analysis of Algorithms"));
        courses.add(new Course("CSC 317",1,2,3,1,null,"Automata Theory & Computability"));
        courses.add(new Course("CSC 304",1,2,3,2,null,"Business & Commercial Programming"));
        courses.add(new Course("CSC 312",1,2,3,2,"CPE 301","Systems Analysis & Design Methodologies"));
        courses.add(new Course("CSC 407",1,2,4,1,null,"Techniques in Software Development"));
        courses.add(new Course("CSC 501",1,2,5,1,null,"Introduction to Operations Research"));
        courses.add(new Course("CSC 515",1,2,5,1,null,"Database Design and Management"));
        courses.add(new Course("CSC 523",1,2,5,1,null,"Mathematical Programming"));
        courses.add(new Course("CSC 503",1,3,5,1,null,"Individual Project I"));
        courses.add(new Course("CSC 504",1,3,5,2,null,"Individual Project II"));

        courses.add(new Course("CPE 206",3,2,2,2,null,"Digital Laboratory I"));
        courses.add(new Course("CSC 305",3,3,3,1,null,"Introduction to Database Systems"));
        courses.add(new Course("CSC 311",3,2,3,1,null,"Introduction to Information Systems"));
        courses.add(new Course("CSC 315",3,3,3,1,null,"Data Structures & Analysis of Algorithms"));
        courses.add(new Course("CSC 317",3,2,3,1,null,"Automata Theory & Computability"));
        courses.add(new Course("CSC 304",3,2,3,2,null,"Business & Commercial Programming"));
        courses.add(new Course("CSC 312",3,2,3,2,"CPE 301","Systems Analysis & Design Methodologies"));
        courses.add(new Course("CSC 407",3,2,4,1,null,"Techniques in Software Development"));
        courses.add(new Course("CSC 501",3,2,5,1,null,"Introduction to Operations Research"));
        courses.add(new Course("CSC 515",3,2,5,1,null,"Database Design and Management"));
        courses.add(new Course("CSC 523",3,2,5,1,null,"Mathematical Programming"));
        courses.add(new Course("CSC 503",3,3,5,1,null,"Individual Project I"));
        courses.add(new Course("CSC 504",3,3,5,2,null,"Individual Project II"));
        //computer science with maths restricted electives
        courses.add(new Course("CSC 507",3,2,5,1,null,"Computers in Society(R.E)"));
        courses.add(new Course("CSC 521",3,2,5,1,null,"Modeling and Simulation(R.E)"));
        courses.add(new Course("CSC 513",3,2,5,1,null,"Principles Applications of Data mining(R.E)"));
        courses.add(new Course("MTH 209",3,2,5,1,null,"Introduction to Real Analysis(R.E)"));
        courses.add(new Course("MTH 210",3,2,5,1,null,"Mechanics(R.E)"));
        //economics option restricted electives
        courses.add(new Course("CSC 507",1,2,5,1,null,"Computers in Society(R.E)"));
        courses.add(new Course("CSC 521",1,2,5,1,null,"Modeling and Simulation(R.E)"));
        courses.add(new Course("CSC 513",1,2,5,1,null,"Principles Applications of Data mining(R.E)"));
        String mi="micahel";



        //with economics
        courses.add(new Course("ECN 203",1,3,2,1,null,"Introduction to Applied Economics I"));
        courses.add(new Course("ECN 201",1,3,2,1,null,"Principles of Economics I"));
        courses.add(new Course("ECN 204",1,3,2,2,"ECN 203","Introduction to Applied Economics II"));
        courses.add(new Course("ECN 202",1,3,2,2,"ECN 201","Principles of Economics II"));
        courses.add(new Course("ECN 301",1,3,3,1,null,"Microeconomics Theory I"));
        courses.add(new Course("ECN 313",1,3,3,1,null,"Statistical Theory I"));
        courses.add(new Course("ECN 302",1,3,3,2,null,"Microeconomics Theory II"));
        courses.add(new Course("ECN 314",1,3,3,2,null,"Statistical Theory II"));
        courses.add(new Course("ECN 401",1,3,4,1,null,"Macroeconomic Theory II"));
        courses.add(new Course("ECN 421",1,3,4,1,null,"Applied Economics Statistics"));

        //with mathematics
        courses.add(new Course("MTH 205",3,3,2,1,null,"Introduction to Algebra"));
        courses.add(new Course("STT 201",3,3,2,1,null,"Introduction to Statistics"));
        courses.add(new Course("MTH 306",3,3,2,2,null,"Groups and Rings"));
        courses.add(new Course("STT 202",3,4,2,2,null,"Probability Distribution I"));
        courses.add(new Course("MTH 301",3,3,3,1,null,"Mathematical Methods III"));
        courses.add(new Course("MTH 302",3,3,3,2,null,"Mathematical Methods IV"));
        //engineering
        courses.add(new Course("CPE 303",2,2,3,1,null,"Introduction to Computer Engineering"));
        courses.add(new Course("CPE 309",2,1,3,1,null,"Computer Engineering Lab. I"));
        courses.add(new Course("EEE 301",2,2,3,1,"EEE 201","Physical Electronics"));
        courses.add(new Course("EEE 309",2,3,3,1,null,"Signals"));
        courses.add(new Course("MEE 303",2,3,3,1,"MEE 206","Fluid Mechanics I"));
        courses.add(new Course("MSE 201",2,3,3,1,null,"Elements of Engineering Materials"));
        courses.add(new Course("CPE 314",2,1,3,2,"CPE 309","Computer Engineering Laboratory II"));
        courses.add(new Course("EEE 302",2,3,3,2,"EEE 301","Electronics Engineering"));
        courses.add(new Course("CSC 315",2,3,4,1,null,"Data Structures & Analysis of Algorithms"));
        courses.add(new Course("CPE 409",2,2,4,1,"CPE 303","Microprocessor Design Laboratory"));
        courses.add(new Course("CPE 509",2,2,5,1,"CPE 405","Hardware Design Laboratory"));
        courses.add(new Course("CPE 511",2,3,5,1,null,"Computer based Real-Time System Design"));
        courses.add(new Course("CPE 521",2,2,5,1,null,"Modeling & Simulation"));
        courses.add(new Course("CPE 503",2,3,5,1,null,"Individual Project I"));
        courses.add(new Course("CPE 504",2,3,5,2,null,"Individual Project II"));

        courses.add(new Course("CHE 201",2,3,2,1,null,"Introduction to Thermodynamics"));
        courses.add(new Course("MSE 201",2,3,2,1,null,"Elements of Engineering Materials"));
        courses.add(new Course("MEE 205",2,3,2,1,null,"Engineering Mechanics I"));
        courses.add(new Course("EEE 201",2,2,2,1,"PHY 102","Applied Electricity I"));
        courses.add(new Course("EEE 291",2,1,2,1,null,"Applied Electricity Lab. I"));
        courses.add(new Course("AGE 202",2,2,2,2,null,"Workshop Practice"));
        courses.add(new Course("CVE 202",2,3,2,2,"MEE 205","Strength of Materials"));
        courses.add(new Course("MEE 206",2,3,2,2,"MEE 205","Engineering Mechanics II"));
        courses.add(new Course("EEE 202",2,2,2,2,"EEE 201","Applied Electricity II"));
        courses.add(new Course("EEE 292",2,1,2,2,"EEE 201","Applied Electricity Lab. II"));
        courses.add(new Course("CHE 305",2,3,3,1,"MTH 202","Engineering Analysis I"));
        courses.add(new Course("CHE 306",2,3,3,2,"CHE 305","Engineering Analysis II"));
        courses.add(new Course("AGE 302",2,2,3,2,null,"Statistics for Engineers"));

        //chemistry courses
        courses.add(new Course("CHM 101",4,4,1,1,null,"Introductory Chemistry I"));
        courses.add(new Course("CHM 102",4,4,1,2,null,"Introductory Chemistry II"));
        courses.add(new Course("CHM 103",4,1,1,1,null,"Practical Chemistry I"));
        courses.add(new Course("CHM 104",4,1,1,2,null,"Practical Chemistry II"));
        //tpd courses
        courses.add(new Course("TPD 101",4,1,1,1,null,"Engineers in Society"));
        courses.add(new Course("TPD 501",4,2,4,1,null,"Industrial and Engineering Economics"));
        courses.add(new Course("TPD 503",4,2,5,1,null,"Production/Operations Management & Industrial Law"));
        courses.add(new Course("TPD 502",4,2,5,2,null,"Technology Policy"));
        //mathematics
        courses.add(new Course("MTH 101",4,5,1,1,null,"Elementary Mathematics I"));
        courses.add(new Course("MTH 102",4,5,1,2,null,"Elementary Mathematics II"));
        courses.add(new Course("MTH 104",4,2,1,2,null,"Vectors"));
        courses.add(new Course("MTH 201",4,4,2,1,"MTH 102","Mathematical Methods I"));
        courses.add(new Course("MTH 202",4,4,2,2,"MTH 201","Mathematical Methods II"));
        //physics
        courses.add(new Course("PHY 101",4,4,1,1,null,"General Physics I"));
        courses.add(new Course("PHY 102",4,4,1,2,null,"General Physics II"));
        courses.add(new Course("PHY 107",4,1,1,1,null,"Experimental Physics IA"));
        courses.add(new Course("PHY 108",4,1,1,2,null,"Experimental Physics IB"));
        //Swies
        courses.add(new Course("CVE 401",4,3,4,1,null,"Technical Report Writing"));
        courses.add(new Course("CSC 200",4,3,4,2,null,"Student Industrial Work Experience Scheme I"));
        courses.add(new Course("CSC 300",4,3,4,2,null,"Student Industrial Work Experience Scheme II"));
        courses.add(new Course("CSC 400",4,9,4,2,null,"Student Industrial Work Experience Scheme III"));
        courses.add(new Course("MEE 203",4,2,2,1,null,"Engineering Drawing I"));
        courses.add(new Course("MEE 204",4,2,2,2,"MEE 203","Engineering Drawing II"));
        //computer course
        courses.add(new Course("CSC 201",4,3,2,1,null,"Computer Programming I"));
        courses.add(new Course("CSC 202",4,2,2,2,null,"Computer Programming II"));

        //Engineering course


    }
    public static void addData(Context context){
        CourseData db=new CourseData(context);
        if(db.isEmpty()){
            addCourse();
            db.addCourse(courses);
        }

    }

    


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentdetails;

/**
 *
 * @author Assistanz
 */
public class Student {

    String name,roll;
    int m1,m2,m3,m4,m5,total;
    float avg;

    public Student() {
        
    }
    void setdetails(String name,String roll,int m1,int m2,int m3,int m4,int m5)
    {
        this.name=name;
        this.roll=roll;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
        this.m5=m5;
        this.total = m1+m2+m3+m4+m5;
        this.avg = total/5;
    }
        

        
    

int gettotal()
{
    return total;
}
float getavg()
{
    return avg;
}
    
}

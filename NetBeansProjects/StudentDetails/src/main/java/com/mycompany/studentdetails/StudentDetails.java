/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentdetails;
import java.io.*;
/**
 *
 * @author Assistanz
 */
public class StudentDetails {
    Student st;
    View v;
    public static void main(String args[])
    {
        try
        {
        String name,roll;
        int m1,m2,m3,m4,m5,total = 0;
        float avg = 0;
        DataInputStream din=new DataInputStream(System.in);
        System.out.println("\tSTUDENT DETAILS");
        System.out.println("Enter Student Name:");
        name=din.readLine();
        System.out.println("Enter Student RollNo:");
        roll=din.readLine();
        System.out.println("Enter Mark1:");
        m1=Integer.parseInt(din.readLine());
        System.out.println("Enter Mark2:");
        m2=Integer.parseInt(din.readLine());
        System.out.println("Enter Mark3:");
        m3=Integer.parseInt(din.readLine());
        System.out.println("Enter Mark4:");
        m4=Integer.parseInt(din.readLine());
        System.out.println("Enter Mark5:");
        m5=Integer.parseInt(din.readLine());
        Student st=new Student();
        st.setdetails(name, roll, m1, m2, m3, m4, m5);
        View v=new View();
        v.printdetails(name, roll, m1, m2, m3, m4, m5,st.gettotal(),st.getavg());
        }
        catch(IOException | NumberFormatException e)
        {
            System.out.println(e);
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentdetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;

/**
 *
 * @author Assistanz
 */
public class View {
    Student st;
    int total;
    float avg;
    
   
    
void printdetails(String name,String roll,int m1,int m2,int m3,int m4,int m5,int total,float avg)
{
    

      try 
      {
          this.total=total;
    this.avg=avg;
    String str;
    System.out.println("\n\n---------------");
    System.out.println("Name:"+name);
    System.out.println("Roll:"+roll);
    System.out.println("Mark1:"+m1);
    System.out.println("Mark2:"+m2);
    System.out.println("Mark3:"+m3);
    System.out.println("Mark4:"+m4);
    System.out.println("Mark5:"+m5);
    System.out.println("Total Marks:"+total);
    System.out.println("Average:"+avg);
    System.out.println("\n---------------");
    
    
          
     
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","l3tm3in");
           
            
            
            Statement stmt = con.createStatement();
            
           
            
            str = "insert into stdd values('"+name+"','"+roll+"','"+m1+"','"+m2+"','"+m3+"','"+m4+"','"+m5+"','"+total+"','"+avg+"')";
            
            stmt.executeUpdate(str);
            
if(m1<40||m2<40||m3<40||m4<40||m5<40)
{
   System.out.println("Fail");
}
else
{
    System.out.println("Pass");
}
            
        
    
}
      catch(ClassNotFoundException | SQLException e)
      {
      System.out.println(e);
      }

}
}

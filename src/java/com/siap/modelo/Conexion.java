/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siap.modelo;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

/**
 *
 * @author mpcs
 */
public class Conexion {
    
   public static final String usr="root";
   public static final String pass="";
   public static final String host="0.0.0.0";
   public static final String port="32768";
   public static final String database="siap";
   public static final String classname="com.mysql.jdbc.Driver";
   public static final String url="jdbc:mysql://"+host+":"+port+"/"+database;
   
   public java.sql.Connection con;
   
   public Conexion(){
    
    try {
        Class.forName(classname);
        con= DriverManager.getConnection(url,usr,pass);
    }catch(ClassNotFoundException e){
        System.out.println("Error");
    }catch (SQLException e){
        System.out.println("Error 2");
    } 
   
   
   }
   
//    public static void main(String[] args) {
//        Conexion cone = new Conexion();
//        //para probar la conexion
//    }
}

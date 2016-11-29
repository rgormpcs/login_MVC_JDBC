/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siap.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mpcs
 */
public class Consultas extends Conexion{
    
    public boolean Autenticacion (String contrasenia, String email){
        try {
            Statement st= con.createStatement();
            String Consulta ="Select * from usuarios";
            ResultSet rs= null;
            rs = st.executeQuery(Consulta);
            
            while (rs.next()) {
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("contrasenia"));
                
                
                if (email.equals(rs.getString("email")) && contrasenia.equals(rs.getString("contrasenia"))){
                    System.out.println("encontrado");
                 return true;
                }else{
                    System.out.println("no se enconrto");
                }
                    
                    
                    
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    
//    public static void main(String[] args) {
//        Consultas consulta = new Consultas();
//        System.out.println(consulta.Autenticacion("Ricardo", "ricardo@gmail.com"));
//    }
    
}

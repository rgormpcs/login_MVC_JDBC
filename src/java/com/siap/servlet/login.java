/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siap.servlet;

import com.siap.modelo.Consultas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mpcs
 */
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
            /* TODO output your page here. You may use following sample code. */
            response.setContentType("text/html;charset=UTF-8");
        String email = request.getParameter("txtEmail");
        String pass = request.getParameter("txtContra");
        

        response.setContentType("text/html;charset=UTF-8");
        Consultas con = new Consultas();
//        para imprimir en servlet

//        try (PrintWriter out = response.getWriter()) {
//        out.println("<h1>Enviado " + email+" contraseña:" +pass + "</h1>");
//        out.println(con.Autenticacion(email, pass));
//        }
System.out.println("<h1>Enviado " + email + " contraseña:" + pass + "</h1>");
//       System.out.println(con.Autenticacion(pass, email));
    
    if(con.Autenticacion(pass, email)){
    response.sendRedirect("pages/bienvenido.html");
    }else{
    response.sendRedirect("pages/login.jsp");
    }
    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

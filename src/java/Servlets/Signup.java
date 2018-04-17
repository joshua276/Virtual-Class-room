/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Shashwat Kadam
 */
public class Signup extends HttpServlet {

    private static final String U_NAME = "Shashwat";
    private static final String PWD = "";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/VirtualClass";

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        String name = (String) (request.getParameter("fname") + "+" + request.getParameter("lname"));
        String U_Name = (String) request.getParameter("u_name");
        String password = (String) request.getParameter("pass1");
        String type = request.getParameter("type1");
        out.println(U_Name + "\t" + password + "\t" + type + "\t" + name);
        Connection con = null;
        Statement smt;
        String query = "INSERT INTO `login` (`UserName`,`Password`,`Type`,`Name`) VALUES ('" + U_Name + "','" + password + "','" + type + "','" + name + "')";
        out.println(query);

        ResultSet res = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                out.println("CLASS NOT FOUND!");
            }
            con = DriverManager.getConnection(CONN_STRING, U_NAME, PWD);
            smt = con.createStatement();
            smt.executeUpdate(query);
            System.out.println("Executed!!");
            if (type.equals("faculty")) {
                query = "INSERT INTO `facultydata` (`USERNAME`,`FIRSTNAME`,`LASTNAME`,`PHONE`,`EMAIL`,`ADDRESS`,`COLLEGE`,`SUBJECTS`) VALUES ('" + U_Name + "','" + (String) (request.getParameter("fname")) + "','" + (String) (request.getParameter("lname")) + "','NULL','NULL','NULL','NULL','NULL')";
                System.out.println(query);
                smt.executeUpdate(query);
                System.out.println("Inserted into faculty database");
            }
            if (type.equals("student")) {
                query = "INSERT INTO `studentdata` (`USERNAME`,`FIRSTNAME`,`LASTNAME`,`EMAIL`,`PHONE`,`ADDRESS`,`COLLEGE`,`BIO`) VALUES ('" + U_Name + "','" + (String) (request.getParameter("fname")) + "','" + (String) (request.getParameter("lname")) + "','NULL','NULL','NULL','NULL','NULL')";
                System.out.println(query);
                smt.executeUpdate(query);
                System.out.println("Inserted into student database");
            }
            rd.forward(request, response);

        } catch (SQLException e) {
            out.println(e);
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

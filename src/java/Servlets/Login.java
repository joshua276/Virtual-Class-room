/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Shashwat Kadam
 */
public class Login extends HttpServlet {

   

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
        //out.println("Servlet: " + request.getPathInfo());;
        HttpSession Session;
        String U_NAME = "Shashwat";
        String PWD = "";
        String CONN_STRING = "jdbc:mysql://localhost:3306/virtualclass";
        Connection con = null;
        RequestDispatcher r1 = request.getRequestDispatcher("index.jsp");
        RequestDispatcher r2 = request.getRequestDispatcher("StudentDashboard.jsp");
        RequestDispatcher r3 = request.getRequestDispatcher("FacultyDashboard.jsp");
        String driver = "com.mysql.jdbc.Driver";
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pass");
        String type_of_login = request.getParameter("type");
        out.println("\t" + uname + "\t" + pwd + "\t" + type_of_login);
        ResultSet rs = null;
        
        //************************* Database Connectivity *************************//
        try {
            try{
                Class.forName("com.mysql.jdbc.Driver");
            }catch(ClassNotFoundException e){
                out.println("CLASS NOT FOUND!");
            }
            con = DriverManager.getConnection(CONN_STRING, U_NAME, PWD);
            Statement smt = con.createStatement();
            System.out.println("Statement Created!");
            try {
                String query = "SELECT * FROM `Login` WHERE `UserName`='" + uname + "' AND `Password`='" + pwd + "' AND `Type`= '" + type_of_login + "'";
                rs = smt.executeQuery(query);
                System.out.println("EXECUTED!");
                //System.out.println(rs.getString("UserName"));
                if (rs.next()) {
                    if (rs.getString("UserName").equals(uname)
                            && rs.getString("Password").equals(pwd)
                            && rs.getString("Type").equals(type_of_login)
                            && type_of_login.equals("student")) {
                        out.println("STUDENT");
                        Session = request.getSession(true);
                        Session.setAttribute("UNAME",uname);
                        Session.setAttribute("PWD",pwd);
                        Session.setAttribute("Name",rs.getString("Name"));
                        Session.setAttribute("TYPE", type_of_login);
                        r2.forward(request, response);
                    } else if (rs.getString("UserName").equals(uname)
                            && rs.getString("Password").equals(pwd)
                            && rs.getString("Type").equals(type_of_login)
                            && type_of_login.equals("faculty")) {
                        out.println("FAcULTY");
                        Session = request.getSession(true);
                        Session.setAttribute("UNAME",uname);
                        Session.setAttribute("PWD",pwd);
                        Session.setAttribute("TYPE", type_of_login);
                        Session.setAttribute("Name",rs.getString("Name"));
                        r3.forward(request, response);
                    } else {
                        out.println("<script>window.alert(\"Login Failed!\");</script>");
                        response.sendRedirect("index.jsp");
                    }
                }
            } catch (MySQLSyntaxErrorException e) {
                //e.printStackTrace();
                out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
            //e.printStackTrace();
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

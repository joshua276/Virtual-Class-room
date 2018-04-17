/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author Shashwat Kadam
 */
public class UpdateProfileFaculty extends HttpServlet {
    private final String CONN_STRING = "jdbc:mysql://localhost:3306/virtualclass";
    private final String U_NAME = "Shashwat";
    private final String PWD = "";
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
        HttpSession session = request.getSession(false);
        RequestDispatcher rd = request.getRequestDispatcher("FacultyDashboard.jsp");
        String FirstName = null;
        String LastName = null;
        String UserName = (String) session.getAttribute("UNAME");
        Connection conn = null;
        if (session != null) {
            if (!request.getParameter("fname").isEmpty()) {
                FirstName = (String) request.getParameter("fname");
                System.out.println(FirstName);
            } else {
                FirstName = session.getAttribute("Name").toString().subSequence(0, session.getAttribute("Name").toString().indexOf("+")).toString();
                System.out.println(FirstName);
            }
            System.out.println("First Name is " + FirstName);

            if (!request.getParameter("lname").isEmpty()) {
                LastName = (String) request.getParameter("lname");
                System.out.println(LastName);
            } else {

                LastName = session.getAttribute("Name").toString().subSequence(session.getAttribute("Name").toString().indexOf("+") + 1, session.getAttribute("Name").toString().length()).toString();
                System.out.println(LastName);
            }

            System.out.println("Last Name is " + LastName);
            UserName = (String) session.getAttribute("UNAME");
        }
        
        try{
            try{
                Class.forName("com.mysql.jdbc.Driver");
            }catch(ClassNotFoundException e){
                System.out.println("CLASS NOT FOUND!");
            }
            conn = DriverManager.getConnection(CONN_STRING,U_NAME,PWD);
            Statement smt = conn.createStatement();
            String sql = "UPDATE `facultydata` SET `EMAIL` = '" + (String) request.getParameter("email")
                        + "', `PHONE` = '" + (String) request.getParameter("phone")
                        + "', `ADDRESS` = '" + (String) request.getParameter("address")
                        + "', `COLLEGE` = '" + (String) request.getParameter("college")
                        + "', `SUBJECTS` = '" + (String) request.getParameter("sub")
                        + "', `FIRSTNAME` = '" + FirstName
                        + "', `LASTNAME` = '" + LastName
                        + "'   WHERE `facultydata`.`USERNAME` = '" + UserName + "';";
            smt.executeUpdate(sql);
            System.out.println("Query Executed!");
            rd.forward(request, response);
        }catch(SQLException e){
            out.println("SQLException!");
        }
        finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UpdateProfileFaculty.class.getName()).log(Level.SEVERE, null, ex);
            }
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

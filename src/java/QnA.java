/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class QnA extends HttpServlet {

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
        RequestDispatcher rd = request.getRequestDispatcher("QnA.jsp");
        HttpSession session = request.getSession(false);
        String Question = (String) request.getParameter("question");
        String Posted_By = null;
        if (session != null) {
            Posted_By = (String) session.getAttribute("UNAME");
        }
        Connection conn = null;
        ResultSet res = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            conn = DriverManager.getConnection(CONN_STRING, U_NAME, PWD);
            Statement smt = conn.createStatement();
            if (!Question.isEmpty()) {
                String sql = "INSERT INTO `virtualclass`.`studentquestiontable` (`QUESTION`,`ANSWER`,`POSTED_BY`,`ANSWERED_BY`,`WATCHED`) VALUES ('" + Question + "','','" + Posted_By + "','','-1');";
                smt.executeUpdate(sql);
                System.out.println("Query  {"+sql+"} Executed!!");
                
            }
            rd.forward(request,response);

        } catch (SQLException ex) {
            System.out.println("SQL Exception");
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QnA.class.getName()).log(Level.SEVERE, null, ex);
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

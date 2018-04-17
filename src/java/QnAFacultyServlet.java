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
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Shashwat Kadam
 */
public class QnAFacultyServlet extends HttpServlet {

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
        RequestDispatcher rd = request.getRequestDispatcher("FacultyDashboard.jsp");
        HttpSession session = request.getSession(false);
        String[] Params = new String[(int) session.getAttribute("Num")];
        int i,j;
        for (i = 0; i < Params.length; i++) {
            Params[i] = (String) request.getParameter("param" + i);
        }
        for (i = 0; i < Params.length; i++) {
            System.out.println(i + " " + Params[i] + " " + Params[i].isEmpty());
        }
        String[] Questions = new String[(int) session.getAttribute("Num")];
        String Answer;
        Connection conn = null;
        //Connection conn2 = null;
        Statement smt1 = null;
        //Statement smt2 = null;
        ResultSet res = null;
        ResultSet res2 = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("CLASS NOT FOUND!");
            }
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtualclass", "Shashwat", "");
            //conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtualclass", "Shashwat", "");
            smt1 = conn.createStatement();
            //smt2 = conn.createStatement();
            String sql;
            System.out.println("1");
            String sql2 = "SELECT * FROM `virtualclass`.`studentquestiontable` WHERE `WATCHED`='-1'";
            res = smt1.executeQuery(sql2);
            res2 = smt1.executeQuery(sql2);
            j = 0;
            int count = 0;
            while(res2.next()){
                Questions[j] = res2.getString("QUESTION");
                j++;
                count++;
            }
            for(j = 0;j<Questions.length;j++){
                System.out.println(j + " " + Questions[j] );
            }
            System.out.println("Query Executed!!");
            i = 0;
            //int flag = 1;
            while (count>0) {
                Answer = Params[i];
                if(!Answer.isEmpty()){
                    sql = "UPDATE `virtualclass`.`studentquestiontable` SET `ANSWER` = '" + Answer + "',`WATCHED` = '1',`ANSWERED_BY`='" + session.getAttribute("UNAME") + "' WHERE `WATCHED` = '-1' AND `QUESTION` = '" + Questions[i] + "';";
                    smt1.executeUpdate(sql);
                }else if(Answer.isEmpty()){
                    sql = "UPDATE `virtualclass`.`studentquestiontable` SET `ANSWER` = '" + Answer + "'  WHERE `WATCHED` = '-1' AND `QUESTION` = '"+Questions[i]+"';";
                    smt1.executeUpdate(sql);
                }
                
                i++;
                count--;

            }
            rd.forward(request, response);
        } catch (SQLException e) {
            System.out.println(e);
            //rd.forward(request, response);
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

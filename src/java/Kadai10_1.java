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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author takamasa
 */
@WebServlet(name = "Kadai10_1", urlPatterns = {"/Kadai10_1"})
public class Kadai10_1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        
        
        response.setContentType("text/html;charset=UTF-8");
        Connection con =null;
        Statement stmt = null;
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Kadai10_1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Servlet Ex101 at " + request.getContextPath() + "</h3>");
            
            //Class.forNameの記述
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            //データベースへの接続
            String driverUrl = "jdbc:derby://localhost:1527/twitter";
            con = DriverManager.getConnection(driverUrl, "db", "db");

            stmt = con.createStatement();

            String sql = "select * from T_TWEET";
            ResultSet rs = stmt.executeQuery(sql);

            //SQL文の発行
            /*-- 自分で書こう --*/
            //データベースから値を取得して出力
            while (rs.next()) {

                out.println("tweetno=" + rs.getInt("tweetno") + "<br>");
                out.println("twitter_id=" + rs.getString("twitter_id") + "<br>");
                out.println("tweettext=" + rs.getString("tweettext") + "<br>");
                out.println("iine=" + rs.getInt("iine") + "<hr>");
            }

            out.println("</body>");
            out.println("</html>");
            //ResultSetのclose
            rs.close();

            
        } catch (Exception e) {
            //サーブレット内での例外をアプリケーションのエラーとして表示
            throw new ServletException(e);
        } finally {
            //例外が発生する・しないにかかわらず確実にデータベースから切断
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new ServletException(e);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new ServletException(e);
                }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Kadai10_1.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Kadai10_1.class.getName()).log(Level.SEVERE, null, ex);
        }
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

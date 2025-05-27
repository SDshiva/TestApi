/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package features.register.api;

import features.register.dao.RegistrationDao;
import features.register.dto.req.RegistrationReq;
import features.register.dto.res.RegistrationRes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;

/**
 *
 * @author fazlerabbikhan
 */
@WebServlet(name = "RegistrationApi", urlPatterns = {"/v1/register"})
public class RegistrationApi extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistrationApi</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistrationApi at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
//        processRequest(request, response);
        
        String reqCode = request.getParameter("reqCode");
        System.out.println("reqCode = " + reqCode);

        if (reqCode.equals("1")) {

            String userName = request.getParameter("userName");
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            RegistrationDao dao = new RegistrationDao();
            RegistrationReq reqModel = new RegistrationReq();
            reqModel.setUserName(userName);
            reqModel.setEmail(email);
            reqModel.setPassword(password);
            
            System.out.println("LoginReq Mdoel: "+reqModel.toString());

            RegistrationRes res = dao.register(reqModel);
            
            JSONObject json = new JSONObject();
            json.put("outCode", res.getOutCode());
            json.put("outMessage", res.getOutMessage());
            
            response.getWriter().write(json.toString()); 
            
        }else{
           JSONObject json = new JSONObject();
            json.put("outCode", "1");
            json.put("outMessage", "Invalid RequestCode");
            
            response.getWriter().write(json.toString()); 
        }
//        else if (reqCode.equals("2")) {
//
//            String token = request.getParameter("token");
//            System.out.println("token = " + token);
//
//            LoginDao dao = new LoginDao();
//            
//            UserDetailsReq reqModel = new UserDetailsReq();
//            reqModel.setToken(token);
//            
//
//            UserDetailsRes res = dao.userDetails(reqModel);
//            
//            JSONObject json = new JSONObject();
//            json.put("outCode", res.getOutCode());
//            json.put("outMessage", res.getOutMessage());
//            json.put("naem", res.getName());
//            json.put("nid", res.getNid());
//            json.put("address", "Dhak");
//            json.put("mobile", res.getMobile());
//            
//            response.getWriter().write(json.toString()); 
//        }
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package features.thrid_party_api_calling.utility_bills_wasit.api;

import core.utility.JsonDecoder;
import features.thrid_party_api_calling.utility_bills_wasit.dao.WasitUtilityBillDao;
import features.thrid_party_api_calling.utility_bills_wasit.dto.req.WasitUtilityBillReq;
import features.thrid_party_api_calling.utility_bills_wasit.dto.res.WasitUtilityBillRes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author fazlerabbikhan
 */
@WebServlet(name = "WasitUtilityBillApi", urlPatterns = {"/v1/utility-bill-wasit"})
public class WasitUtilityBillApi extends HttpServlet {

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
            out.println("<title>Servlet WasitUtilityBillApi</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet WasitUtilityBillApi at " + request.getContextPath() + "</h1>");
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
try {
//            int counter = 0;

            StringBuffer jb = new StringBuffer();
            String line = null;
            try {
                BufferedReader reader = request.getReader();
                while ((line = reader.readLine()) != null) {
//                    System.out.println(counter + " - " + line);
                    jb.append(line);
//                    counter++;
                }
            } catch (Exception e) {
                System.out.println("Request Body Receiving Err: " + e.toString());
            }
            
            JSONParser parser = new JSONParser();
            JSONObject jsonReq = (JSONObject) parser.parse(jb.toString());
            System.out.println(jsonReq.toString());
            
            String token = JsonDecoder.getJsonValue(jsonReq, "token");
            String id = JsonDecoder.getJsonValue(jsonReq, "id");
            String billType = JsonDecoder.getJsonValue(jsonReq, "billType");
            
            WasitUtilityBillReq reqModel = new WasitUtilityBillReq();
            reqModel.setToken(token);
            reqModel.setId(id);
            reqModel.setBillType(billType);
            
            WasitUtilityBillDao dao = new WasitUtilityBillDao();
            WasitUtilityBillRes res = new WasitUtilityBillRes();
            
            res = dao.getBillDetails(reqModel);
            
            JSONObject json = new JSONObject();
            json.put("outCode", res.getOutCode());
            json.put("outMessage", res.getOutMessage());
            json.put("amount", res.getAmount());
            json.put("date", res.getDate());
            json.put("billName", res.getBillName());

            response.getWriter().write(json.toString());
            
        } catch (Exception e) {
            System.out.println("Request Body Receiving Err: " + e.toString());
            
            JSONObject json = new JSONObject();

            WasitUtilityBillRes res = new WasitUtilityBillRes();
            res.setOutCode("1");
            res.setOutMessage("Overa all Server Err !" + e.toString());

            json.put("outCode", res.getOutCode());
            json.put("outMessage", res.getOutMessage());
            

            response.getWriter().write(json.toString());
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

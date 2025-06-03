/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package features.thrid_party_api_calling.nano_loan_dashboard.api;

import core.utility.JsonDecoder;
import features.thrid_party_api_calling.nano_loan_dashboard.dao.NanoLoanDashboardDao;
import features.thrid_party_api_calling.nano_loan_dashboard.dto.req.NanoLoanDashboardReq;
import features.thrid_party_api_calling.nano_loan_dashboard.dto.res.NanoLoanDashboardRes;
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
@WebServlet(name = "NanoLoanDashboardApi", urlPatterns = {"/v1/nano-loan-dashboard"})
public class NanoLoanDashboardApi extends HttpServlet {

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
            out.println("<title>Servlet NanoLoanDashboardApi</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NanoLoanDashboardApi at " + request.getContextPath() + "</h1>");
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
            StringBuffer jb = new StringBuffer();
            String line = null;
            try {
                BufferedReader reader = request.getReader();
                while ((line = reader.readLine()) != null) {
                    jb.append(line);
                }
            } catch (Exception e) {
                System.out.println("Request Body Receiving Err: " + e.toString());
            }

            JSONParser parser = new JSONParser();
            JSONObject jsonReq = (JSONObject) parser.parse(jb.toString());
            System.out.println(jsonReq.toString());

            String userId = JsonDecoder.getJsonValue(jsonReq, "userId");
            String authToken = JsonDecoder.getJsonValue(jsonReq, "authToken");

//            String authToken = request.getHeader("Authorization");
//            String userId = request.getHeader("userId");

            NanoLoanDashboardReq req = new NanoLoanDashboardReq();

            NanoLoanDashboardDao dao = new NanoLoanDashboardDao();
            NanoLoanDashboardRes res = new NanoLoanDashboardRes();

            req.setUserId(userId);
            req.setAuthToken(authToken);

            res = dao.getDashboard(req);

            JSONObject json = new JSONObject();

            json.put("outCode", res.getOutCode());
            json.put("outMessage", res.getOutMessage());
            json.put("tREQ", res.gettREQ());
            json.put("tSUC_REQ", res.gettSUC_REQ());
            json.put("tFAIL_REQ", res.gettFAIL_REQ());
            json.put("tDSB_REQ", res.gettDSB_REQ());

            json.put("tREQ_AMT", res.gettREQ_AMT());
            json.put("tDSB_AMT", res.gettDSB_AMT());
            json.put("tDSB_DBT_AMT", res.gettDSB_DBT_AMT());
            json.put("tDSB_CH_AMT", res.gettDSB_CH_AMT());
            json.put("tDSB_VAT_AMT", res.gettDSB_VAT_AMT());

            json.put("fV_REQ", res.getfV_REQ());
            json.put("fV_AUTO", res.getfV_AUTO());
            json.put("fV_MANUAL", res.getfV_MANUAL());
            json.put("fV_PENDING", res.getfV_PENDING());

            json.put("cIB_REQ", res.getcIB_REQ());
            json.put("cIB_VERIFIED", res.getcIB_VERIFIED());
            json.put("cIB_CL", res.getcIB_CL());
            json.put("cIB_UCL", res.getcIB_UCL());
            json.put("cIB_PENDING", res.getcIB_PENDING());

            response.getWriter().write(json.toString());
        } catch (Exception e) {
            System.out.println("Request Body Receiving Err: " + e.toString());

            JSONObject json = new JSONObject();

            NanoLoanDashboardRes res = new NanoLoanDashboardRes();
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

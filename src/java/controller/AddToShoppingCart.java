/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ratchaphum
 */
public class AddToShoppingCart extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    private int countParameters(Enumeration<String> enumeration) {
        int count = 0;
        while (enumeration.hasMoreElements()) {
            enumeration.nextElement();
            count++;
        }
        return count;
    }


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //เอาเป็นชื่อหนังมาเป็น Enumeration<String>
        Enumeration<String> e = request.getParameterNames();
        
        //นับจำนวนหนัง
        int movieAmount = countParameters(e);
        
        // สร้าง List<String> ชื่อ QuantityList
        List<String> quantityList = new ArrayList<>();
    
    // ใช้ลูปเพื่อดึงค่าจำนวนสินค้าของแต่ละหนัง
        for (int i = 0; i < movieAmount; i++) {
            // นำค่าจำนวนสินค้าจาก request.getParameter("QuantityInput+i") และเพิ่มลงใน quantityList
            String quantityParamName = "QuantityInput" + i;
            String quantityValue = request.getParameter(quantityParamName);
            quantityList.add(quantityValue);
        }
        
        
        
       
        
        request.setAttribute("test0" , quantityList.get(0));
        request.setAttribute("test1" , quantityList.get(1));
        request.setAttribute("test2" , quantityList.get(2));
        
        //ส่งไป addtoshoppingcart_result.jsp
        request.getRequestDispatcher("addtoshoppingcart_result.jsp").forward(request, response);
        
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

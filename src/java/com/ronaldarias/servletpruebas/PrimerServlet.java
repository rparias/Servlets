package com.ronaldarias.servletpruebas;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PrimerServlet", urlPatterns = {"/PrimerServlet"})
public class PrimerServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Especificamos formato de respuesta
        PrintWriter salida = response.getWriter();
        
        //Generar respuesta
        salida.println("<!DOCTYPE html>");
        salida.println("<html>");
        salida.println("<head>");
        salida.println("<title>Servlet PrimerServlet</title>");            
        salida.println("</head>");
        salida.println("<body>");
        salida.println("<h1 style = 'text-align:center'>Primer Servlet</h1>");
        salida.println("");
        salida.println("");
        salida.println("");
        salida.println("");
        salida.println("");
        salida.println("Fecha y hora actual: " + new Date());
        salida.println("</body>");
        salida.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

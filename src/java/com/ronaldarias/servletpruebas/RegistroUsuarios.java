package com.ronaldarias.servletpruebas;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ronald.arias
 */
@WebServlet(name = "RegistroUsuarios", urlPatterns = {"/RegistroUsuarios"})
public class RegistroUsuarios extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        
        PrintWriter salida = response.getWriter();
        salida.println("<html><body>");
        salida.println("Nombre introducido: " + request.getParameter("nombre"));
        salida.println("<br><br>");
        salida.println("Apellido introducido: " + request.getParameter("apellido"));
        salida.println("</body></html>");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

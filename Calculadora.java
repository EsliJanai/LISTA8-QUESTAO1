package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int numero1 = Integer.parseInt(request.getParameter("numero1"));
        int numero2 = Integer.parseInt(request.getParameter("numero2"));
        
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2;
        int resto = numero1 % numero2;
        
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<html><head><title>Resultados</title></head><body>");
        response.getWriter().println("<h1>Resultados das Operações</h1>");
        response.getWriter().println("<p>Número 1: " + numero1 + "</p>");
        response.getWriter().println("<p>Número 2: " + numero2 + "</p>");
        response.getWriter().println("<p>Soma: " + soma + "</p>");
        response.getWriter().println("<p>Subtração: " + subtracao + "</p>");
        response.getWriter().println("<p>Multiplicação: " + multiplicacao + "</p>");
        response.getWriter().println("<p>Divisão: " + divisao + "</p>");
        response.getWriter().println("<p>Resto da Divisão: " + resto + "</p>");
        response.getWriter().println("</body></html>");
    }
}


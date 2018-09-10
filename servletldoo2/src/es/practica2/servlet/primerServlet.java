package es.practica2.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class primerServlet
 */
@WebServlet("/primerServlet")
public class primerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public primerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Especificamos formato de respuesta
		
		PrintWriter salida=response.getWriter();
		
		//Generar respuesta de la peticion 
		
		salida.println("<html><body>");
		
		salida.println("<h1 style='text-align:center'>Prueba Servlet</h1>");
		
		salida.println("");
		salida.println("");
		salida.println("");
		salida.println("");
		
		salida.println("Fecha y hora actual: " + new Date());
		salida.println("</body></html>");
		
		
		
	    String ip = null; // IP del cliente
	    String host = null; // Host del cliente
	     
	    ip = request.getRemoteAddr();
	    host = request.getRemoteHost();
	    
	    PrintWriter out = response.getWriter();
	    response.setContentType("text/html");
	   
	    
	    out.println("<html><head><title>Obtener IP del cliente</title></head><body>");
	    out.println("<strong>Obtener la IP del cliente </strong>");
	    out.println("La ip del cliente es " + ip + "<br>");
	    out.println("El host del cliente es " + host);
	    out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

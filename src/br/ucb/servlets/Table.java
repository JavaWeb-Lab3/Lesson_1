package br.ucb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.classes.Person;

/**
 * Servlet implementation class Table
 */
@WebServlet("/Table")
public class Table extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Table() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Person ana = new Person("Ana");
		Person carol = new Person("Carol");
		Person beatriz = new Person("Beatriz");
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td>Nome</td>");
		out.println("<td>Idade</td>");
		out.println("<td>Sexo</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>" + ana.getName() +"</td>");
		out.println("<td>" + ana.getAge() +"</td>");
		out.println("<td>" + ana.getSex() +"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>" + beatriz.getName() +"</td>");
		out.println("<td>" + beatriz.getAge() +"</td>");
		out.println("<td>" + beatriz.getSex() +"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>" + carol.getName() +"</td>");
		out.println("<td>" + carol.getAge() +"</td>");
		out.println("<td>" + carol.getSex() +"</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

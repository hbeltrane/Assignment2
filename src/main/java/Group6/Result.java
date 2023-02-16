package Group6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Group6
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Result() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String from=request.getParameter("from");
        String to=request.getParameter("to");
        String depart=request.getParameter("depart");
        String ret=request.getParameter("return");
        // Double gpa=Double.parseDouble(request.getParameter("email"));
        //String sdate = request.getParameter("dob");
        out.println("<table>");
        out.println("<tr><td>");
        out.println("Your flight from "+from+" to "+to+"</td></tr>");
        out.println("<tr><td>");
        out.println("Departs at "+depart+" and returns at "+ret+"</td></tr>");
        //out.println("<tr><td>Resume :</td><td>"+resume+"</td></tr>");
        //out.println("<tr><td>DOB :</td><td>"+sdate+"</td></tr>");
        out.println("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

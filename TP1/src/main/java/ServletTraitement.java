

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTraitement
 */
@WebServlet("/ServletTraitement")
public class ServletTraitement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTraitement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String sexe=request.getParameter("sexe");
		String mr;
		if (sexe=="H")
			mr="Monsieur";
			else
				mr="Madame";
		out.println("Bonjour "+mr+" "+request.getParameter("nom")+" "+request.getParameter("prenom")+".");
		String [] loisirs =request.getParameterValues("Loisirs");
		out.println("mes loisirs sont : ");
		for(int i=0;i<loisirs.length;i++)
		{
			out.println(loisirs[i]);
			out.println(",");

		}
		String [] fonctions =request.getParameterValues("fonction");
		out.println(" .et je suis : ");

		for(int i=0;i<fonctions.length;i++)
		{
			out.println(fonctions[i]);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package org.singleton.project.web.client;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.singleton.project.api.App;
import org.singleton.project.api.AppOne;
import org.singleton.project.ejb.NoInterfaceBeanOne;
import org.singleton.project.ejb.NoInterfaceBeanTwo;


/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private App app;
	
	@EJB
	private App app1;
	
	@EJB
	private AppOne appOne;
	
	@EJB
	private AppOne appTwo;
	
	
	
	@EJB
	private NoInterfaceBeanOne one;
	
	@EJB
	private NoInterfaceBeanTwo two;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print(app.doSomething());
		response.getWriter().print(">>>>>>>><<<<<<<<<<<<<<<<");
		response.getWriter().print("\nApp and AppOne: "+app.equals(appOne));
		response.getWriter().print("\nAppOne and App: "+appOne.equals(app));
		response.getWriter().print(">>>>>>>><<<<<<<<<<<<<<<<");
		response.getWriter().print("\nApp and App: " +app.equals(app1));
		response.getWriter().print(">>>>>>>><<<<<<<<<<<<<<<<");
		response.getWriter().print("\nAppOne and AppTwo: "+appOne.equals(appTwo));
		// To see if two singleton instances of two no interface singleton bean is same or not
		response.getWriter().print("\nNoInterfaceOne and NoInterfaceTwo: "+one.equals(two));

	}

}

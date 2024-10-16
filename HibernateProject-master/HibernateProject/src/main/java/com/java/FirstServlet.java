package com.java;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		String name = request.getParameter("Username");
		String pass = request.getParameter("Password");

		LoginPage lp = new LoginPage();
		lp.setUsername(name);
		lp.setPassword(pass);
		System.out.println(name +   pass);
		Controller c = new Controller();
		System.out.println("object create controller");
		c.connect();
		System.out.println("connect method call..!");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}

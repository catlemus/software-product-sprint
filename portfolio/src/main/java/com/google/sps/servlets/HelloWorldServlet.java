package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    //private int views = 0;

    @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    //views ++;

    response.setContentType("text/html;");
    response.getWriter().println("Hello World!");
    //response.getWriter().println("<h3>This page has been checked out "+views+" times</h3>");
}
}

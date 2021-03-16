package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {


  private static final long serialVersionUID = 6734233536872851287L;

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String nameText = request.getParameter("name");
    String emailText = request.getParameter("email");
    String factText = request.getParameter("fun-fact");
    String subjectText = request.getParameter("subject");
   

    // Print the value so you can see it in the server logs.
    System.out.println(nameText + "'s' information is: " + emailText);
    System.out.println("They want to talk about " + subjectText 
        + " and their fun fact is " + factText);

    // Write the value to the response so the user can see it.
    response.getWriter().println("You submitted: " + nameText + " , " + emailText + " , " 
        + factText + " , " + subjectText);

    //redirect after the submit back to the main page
    response.sendRedirect("https://clemus-sps-spring21.appspot.com/");
  }
}
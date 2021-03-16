package com.google.sps.servlets;

import java.io.IOException;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  String[] factList = {"I like purple", "I have 4 dogs", "I love soccer"};

  private static final long serialVersionUID = 1L;
  

  @Override
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
    

    Gson gson = new Gson();
    String json = gson.toJson(factList);

    response.setContentType("application/json;");
    response.getWriter().println(json);
    
    
}
}

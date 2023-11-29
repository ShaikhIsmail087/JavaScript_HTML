package com.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/api/myendpoint")
public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//server running on >>>>>>   http://localhost:8080/ServletBackend/api/myendpoint
    	// Set CORS headers
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type");

        // Your existing logic to handle the request goes here...

        // Send the response
        PrintWriter out = response.getWriter();
        out.println("Your response data");
        out.flush();
        // Handle GET request
        response.getWriter().write("Hello from Servlet!");
    }
}
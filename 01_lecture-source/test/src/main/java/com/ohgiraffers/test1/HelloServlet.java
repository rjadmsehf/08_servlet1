package com.ohgiraffers.test1;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "test1", value = "/test1")
public class HelloServlet extends HttpServlet {
    private String message;



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>진짜 뭐하지~</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
package com.ohgiraffers.section01.forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/print")
public class PrintLoginSuccessServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userId = (String) req.getAttribute("userId");

        System.out.println("forward 해서 전달 받은 userId :" + userId);

        StringBuilder responseText = new StringBuilder();
        responseText.append("<!doctype html>\n")
                .append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head></head>\n")
                .append("<body>\n")
                .append("<h1>" + userId +"님환영 </h1>")
                .append("</body>\n")
                .append("</html>");

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print(responseText.toString());

        out.flush();
        out.close();

    }
}

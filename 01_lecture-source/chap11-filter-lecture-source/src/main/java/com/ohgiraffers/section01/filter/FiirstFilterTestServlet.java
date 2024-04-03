package com.ohgiraffers.section01.filter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/first/filter")
public class FiirstFilterTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Servlet 요청 확인....");

//        resp.setContentType("text/html; charset=UTF-8");       //필기 xml 파일로 설정한 UTF-8 가 있기때문에 주석처리시 깨지지않는다.

        PrintWriter out = resp.getWriter();
        out.println("<!doctype html");
        out.println("<html>");
        out.println("<head>");
        out.println("<body>");
        out.println("<h3> 필터확인용 서블릿 요청 확인 완료!!</h3>");
        out.println("</body>");
        out.println("</head>");
        out.println("</html>");

        out.flush();
        out.close();

    }
}

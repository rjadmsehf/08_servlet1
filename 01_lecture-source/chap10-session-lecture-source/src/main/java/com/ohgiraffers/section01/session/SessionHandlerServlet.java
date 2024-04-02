package com.ohgiraffers.section01.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/session")
public class SessionHandlerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName =req.getParameter("firstName");
        String lastName =req.getParameter("lastName");

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        HttpSession session = req.getSession();

        /* 필기.  session 기본 만료시간 30분 = 1800 */
        System.out.println("session 의 기본 만료 시간 : " + session.getMaxInactiveInterval());

        session.setMaxInactiveInterval(60*10);      // 필기 10분
        System.out.println("변경 후 session 의 만료 시간 : " + session.getMaxInactiveInterval());

        // session 은 브라우저 당 한 개씩 고유한 아이디를 가지고 하나의
        // 인스턴스를 이용한다. 매번 반복 시 동일한 session id 를 반환한다.
        System.out.println("session id : " + session.getId());

        /* 필기.
        *   만든 session 에 공유할 값 담기
        *   setAttribute(String key, object value) 형태로 담는다.
        *   getAttribute(key) <- 값을 꺼낼 때 사용
        * */
        session.setAttribute("firstName",firstName);
        session.setAttribute("lastName",lastName);

        resp.sendRedirect("redirect");


    }
}

package com.ohgiraffers.section01.othersite;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/othersite")
public class OtherSiteRedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("get 요청 받은 후 naver 사이트로 이동하니?");

        /* 필기
             network tap 을 확인해보면 302번 상태 코드와 함께
             naver 사이트로 이동하는 것을 볼 수 있다.
             사용자 url 재작성이라고 불리우는 redirect 방식은
             302번 상태 코드인 경우 요청에 대한 처리를 완료하였고,
             사용자의 url을 강제로 redirect 경로로 이동시키라는
             의미이다.
         */

        resp.sendRedirect("https://www.naver.com");




    }
}

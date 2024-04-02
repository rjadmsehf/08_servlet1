package com.ohgiraffers.section03.status;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/status")
public class StatusCodeTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


//        resp.sendError(404,"페이지가 없어연... 찾아봤는데 없구만요....");
        resp.sendError(500, "서버 내부 오류 입니다, 서버오류는 오직 개발자의 잘못이며 개발자는 여러분입니다. 비이이상 초비이이이상 !!!!");
    }
}

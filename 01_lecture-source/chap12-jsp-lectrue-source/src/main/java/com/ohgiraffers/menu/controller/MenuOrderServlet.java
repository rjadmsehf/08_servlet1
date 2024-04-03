package com.ohgiraffers.menu.controller;

import com.ohgiraffers.menu.model.service.MenuPriceCalculator;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/menu/order")
public class MenuOrderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        
        /* 필기
            서블릿(servlet)의 역할 
            1. 요청 받은 값 확인 및 검증
            2. 비지니스 로직 처리   
            3. 응답 페이지 생성 후 응답 -> jsp 위임 
         */
        
        String menuName = req.getParameter("menuName");
        int amount = Integer.parseInt(req.getParameter("amount"));

        System.out.println("메뉴이름 = " + menuName);
        System.out.println("수량 = " + amount);

        /*필기 비지니스 로직
              menuName, amount 를 넘겨서 으리가 선택한 메뉴와 갯수 에 대한 총 가격을 반환 */
        int orderPrice = new MenuPriceCalculator().calcOrderPrice(menuName,amount);

        req.setAttribute("menuName" ,menuName);
        req.setAttribute("amount" , amount);
        req.setAttribute("orderPrice", orderPrice);

        // 필기 forward(req , resp)
        RequestDispatcher rd = req.getRequestDispatcher("/jsp/5_response.jsp");
        rd.forward(req,resp);


    }
}

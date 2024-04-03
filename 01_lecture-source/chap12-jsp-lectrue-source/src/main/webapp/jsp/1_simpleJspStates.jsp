<%@ page import="java.util.Scanner" %><%--
  Created by IntelliJ IDEA.
  User: 나
  Date: 2024-04-03
  Time: AM 10:56
  To change this template use File | Settings | File Templates.
--%>

<!-- 필기. 지시자 태그 (page,include, taglib) 지시자 태그가 있다.-->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>JSP Simple states</h1>
    <!-- HTML 주석 -->
    <%-- JSP 주석 --%>

    <%-- 필기.  선언(declare) 태그 <%!%> --%>
    <%!
        private String name;
        private int age;
    %>

    <%-- 필기. 스크립트릿 태그 <%%>--%>
    <%
        Scanner sc = new Scanner(System.in);
        name = "전준규";
        age = 24;

        System.out.println("name = " + name);
        System.out.println("age = " + age);             // 필기 컴파일에서의 출력구문

        for (int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
    %>

    <%-- 필기. 표현(expression)태그 --%>
    name : <%= name %>
    <br>
    age : <%= age%>
</body>
</html>

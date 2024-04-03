<%@ page import="java.util.Date" errorPage="errorPage.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Date date =new Date();
        System.out.println("date = " + date);

        String str = null;
        char ch =str.charAt(0); // 필기 NullPointerException 고의 발생
    %>
</body>
</html>

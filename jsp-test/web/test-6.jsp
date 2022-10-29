<%@page import="demo.User1"%>
<%--
  Created by IntelliJ IDEA.
  User: shuaifei
  Date: 2022/10/26
  Time: 8:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>验证登录信息</title>
</head>
<body>

</body>
<%
request.setCharacterEncoding("UTF-8");
response.setCharacterEncoding("UTF-8");
    String loginUsername = request.getParameter("loginUsername");
    String loginPassword = request.getParameter("loginPassword");
    User1 user = (User1) session.getAttribute("User");
    if(user.getUsername().equals(loginUsername)&&user.getPassword().equals(loginPassword))
    {
       response.sendRedirect(request.getContextPath()+"./test-4.jsp");


    }else{
        System.out.println("账号或者密码错误");
    response.sendRedirect(request.getContextPath()+"./test-7.jsp");

        }

%>
</html>

<%@ page import="demo2.book" %><%--
  Created by IntelliJ IDEA.
  User: shuaifei
  Date: 2022/10/26
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>接收表单</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    book book=new book();
    int bookId=Integer.parseInt(request.getParameter("bookId"));
    int Count=Integer.parseInt(request.getParameter("Count"));
    String bookName=request.getParameter("bookName");
    String author=request.getParameter("author");
    book.setBookId(bookId);
    book.setAuthor(author);
    book.setBookName(bookName);
    book.setCount(Count);
    session.setAttribute("book",book);
    response.sendRedirect(request.getContextPath()+"/book/book3.jsp");
%>
</body>
</html>

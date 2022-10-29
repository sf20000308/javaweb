<%@ page import="demo2.book" %>
<%--
  Created by IntelliJ IDEA.
  User: shuaifei
  Date: 2022/10/26
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    book book=null;
    book= (book) session.getAttribute("book");
%>
<table>
    <tr>
        <td>
            书本编号：
        </td>
        <td>
            <%=book.getBookId()%>
        </td>
    </tr>
    <tr>
        <td>
           书本名：
        </td>
        <td>
            <%=book.getBookName()%>
        </td>
    </tr>
    <tr>
        <td>
            姓名：
        </td>
        <td>
            <%=book.getAuthor()%>
        </td>
    </tr>
    <td>
       价格
    </td>
    <td>
        <%=book.getCount()%>
    </td>
    </tr>

</table>
</body>
</html>

<%@ page import="demo.User1" %><%--
  Created by IntelliJ IDEA.
  User: shuaifei
  Date: 2022/10/26
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%User1 user1= (User1) session.getAttribute("User");%>
<h1>个人信息预览</h1>
<table>
    <tr>
        <td>
            用户名：
        </td>
        <td>
            <%=user1.getUsername()%>
        </td>
    </tr>
    <tr>
        <td>
            密码：
        </td>
        <td>
            <%=user1.getPassword()%>
        </td>
    </tr>
    <tr>
        <td>
            姓名：
        </td>
        <td>
            <%=user1.getRealName()%>
        </td>
    </tr>
    <tr>
        <td>
            年龄：
        </td>
        <td>
            <%=user1.getAge()%>
        </td>
    </tr>
    <tr>
        <td>
            性别：
        </td>
        <td>
            <%=user1.getSex()%>
        </td>
    </tr>
</table>

</body>
</html>

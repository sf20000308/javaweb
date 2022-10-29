<%--
  Created by IntelliJ IDEA.
  User: shuaifei
  Date: 2022/10/26
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>长方形</title>
</head>
<body>
<jsp:useBean id="c" class="demo2.Square" scope="page"/>
<form  action="" method="post" name="form">
    输入长方形的长：<input type="text" name="length">
    输入长方形的宽：<input type="text" name="width">
    <button>提交</button>
</form>
<%
String str1=request.getParameter("length");
String str2=request.getParameter("width");
if (str1==null||str2==null){
    str1="";
    str2="";
}
try {
    double newlength=Double.parseDouble(str1);
    double newwidth=Double.parseDouble(str2);
    c.setLength((int) newlength);
    c.setWidth((int) newwidth);
}catch (NumberFormatException e){
    e.printStackTrace();
}
%>
<p>
   <b>长方形的周长是：<%out.println(c.SquareLength());%></b>
    <b>长方形的面积是：<%=c.SquareArea()%></b>

</p>
</body>
</html>
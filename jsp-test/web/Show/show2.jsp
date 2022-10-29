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
    <title>Title</title>
</head>
<body>
<jsp:useBean id="d" class="demo2.ZFX" scope="page"/>

    <form   action="" method="post" name="form">
    输入正方形的边长：<input type="text" name="side">
    <button>提交</button>
    </form>
    <%
    String str1=request.getParameter("side");
    if (str1==null){
        str1="";
    }
    try {
        double newside=Double.parseDouble(str1);
        d.setSide((int) newside);

    }catch (NumberFormatException e){
        e.printStackTrace();
    };
    %>
    <p>
    <b>正方形的周长是：<%=d.ZFXlength()%></b>
    <b>正方形的面积是：<%=d.ZFXarea()%></b>
    </p>
<jsp:useBean id="f" class="demo2.Circle" scope="page"/>
<form action="" method="post" name="form">
    输入圆的半径：<input   type="text" name="R">
    <button>提交</button>
</form>
<%
String str2=request.getParameter("R");
if (str2==null){
    str2="";
}

    try {
        double newR=Double.parseDouble(str2);
        f.setR(newR);
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
<p>
    <b>圆形的周长是:<%=f.Rlength()%></b>
    <b>圆形的面积是:<%=f.Rarea()%></b>
</p>
</body>
</html>

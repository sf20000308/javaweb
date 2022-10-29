<%--
  Created by IntelliJ IDEA.
  User: shuaifei
  Date: 2022/10/27
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Triangular</title>
</head>
<body>
<jsp:useBean id="g" class="demo2.Triangular" scope="page"/>
<form action="" method="post" name="form">
    输入三角形的a边<input type="text" name="a">
    输入三角形的b边<input type="text" name="b">
    输入三角形的c边<input type="text" name="c">
    <button>提交</button>
</form>
<%
String str1=request.getParameter("a");
String str2=request.getParameter("b");
String str3=request.getParameter("c");
if (str1==null||str2==null||str3==null){
    str1="";
    str2="";
    str3="";
}

    try {
        double newa=Double.parseDouble(str1);
        double newb=Double.parseDouble(str2);
        double newc=Double.parseDouble(str3);
        g.setA(newa);
        g.setB(newb);
        g.setC(newc);
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
<p>
    <b>三角形的周长：<%=g.Triangularlength()%></b>
    <b>三角形的面积：<%=g.Triangulararea()%></b>
</p>
</body>
</html>

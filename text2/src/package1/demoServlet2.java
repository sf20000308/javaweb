package package1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.applet.Applet;
import java.io.IOException;

public class demoServlet2 extends HttpServlet {
    //doGet（）在get请求的时候调用
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("helloServlet的doGet方法");

        String name=req.getParameter("name");
        resp.setHeader("content-type","text/html;charset=utf-8");
        resp.getWriter().write("<h1>"+name+"欢迎您！</h1>");
        //String getMethod():获取请求方法：GET
        String method=req.getMethod();
        System.out.println(method);
        //String getContextPath():获取虚拟目录（项目访问路径）：/request-demo
        String contextPath=req.getContextPath();
        System.out.println(contextPath);
        StringBuffer url= req.getRequestURL();
        System.out.println(url.toString());
        //String getRequestURI():获取URI（统一资源标识符）：/request-demo/req1
        String uri=req.getRequestURI();
        System.out.println(uri);
        //String getWueryString():获取请求参数（GET方式）：username=zhangsan
        String queryString=req.getQueryString();
        System.out.println(queryString);
        String agent=req.getHeader("user-agent");
        System.out.println(agent);
    }
    //post（）在post请求的时候调用
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        System.out.println("helloServlet的doPost方法");
    }
}

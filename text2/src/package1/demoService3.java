package package1;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/web")
public class demoService3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //   1.解决乱码：POST,getReader()
        req.setCharacterEncoding("UTF-8");
            //GET请求逻辑
        //System.out.println("get...");
        //1.获取所有参数Map集合
           Map<String,String[]> map =req.getParameterMap();
           for (String key: map.keySet()){
               System.out.print(key+":");
               //获取值
               String[] values=map.get(key);
               for (String value:values){
                   System.out.print(value+" ");
               }
               System.out.println();
           }
           //2.根据key获取参数值，数组
//        System.out.println("---------------");
//           String[] hobbies= req.getParameterValues("hobby");
//           for (String hobby:hobbies){
//              System.out.println(hobby);
//          }
           //3.根据key获取单个参数值
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        System.out.println(username);
        System.out.println(password);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //POST请求逻辑
        //1.POST：设置输入流的编码
        req.setCharacterEncoding("UTF-8");
            this.doGet(req, resp);
//        System.out.println("post...");
//        //1.获取所有参数Map集合
//        Map<String,String[]> map =req.getParameterMap();
//        for (String key: map.keySet()){
//            System.out.print(key+":");
//            //获取值
//            String[] values=map.get(key);
//            for (String value:values){
//                System.out.print(value+" ");
//            }
//            System.out.println();
//        }
//        //2.根据key获取参数值，数组
//        System.out.println("---------------");
//        String[] hobbies= req.getParameterValues("hobby");
//        for (String hobby:hobbies){
//            System.out.println(hobby);
//        }
//        //3.根据key获取单个参数值
//        String username=req.getParameter("username");
//        String password=req.getParameter("password");
//        System.out.println(username);
//        System.out.println(password);
    }

    @WebServlet(name = "req4")
    public static class requestDemo4 extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }
    }
}

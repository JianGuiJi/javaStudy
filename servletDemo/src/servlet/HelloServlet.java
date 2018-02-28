package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet  extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        System.out.println("处理Get请求……");
        PrintWriter out=resp.getWriter();
        resp.setContentType("text/html;charset=utf-8");
        out.println("<strong>Helllo Servlet</strong>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        System.out.println("处理Post请求……");
        PrintWriter out=resp.getWriter();
        resp.setContentType("text/html;charset=utf-8");
        out.println("<strong>Helllo Servlet</strong>");
    }
}

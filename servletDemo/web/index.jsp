<%--
  Created by IntelliJ IDEA.
  User: jijg
  Date: 2018-01-30
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  <body>
  <h1>第一个Servlet 小例子</h1>
  <hr>
  <a href="servlet/HelloServlet">Get方式请求 HelloServlet</a>
  <form action="servlet/HelloServlet" method="post">
    <input type="submit" value="Post方式请求 HelloServlet 2">
  </form>
  </body>
</html>

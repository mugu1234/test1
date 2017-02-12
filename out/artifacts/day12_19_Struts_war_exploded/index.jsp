<%--
  Created by IntelliJ IDEA.
  User: gent
  Date: 2016/12/19
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Struts 入门案例</title>
  </head>
  <body>
     <%--默认拦截扩展名为.action的请求--%>
    <a href="${pageContext.request.contextPath}/addUser.action">用户添加</a>
     <a href="${pageContext.request.contextPath}/updateUser.action">用户更新</a>
     <a href="${pageContext.request.contextPath}/addUser.action">用户删除 </a>
  </body>
</html>

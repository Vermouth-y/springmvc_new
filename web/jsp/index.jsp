<%--
  Created by IntelliJ IDEA.
  User: q1591
  Date: 2020-03-17
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${msg}</title>
</head>
<body>

    <span><a href="../user/my/pathAnt">Path Ant</a> </span><br>
    <span><a href="../user/rest/1">Rest GET</a> </span><br>

    <form action="../user/rest" method="post">
        <input type="submit" value="Rest POST" />
    </form>

    <form action="../user/rest/1" method="post">

        <!-- 添加名为_method的隐藏域，并赋值为DELETE，HiddenHttpMethodFilter正是通过该隐藏域的值将POST请求转换成DELETE请求 -->
        <input type="hidden" name="_method" value="DELETE" />
        <input type="submit" value="Rest DELETE" />
    </form>


    <form action="../user/rest/1" method="post">
        <!-- 添加名为_method,值为PUT的隐藏域，HiddenHttpMethodFilter正是通过该隐藏域的值将POST请求转换为PUT请求 -->
        <input type="hidden" name="_method" value="PUT"/>
        <input type="submit" value="Rest PUT" />
    </form>
</body>
</html>

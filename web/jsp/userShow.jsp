<%--
  Created by IntelliJ IDEA.
  User: q1591
  Date: 2020-03-20
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>用户展视</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>用户名</th>
            <th>密码</th>
            <th>地址</th>
        </tr>
        <tr>
            <td>${msg.username}</td>
            <td>${msg.password}</td>
            <td>${msg.address}</td>
        </tr>
    </table>
</body>
</html>

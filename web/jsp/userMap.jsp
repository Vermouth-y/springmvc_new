<%--
  Created by IntelliJ IDEA.
  User: q1591
  Date: 2020-03-21
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数绑定控制器方法的Map对象</title>
</head>
<body>
    <form action="../user/getUser" method="post">
        <div>
            <label for="username">username1:</label>
            <input type="text" name="userMap['u1'].username" id="username"/>
        </div>
        <div>
            <label for="password">password1:</label>
            <input type="password" name="userMap['u1'].password" id="password"/>
        </div>
        <div>
            <label for="province">province1:</label>
            <input type="text" name="userMap['u1'].address.province" id="province"/>
        </div>
        <div>
            <label for="city">city1:</label>
            <input type="text" name="userMap['u1'].address.city" id="city"/>
        </div>
        <div>
            <label for="username2">username2:</label>
            <input type="text" name="userMap['u2'].username" id="username2"/>
        </div>
        <div>
            <label for="password2">password2:</label>
            <input type="password" name="userMap['u2'].password" id="password2"/>
        </div>
        <div>
            <label for="province2">province2:</label>
            <input type="text" name="userMap['u2'].address.province" id="province2"/>
        </div>
        <div>
            <label for="city2">city2:</label>
            <input type="text" name="userMap['u2'].address.city" id="city2"/>
        </div>
        <div>
            <input type="submit" value="提交"/>
        </div>
    </form>
</body>
</html>

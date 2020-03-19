<%--
  Created by IntelliJ IDEA.
  User: q1591
  Date: 2020-03-19
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${msg}</title>
</head>
<body>
    <div>
        <form action="../user/saveUser" method="post">
            <div>
                <label for="username">
                    username:
                </label>
                <input type="text" name="username" id="username"/>
            </div>
            <div>
                <label for="password">
                    password:
                </label>
                <input type="password" name="password" id="password"/>
            </div>
            <div>
                <label for="province">
                    province:
                </label>
                <input type="text" name="address.province" id="province"/>
            </div>
            <div>
                <label for="city">
                    city:
                </label>
                <input type="text" name="address.city" id="city"/>
            </div>
            <div>
                <input type="submit" value="提交" />
            </div>
        </form>
    </div>
</body>
</html>

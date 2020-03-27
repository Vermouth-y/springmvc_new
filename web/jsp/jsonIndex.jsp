<%--
  Created by IntelliJ IDEA.
  User: q1591
  Date: 2020-03-27
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>json测试</title>
</head>
<script type="text/javascript" src="../static/jquery/jquery-3.4.1.js"></script>
<body>
    <p id="returnJson" onclick="getJson()">Test Json</p>
</body>
<script>
    $(document).ready(
        function getJson() {
            var url = "../user/returnJson";
            var args = {};
            $.post(url, args, function (data) {
            });
        }
    )
</script>
</html>

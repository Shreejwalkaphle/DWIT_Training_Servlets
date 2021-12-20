<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 12/17/2021
  Time: 7:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>LoginForm</title>
  </head>
  <body>
  <form action="/login" method="GET">
    <label for="USERNAME">USERNAME</label>
    <input type="text" name="username" placeholder="enter your username">
    <label for="USERNAME">PASSWORD</label>
    <input type="text" name="password" placeholder="enter your password">
    <input type="submit" name="submit" value="LOGIN">
  </form>
  </body>
</html>

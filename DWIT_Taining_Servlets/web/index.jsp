<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 12/15/2021
  Time: 7:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

    <form action="/login" method="post">
      <label for="userName">UserName</label>
      <input type="text" name="username" placeholder="enter your name">
      <label for="password">Password</label>
       <input type="password" name="password" placeholder="enter your password">
      <%--<label for ="male">male</label>
      <input type="radio" name="gender" value="male">
      <label for ="female">female</label>
      <input type="radio" name="gender" value="female">
      <label for="DROPDOWN">dropdown</label>
      <select name="course" id="course">
        <option value="java">java</option>
        <option value="csharp">C#</option>
        <option value="python">python</option>
      </select>
      <label for="CHECKBOX">CHECKBOX</label>
      Football<input type="checkbox" name="sport">
      Cricket<input type="checkbox" name="soprt" >
      Basketball<input type="checkbox" name="soprt" >--%>
      <input type="submit" value="LOGIN">
    </form>
  </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Namila
  Date: 11/18/2017
  Time: 12:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!Doctype html>
<html lang="en">
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<%--getting POJO data for User model--%>
    <s:form action="register"  method="post" >
        <s:textfield name="user.id" label="id"/>
        <s:textfield name="user.name" label="name"/>
        <s:textfield name="user.age" label="age"/>
        <s:textfield name="user.other" label="Other"/>
        <s:submit value="save"/>
    </s:form>

</body>
</html>

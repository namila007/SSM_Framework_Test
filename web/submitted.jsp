<%--
  Created by IntelliJ IDEA.
  User: Namila
  Date: 12/1/2017
  Time: 8:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Submitted</title>
</head>
<body>
<p>ID=<s:property value="%{user.id}"/> <b>
    name=
    <s:property value="%{user.name}"/> is submitted</p>
</body>
</html>
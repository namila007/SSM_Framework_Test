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
<!Doctype <!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>


    <s:form action="register"  method="post" >
        <s:textfield name="id" label="id"></s:textfield>
        <s:textfield name="name" label="name"></s:textfield>
        <s:textfield name="age" label="age"></s:textfield>
        <s:textfield name="other" label="Other"></s:textfield>
        <s:submit value="register"></s:submit>
    </s:form>

</body>
</html>

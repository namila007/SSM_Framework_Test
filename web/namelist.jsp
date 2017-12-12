<%--
  Created by IntelliJ IDEA.
  User: Namila
  Date: 12/11/2017
  Time: 1:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<s:iterator value="namelist">
    <tr>
        <s:property value="name"/>
    </tr>
</s:iterator>

</body>
</html>
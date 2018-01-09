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
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!Doctype html>
<html lang="en">
<head>
    <s:head/>
    <sj:head/>

    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>


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


&nbsp;
<br>
<br>

<s:form action="getnames" method="POST">
    <s:textfield name="userNames.name" label="name"/>
    <s:submit value="Submit"/>
</s:form>

&nbsp;
<br>
<br>

<script type='text/javascript'>

    $(document).ready(function() {
        $(function() {
            $("#user1").autocomplete({
                source : function(request, response) {
                    $.ajax({
                        url: "userinput.html",
                        type: "Post",
                        data:JSON.stringify({"name": request.term}),
                        contentType: "application/json",
                        dataType: "json",
                        success : function(data) {
                            response(data.names);

                            console.log(data.names);
                            console.log(request.term);
                        }
                    });
                }
            });
        });
    });


    function getname() {
        var text1 = document.getElementById("user1").value.trim();
        var respond;
        console.log(text1);
        $.ajax({
            url: "userinput.html",
            type: "Post",
            data: JSON.stringify({"name": text1}),
            contentType: "application/json",
            dataType: "json",
            success: function (resp) {


               respond=resp.names;
                console.log(respond);
                $('#user1').autocomplete({
                    source: respond.names});
            },

        })

    }
</script>
<s:url var="remoteurl" action="autoCompleterAction"/>
<%--<sj:autocompleter
        id="user"
        name="user"
        href="%{remoteurl}"
        delay="50"
        loadMinimumCount="2"
        onkeyup="getname()"


/>--%>


<s:url var="url" action="listJSON"/>
<s:textfield   name="user1" id="user1" href="%{remoteurl}" class="user1"/>


</body>
</html>

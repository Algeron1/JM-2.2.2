<%--@elvariable id="name" type="java"--%>
<%--@elvariable id="head" type="java"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title>Web Page</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<body>
<center>
    <h1><s:message code="head"></s:message></h1>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2><s:message code="head"></s:message></h2></caption>
        <a href="/cars?locale=en">English</a> |
        <a href="/cars?locale=ru">Русский</a> |
        <tr>
            <th>ID</th>
            <th><s:message code="name"></s:message></th>
            <th><s:message code="color"></s:message></th>
            <th><s:message code="number"></s:message></th>
        </tr>
        <%--@elvariable id="cars" type="java.util.List"--%>
        <c:forEach var="car" items="${cars}">
            <tr>
                <td><c:out value="${car.id}" /></td>
                <td><c:out value="${car.name}" /></td>
                <td><c:out value="${car.color}" /></td>
                <td><c:out value="${car.series}" /></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>

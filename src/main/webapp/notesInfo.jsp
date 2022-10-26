<%--
  Created by IntelliJ IDEA.
  User: aleksandr
  Date: 11.10.2022
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info</title>
</head>
<body>
<jsp:include page="include.jsp"/>
<jsp:include page="header.jsp"/>

<main>
    <c:out value="${netbook.company}"/>
    <c:out value="${netbook.model}"/>
    <c:out value="${netbook.price}"/>

    <c:forEach var="image" items="${images}">
        <img src="${image.uri}" width="100" height="100">
    </c:forEach>
</main>
</body>
<jsp:include page="footer.jsp"/>
</html>

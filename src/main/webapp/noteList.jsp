<%--
  Created by IntelliJ IDEA.
  User: aleksandr
  Date: 11.10.2022
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Note list</title>
</head>
<body>
<jsp:include page="include.jsp"/>
<jsp:include page="header.jsp"/>

<main>
  <div class="row col-sm-12">
    <c:forEach var="notebook" items="${netbook}" varStatus="loop">
      <div class="col-sm-3">
        <div class="card" style="width: 18rem;">
          <img src="${previews[loop.index].uri}" class="card-img-top" height="100">
          <div class="card-body">
            <h5 class="card-title">${netbook.company}</h5>
            <p class="card-text">${netbook.model}</p>
            <form action="NotebookServlet" method="post">
              <input type="hidden" name="pk" value="${netbook.id}">
              <button class="btn btn-primary">${netbook.price}</button>
            </form>
          </div>
        </div>
      </div>
    </c:forEach>
  </div>
</main>
</body>
<jsp:include page="footer.jsp"/>
</html>

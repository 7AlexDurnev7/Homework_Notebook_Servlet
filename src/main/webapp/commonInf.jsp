<%--
  Created by IntelliJ IDEA.
  User: aleksandr
  Date: 09.10.2022
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Common information</title>
</head>
<body>
    <jsp:include page="include.jsp"/>
    <jsp:include page="header.jsp"/>

    <table class="table table-bordered" >
      <thead>
      <tr>
        <th scope="col"> <p>Manufacturer's name</p></th>
        <th scope="col">Country where the company is headquartered</th>
        <th scope="col">Manufacturer logo</th>
        <th scope="col">The number of employees</th>
        <th scope="col">Brief information about the manufacturer</th>
      </tr>
      </thead>
      <tbody>
      <tr>
        <td align="center"> <i> MacBook </i></td>
        <td align="center"> <i>Cupertino, California, USA</i></td>
        <td><img src="pictures/Apple-Logo.jpg" alt="" height="80"></td>
          <td align="center"> <i>154 000 </i></td>
        <td> <i>The MacBook is a brand of Mac notebook computers designed and marketed by Apple Inc. that use
            Apple's macOS operating system since 2006.</i></td>
      </tr>
      </tbody>
    </table>
    <jsp:include page="footer.jsp"/>
</body>
</html>

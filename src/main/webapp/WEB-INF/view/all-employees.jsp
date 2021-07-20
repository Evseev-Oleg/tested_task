<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>All Peoples</h2>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Patronymic</th>
        <th>Age</th>
    </tr>
    <c:forEach var="emp" items="${allEmps}">
        <tr>
            <td>${emp.firstName}</td>
            <td>${emp.lastName}</td>
            <td>${emp.patronymic}</td>
            <td>${emp.age}</td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="Fill-in form"
       onclick="window.location.href = 'addDetailsPeople'">
</body>
</html>
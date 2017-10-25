<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>products</title>
</head>
<body>
     <form method="post" action="<c:url value='/email/registerProduct'/>"  enctype="multipart/form-data">
    <table>
      <tr>
        <td>code: </td>
        <td><input type="text" name="code" /></td>
     </tr>
     <tr>
        <td>Description: </td>
        <td><input type="text" name="description"/></td>
     </tr>
     <tr>
        <td>Price: </td>
        <td><input type="text" name="price"/></td>
     </tr> 
     <tr>
        <td>Portrait Photo: </td>
        <td><input type="file" name="photo" size="50"/></td>
     </tr>
     <tr>
      <td colspan="2"> <input type="submit" value="Save"></td>
     </tr>
   </table>
   </form>
</body>
</html>
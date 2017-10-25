<%@ page contentType="text/html; charset=UTF-8" %>

<jsp:include page="/includes/header.jsp" />
<jsp:include page="/includes/column_left_email.jsp" />

<div style="float:left;width: 404px; align:top;">
    
<h1>Thanks for joining our email list</h1>
<p>Here is the information that you entered:</p>

<table cellpadding="5" border="0">
    <tr>
        <td align="right">First name:</td>
        <td>${user.firstName}</td>
    </tr>
    <tr>
        <td align="right">Last name:</td>
        <td>${user.lastName}</td>
    </tr>
    <tr>
        <td align="right">Email address:</td>
        <td>${user.emailAddress}</td>
    </tr>
</table>
    
</div>

<jsp:include page="/includes/column_right_news.jsp" />
<jsp:include page="/includes/footer.jsp" />
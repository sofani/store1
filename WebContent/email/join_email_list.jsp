<%@ page contentType="text/html; charset=UTF-8" %>
<jsp:include page="/includes/header.jsp" />
<jsp:include page="/includes/column_left_email.jsp" />

<div style="float:left;width: 404px; align:top;">

<script language="JavaScript">
function validate(form)
{
    if (form.firstName.value=="") 
    {
        alert("Please fill in your first name");
        form.firstName.focus();
    }
    else if (form.lastName.value=="") 
    {
        alert("Please fill in your last name");
        form.lastName.focus();
    }
    else if (form.emailAddress.value=="") 
    {
        alert("Please fill in your email address");
        form.emailAddress.focus();
    }
    else 
    {
        form.submit();
    }
}
</script>

<h1>Join our email list</h1>
<p>If you do, we'll send you announcements about new releases and special offers.</p>

<p><i>${message}</i></p>

<form action="addToEmailList" method="post">
<table cellpadding="5" border="0">
    <tr>
        <td align="right"><p>First name:</td>
        <td><input type="text" name="firstName" 
                value="${user.firstName}">
        </td>
    </tr>
    <tr>
        <td align="right"><p>Last name:</td>
        <td><input type="text" name="lastName" 
                value="${user.lastName}">
        </td>
    </tr>
    <tr>
        <td align="right"><p>Email address:</td>
        <td><input type="text" name="emailAddress" 
                   value="${user.emailAddress}">
        </td>
    </tr>
    
    <tr>
        <td></td>
        <td><input type="button" value="Submit" 
                   onClick="validate(this.form)"></td>
    </tr>
</table>
</form>

</div>

<jsp:include page="/includes/column_right_news.jsp" />
<jsp:include page="/includes/footer.jsp" />
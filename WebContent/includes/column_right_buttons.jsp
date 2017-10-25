<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
   
   <!--  <link rel="stylesheet" href="/store1/murach.css"> -->
    <link rel="stylesheet" type="text/css" href="/store1/slide_show.css"/>
</head>
<div class="column_right-buttons">
 <a href="<c:url value='/cart/displayCart?productCode=${product.code}'/>">
    <img src="/store1/images/addtocart.gif" width="113" height="47">
 </a>
  <form target="paypal" action="https://www.paypal.com/cgi-bin/webscr" method="post" >
         <input type="hidden" name="cmd" value="_cart">
         <input type="hidden" name="business" value="sofanib@gmail.com">
         <input type="hidden" name="lc" value="US">
         <input type="hidden" name="item_name" value="${product.description}">
         <input type="hidden" name="amount" value="${product.priceCurrencyFormat}">
         <input type="hidden" name="currency_code" value="USD">
         <input type="hidden" name="button_subtype" value="products">
         <input type="hidden" name="no_note" value="0">
         <input type="hidden" name="add" value="1">
         <input type="hidden" name="bn" value="PP-ShopCartBF:btn_cart_LG.gif:NonHostedGuest">
         <input type="image" src="https://www.paypalobjects.com/en_US/i/btn/btn_cart_LG.gif" border="0" name="submit" alt="PayPal - The safer, easier way to pay online!">
         <img alt="" border="0" src="https://www.paypalobjects.com/en_US/i/scr/pixel.gif" width="1" height="1">
    </form>
 <br><br>
 <a href="<c:url value='/cart/displayCart'/>">
    <img src="/store1/images/showcart.gif" width="113" height="47">
 </a>
 <form target="paypal" action="https://www.paypal.com/cgi-bin/webscr" method="post" >
     <input type="hidden" name="cmd" value="_cart">
     <input type="hidden" name="business" value="sofanib@gmail.com">
     <input type="hidden" name="display" value="1">
     <input type="image" src="https://www.paypalobjects.com/en_US/i/btn/btn_viewcart_LG.gif" border="0" name="submit" alt="PayPal - The safer, easier way to pay online!">
     <img alt="" border="0" src="https://www.paypalobjects.com/en_US/i/scr/pixel.gif" width="1" height="1">
</form>
 <br><br>
 <a href="<c:url value='/c/checkPath' />">
        <img src="/store1/images/listen.gif" width="113" height="47">
 </a><br><br>
</div>
</html>
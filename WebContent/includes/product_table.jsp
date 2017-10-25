<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/slide_show.css"/>
</head>
<div class="product_table">
  <table>
   <tr>
  <td width="179">
    <img src="${product.imageURL}" width="175" height="175">
  </td>
  <td width="5">
  </td>
  <td width="187" valign="top">
    <h2>${product.artistName}</h2>
    <h3>${product.albumName}</h3>
    <p>${product.productType}<br>
     ${product.priceCurrencyFormat}</p>
    
  </td>
</tr>
</table>
</div>
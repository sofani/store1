<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
   <%@ page contentType="text/html; charset=UTF-8" %>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <link rel="stylesheet" type="text/css" href="/store1/slide_show.css"/>
</head>
<body>
   <%-- <jsp:include page="/includes/column_left_order.jsp" /> --%>
  <jsp:include page="/includes/header.jsp" /> 
<div class="henok"style="width: 100%;">
  <c:forEach var="product" items="${products}"> 
      
         <div style="width: 360px; height:200px;margin-left: 50px;margin-top: 5px;">
              <div style="width: 200px; height:200px;  border: ">
                 <img width="200px" height="200px" src="<c:url value='/cart/getImage?productCode=${product.code}'/>"/>
              </div>
             <div style="width: 140px; height:30px;   margin-left: 210px; margin-top: -200px; margin-bottom: 10px;" >
			     <a href="<c:url value='/c/displayPath?productCode=${product.code}'/>">
			         ${product.description}
			     </a>
			    
			    
             </div>
       
              <div  style="width: 140px; height:30px;  margin-left: 210px; margin-bottom: 10px ">
                   <select>
                        <option value="0">select size and its prize</option>
                       <option value="1">${product.priceCurrencyFormat} size 24</option>
                       <option value="2">${product.priceCurrencyFormat} size 22</option>
                       <option value="3">${product.priceCurrencyFormat}size 18</option>
                 </select>
             </div>
             <div  style="width: 140px; height:30px;   margin-left: 210px;">
                <%-- <a href="<c:url value='/cart/displayCart?productCode=${product.code}'/>">Add To Cart</a> --%>
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
             
             </div> 
   
        </div>
    
   
  
  </c:forEach>

</div>
  <jsp:include page="/includes/footer.jsp" /> 
</body>

</html>




  
<%@ page contentType="text/html; charset=UTF-8" %>

<jsp:include page="/includes/header.jsp" />
<jsp:include page="/includes/column_left_all.jsp" />

<!-- start the middle column -->

<div style="float:left;width: 404px; align:top;">

  <jsp:include page="/includes/product_table.jsp" />

  <p>To listen to a track, click on the audio format.</p>
        
  <table border="0">
    <tr>
      <td width="200"><b>Song title</b></td>
      <td width="100"><b>Audio Format</b></td>
    </tr>
    <tr><td>1. Pete and Jimmy</td></tr>
    <tr>
      <td>2. vodka Before Breakfast</td>
      <td><a href="/store1/sound/pf01/whiskey.mp3">MP3</a></td>
    </tr>
    <tr><td>3.country road</td></tr>
    <tr><td>4. unite africa</td></tr>
    <tr><td>5. hope and life</td></tr>
    <tr>
      <td>6. what's going on</td>
      <td width="40"><a href="/store1/sound/pf01/corvair.mp3">MP3</a></td>
    </tr>
    <tr><td>7.money</td></tr>
    <tr><td>8. i love san francisco</td></tr>
  
  </table>

</div>

<!-- end the middle column -->

<jsp:include page="/includes/column_right_buttons.jsp" />
<jsp:include page="/includes/footer.jsp" />
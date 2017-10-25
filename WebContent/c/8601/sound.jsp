<%@ page contentType="text/html; charset=UTF-8" %>
<jsp:include page="/includes/header.jsp" />
<jsp:include page="/includes/column_left_all.jsp" />

<!-- start the middle column -->

<div style="float:left;width: 404px; align:top;">

  <jsp:include page="/includes/product_table.jsp" />

  <p>To listen to a track, click on the audio format.</p>


   <table>
    <tr>
      <td width="200"><b>Song title</b></td>
      <td width="100"><b>Audio Format</b></td>
    </tr>
    <tr><td>1. How to Get There</td></tr>
    <tr>
      <td>2. You Are a Star</td>
      <td><a href="/store1/sound/8601/star.mp3">MP3</a></td>
    </tr>
    <tr>
      <td>3. Don't Make No Difference</td>
      <td><a href="/store1/sound/8601/no_difference.mp3">MP3</a></td>
    </tr>
    <tr><td>4. hagerey</td></tr>
    <tr><td>5. zemen</td></tr>
    <tr><td>6. semay</td></tr>
    <tr><td>7.kemey aleki</td></tr>
    <tr><td>8.fikri</td></tr>
   
    </table>
</div>


<!-- end the middle column -->

<jsp:include page="/includes/column_right_buttons.jsp" />
<jsp:include page="/includes/footer.jsp" />
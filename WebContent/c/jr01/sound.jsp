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
        <tr>
          <td>1. Filter</td>
          <td width="40"><a href="/store1/sound/jr01/filter.mp3">MP3</a></td>
        </tr>
        <tr><td>2.I love you sara</td></tr>
        <tr><td>3. Life and death</td></tr>
        <tr><td>4. segeney</td></tr>
        <tr>
          <td>5. seb entay zeybele</td>
          <td width="40"><a href="/store1/sound/jr01/so_long.mp3">MP3</a></td>
        </tr>
        <tr><td>6.mezmur</td></tr>
        <tr><td>7. hanatay</td></tr>
   
      </table>
</div>

<!-- end the middle column -->

<jsp:include page="/includes/column_right_buttons.jsp" />
<jsp:include page="/includes/footer.jsp" />
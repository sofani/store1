
<%@ page contentType="text/html; charset=UTF-8" %>
<jsp:include page="/includes/header.jsp" />
<jsp:include page="/includes/column_left_catalog.jsp" />

<!-- start the middle column -->

<!-- If necessary, this page could be generated from the database. 
However, this format gives more control to the web designers. -->

<div class="c_index">
    <h1>The Fresh Corn Records Catalog</h1>

    <h4>የማነ ባርያ</h4>
    <p><a href="displayPath?productCode=8601">ዘመን</a></p>

    <h4>አብርሃም አፈወርቁ</h4>
    <p>
      <a href="displayPath?productCode=pf01">ሰማይ</a>
    </p>
      <br>
    <h4>ሄለን መለስ</h4>
    <p>
      <a href="displayPath?productCode=pf02">ፍቅሪ</a>
    </p>
    <h4>ዮውሀንስ (ጆኒ)</h4>
    <p><a href="displayPath?productCode=jr01">ጊዜ</a></p>      
</div>

<!-- end the middle column -->

<jsp:include page="/includes/column_right_news.jsp" flush="true" />
<jsp:include page="/includes/footer.jsp" />
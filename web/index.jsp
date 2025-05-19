

<%@include file="inc/header.jsp" %>

<%
    
   // String Name = request.getParameter("txtName");
    
    
    
%>
<div id="displayDiv"
    style="padding: 10px; width: 300px; height: 50px;">
    
</div>

<form>

    <input type="text" id="txtName" name="txtName"/>
    <input type="submit" id ="btnSubmit" value="send"/>
</form>
<script type="text/javascript">
    $("#btnSubmit").click(function(){
       $.ajax({
           type: "POST",
           url : "components/test.jsp",
           data: {NAME: $("#txtName").val()},
           seccess: function(option){
               alert();
           },
           error: function(option){
               debugger;
           }
       });
       return false;
    });
    
</script>

<%@include file="inc/footer.jsp" %>

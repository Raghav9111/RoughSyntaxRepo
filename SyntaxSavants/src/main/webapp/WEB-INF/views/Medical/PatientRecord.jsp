<%@include file="header.jsp"%>
    
  <div class="container-fluid">
        <main class="tm-main">


<h1 class="alert-success">Patients Record</h1>

<label for="name"><b>Name :</b></label>
<label for="name">${plist.name}</label>

<label for="phone" style="padding-left: 30%;"><b>Phone :</b></label>
<label for="phone" >${plist.phone}</label>
<br>
<label for="address"><b>Address :</b></label>
<label for="address">${plist.address}</label>

<hr>
<c:forEach items="${flist}" var="obj">
  <a href="/user/report/${obj.id}">
  <img src="/assets/img/285658_blue_folder_icon (1).png" height="10%" width="10%"/>
  <label style="">${obj.title}</label>
</a>&nbsp;&nbsp;
 </c:forEach>
 
</main>
</div>


<script src="${ctxpath}/resources/js/jquery.min.js"></script>
<script src="${ctxpath}/resources/js/templatemo-script.js"></script>


</body>
</html>
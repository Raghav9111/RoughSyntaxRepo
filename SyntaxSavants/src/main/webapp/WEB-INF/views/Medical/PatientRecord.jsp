<%@include file="header.jsp"%>
    
  <div class="container-fluid">
        <main class="tm-main">


<h1 class="alert-success">Patients Record</h1>
<br>
 <a href="student/add_stud"> <b class="btn-sm btn-info">Upload Report</b> </a>
<br><br>
<label for="name"><b>Name :</b></label>
<label for="name">Sheena Soni</label>

<label for="phone" style="padding-left: 30%;"><b>Phone :</b></label>
<label for="phone"></label>
<br>
<label for="address"><b>Address :</b></label>
<label for="address"></label>

<hr>
<c : forEach items="${slist}" var="obj">
<div class="item">
  <a href="">
  <img src="/assets/img/285658_blue_folder_icon (1).png" height="10%" width="10%" alt=""/>
  <p>${obj.title}</p>
</a>
</div>&nbsp;&nbsp;
 </c : forEach>
 
</main>
</div>


<script src="${ctxpath}/resources/js/jquery.min.js"></script>
<script src="${ctxpath}/resources/js/templatemo-script.js"></script>


</body>
</html>
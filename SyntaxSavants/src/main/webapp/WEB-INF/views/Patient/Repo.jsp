<%@include file="header.jsp"%>	    
    <div class="container-fluid">
        <main class="tm-main">


<h1 class="alert-success">Reports Record</h1>

&nbsp; <a href="student/add_stud"> <b class="btn-sm btn-info">Upload Report</b> </a>
&nbsp; <a href="student/add_stud"> <b class="btn-sm btn-info">Create Report Folder</b> </a>



<table class="table table-striped mt-3">
	<thead>
		<tr>
			<th>Title</th>
			<th>Date</th>
			<th>Report</th>
			
		</tr>
	</thead>
	<tbody>
		<sp:forEach items="${slist}" var="obj">
			<tr>
				<td><img src="/assets/img/285658_blue_folder_icon (1).png" height="20px" width="20px">&nbsp;&nbsp;${obj.rollNumber}</td>
				<td>${obj.name}</td>
				<td>${obj.email}</td>
				
				<td>
				<a href="feerecord/addfee/${obj.rollNumber}">	<b>View</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Delete</b></a>
					
				</td>
			</tr>
		</sp:forEach>
	</tbody>
</table>

</main>
</div>

  
<script src="/assets/JS/jquery.min.js"></script>
<script src="/assets/JS/templatemo-script.js"></script>
</body>
</html>
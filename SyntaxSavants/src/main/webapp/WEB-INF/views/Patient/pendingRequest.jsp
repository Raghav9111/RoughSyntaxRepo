<%@include file="header.jsp"%>	

    <div class="container-fluid">
        <main class="tm-main">


<h1 class="alert-success">REQUEST</h1>

&nbsp; <a href="#"> <b class="btn-sm btn-info">View Medical Authorities</b> </a>
<table class="table table-striped mt-3">
	<thead>
		<tr>
			<th>Hospital Name</th>
			<th>Mobile Number</th>
			<th>Address</th>
			<th>Approve</th>
			<th>Decline</th>
			
		</tr>
	</thead>
	<tbody>
		<sp:forEach items="${slist}" var="obj">
			<tr>
				<td>${obj.rollNumber}</td>
				<td>${obj.name}</td>
				<td>${obj.email}</td>
				
				<td>
				<a href="feerecord/addfee/${obj.rollNumber}" >	<b style="color:green;">Accept</b> </a>
					
				</td>
				<td>
				<a href="feerecord/addfee/${obj.rollNumber}">	<b style="color:red;">Decline</b> </a>
					</td>
			</tr>
		</sp:forEach>
	</tbody>
</table>

</main>
</div>
<script src="${ctxpath}/resources/js/jquery.min.js"></script>
<script src="${ctxpath}/resources/js/templatemo-script.js"></script>
</body>
</html>
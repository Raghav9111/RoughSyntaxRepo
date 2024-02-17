<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>	

    <div class="container-fluid">
        <main class="tm-main">


<h1 class="alert-success">Certificate Request</h1>

&nbsp; 
<table class="table table-striped mt-3">
	
<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Address</th>
			<th>Phone</th>
			<th>Certificate</th>
			<th>Approve</th>
			<th>Decline</th>
			
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${slist}" var="obj">
			<tr>
				<td>${obj.medicalAuthorityID}</td>
				<td>${obj.name}</td>
				<td>${obj.address}</td>
				<td>${obj.phone}</td>
				<td><a href="#"><b>View</b> </a></td>
				<td>
				<a href="feerecord/addfee/${obj.rollNumber}" >	<b style="color:green;">Accept</b> </a>
					
				</td>
				<td>
				<a href="feerecord/addfee/${obj.rollNumber}">	<b style="color:red;">Decline</b> </a>
					</td>
			</tr>
		</c:forEach>
	

</main>
</div>
<script src="${ctxpath}/resources/js/jquery.min.js"></script>
<script src="${ctxpath}/resources/js/templatemo-script.js"></script>
</body>
</html>
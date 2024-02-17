<%@include file="header.jsp"%>	    
    <div class="container-fluid">
        <main class="tm-main">


<h1 class="alert-success">Reports Record</h1>

&nbsp; <a href="#"> <b class="btn-sm btn-info">Upload Report</b> </a>

<table class="table table-striped mt-3">
	<thead>
		<tr>
			<th>File</th>
			<th>Description</th>
			<th>Uploaded By</th>
            <th>Date</th>
			<th>View</th>
			<th>Delete</th>
		</tr>
	</thead>
	<tbody>
		<sp:forEach items="${slist}" var="obj">
			<tr>
				<td><img src="/assets/img/2133056_document_eps_file_format_pdf_icon.png" height="20px" width="20px">&nbsp;&nbsp;${obj.rollNumber}</td>
				<td>${obj.name}</td>
				<td>${obj.email}</td>
                <td>${obj.email}</td>
				<td>
				<a href="#"><b>View</b> </a>
				</td>
				<td>
				<a href="#"  style="color: red"><b>Delete</b> </a>
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
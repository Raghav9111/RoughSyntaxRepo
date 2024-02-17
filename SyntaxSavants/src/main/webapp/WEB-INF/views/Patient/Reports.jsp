<%@include file="header.jsp"%>	    
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="sp" uri="http://java.sun.com/jsp/jstl/core"%>
    <div class="container-fluid">
        <main class="tm-main">


<h1 class="alert-success">Reports Record</h1>
&nbsp;

<form action="/report/add_report/${folder.id}" method="POST" enctype="multipart/form-data">
<input type="file" id="actual-btn" name="file" hidden/>
<label for="actual-btn" ><b class="btn-sm btn-info" style="cursor:pointer;">Upload Report</b></label>
<input type="submit" class="btn btn-danger btn-circle btn-sm" style="border-radius: 1000px" value="submit"/>

</form>
<table class="table table-striped mt-3">
	<thead>
		<tr>
			<th>File</th>
			<th>Uploaded By</th>
            <th>Date</th>
			<th>View</th>
			<th>Delete</th>
		</tr>
	</thead>
	<tbody>
		<sp:forEach items="${rlist}" var="obj">
			<tr>
				<td><img src="/assets/img/2133056_document_eps_file_format_pdf_icon.png" height="20px" width="20px">&nbsp;&nbsp;${obj.description}</td>
				<td>${obj.uploadBy}</td>
                <td><fmt:formatDate value="${obj.date}" pattern="dd/MM/yyyy"/></td>
				<td>
				<a href="/report/getPdf?file=${obj.file}"><b>View</b> </a>
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
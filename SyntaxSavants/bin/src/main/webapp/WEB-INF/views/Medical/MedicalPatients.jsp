<%@include file="header.jsp"%>
    
    <div class="container-fluid">
        <main class="tm-main">


<h1 class="alert-success">Patients Record</h1>

 <style>

  .btn-custom {
    background-color: transparent;
    border-color: #6c63ff;
    color: #6c63ff;
  }

  .btn-custom:hover {
    background-color: #6c63ff;
    color: #fff;
  }
</style> 



<nav class="navbar navbar-light bg-light">
  <form class="form-inline">
    <input class="form-control mr-sm-2" type="search" placeholder="Search patient" aria-label="Search">
    <button class="btn btn-custom my-2 my-sm-0" type="submit">Search</button>
  </form>
</nav>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>


<table class="table table-striped mt-3">
	<thead>
		<tr>
		    <th>ID</th>
			<th>Name</th>
			<th>Phone</th>
			<th>Address</th>
      <th>Gender</th>
      <th>DOB</th>
      <th>View</th>
			
		</tr>
	</thead>
	<tbody>
		<c : forEach items="${slist}" var="obj">
			<tr>
				<td>${obj.medicalAuthorityID}</td>
				<td>${obj.name}</td>
				<td>${obj.phone}</td>
                <td>${obj.address}</td>
                <td>${obj.gender}</td>
                <td>${obj.dob}</td>
        </c : forEach>
        <td><a href="./viewPatient"><b>View</b> </a>
        </td>

				
				
			</tr>
		
	</tbody>
</table>

</main>
</div>

<script src="${ctxpath}/resources/js/jquery.min.js"></script>
<script src="${ctxpath}/resources/js/templatemo-script.js"></script>


</body>
</html>
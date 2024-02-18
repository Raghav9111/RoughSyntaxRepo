<%@include file="header.jsp"%>
<%@taglib prefix="sp" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    
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
  <form action="/medical/searchPatient" method="post" class="form-inline">
    <input class="form-control mr-sm-2" type="search" placeholder="Search patient" name="patientid" aria-label="Search">
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

			<tr>
				<td>${plist.patientID}</td>
				<td>${plist.name}</td>
				<td>${plist.phone}</td>
                <td>${plist.address}</td>
                <td>${plist.gender}</td>
                <td><fmt:formatDate value="${plist.dob}" pattern="dd/MM/yyyy"/></td>
        
        <td><a href="./viewPatient/${plist.patientID}"><b>View</b> </a>
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
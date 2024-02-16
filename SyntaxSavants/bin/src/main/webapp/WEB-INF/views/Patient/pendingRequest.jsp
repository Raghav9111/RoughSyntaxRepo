<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>IT Stack School Web</title>
	<link rel="stylesheet" href="/assets/fontawesome/css/all.min.css"> <!-- https://fontawesome.com/ -->
	<link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap" rel="stylesheet"> <!-- https://fonts.google.com/ -->
    <link href="/assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="/assets/css/templatemo-xtra-blog.css" rel="stylesheet">
</head>
<body>
	<header class="tm-header" id="tm-header">
        <div class="tm-header-wrapper">
            <button class="navbar-toggler" type="button" aria-label="Toggle navigation">
                <i class="fas fa-bars"></i>
            </button>
            <div class="tm-site-header">
                <div class="mb-3 mx-auto tm-site-logo">
              
                </div>            
                <br><br>
                <h1 class="text-center">Hospital</h1>
            </div>
            <nav class="tm-nav" id="tm-nav">            
                <ul>
                    <li class="tm-nav-item "><a href="${ctxpath}/home" class="tm-nav-link">
                        <i class="fas fa-home"></i>
                        Profile
                    </a></li>
                    <li class="tm-nav-item"><a href="${ctxpath}/students" class="tm-nav-link">
                        <i class="fas fa-pen"></i>
                        Reports
                    </a></li>
                    <li class="tm-nav-item"><a href="${ctxpath}/feesrecords" class="tm-nav-link">
                        <i class="fas fa-users"></i>
                       Requests
                    </a></li>                   
                </ul>
            </nav>
        </div>
    </header>
    
    <div class="container-fluid">
        <main class="tm-main">


<h1 class="alert-success">Reports Record</h1>

&nbsp; <a href="student/add_stud"> <b class="btn-sm btn-info">Upload Report</b> </a>
&nbsp; <a href="student/add_stud"> <b class="btn-sm btn-info">Create Report Folder</b> </a>

<table class="table table-striped mt-3">
	<thead>
		<tr>
			<th>Date</th>
			<th>Description</th>
			<th>Report</th>
			
		</tr>
	</thead>
	<tbody>
		<sp:forEach items="${slist}" var="obj">
			<tr>
				<td>${obj.rollNumber}</td>
				<td>${obj.name}</td>
				<td>${obj.email}</td>
				
				<td>
				<a href="feerecord/addfee/${obj.rollNumber}">	<b>Delete</b> </a>
					
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
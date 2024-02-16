<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Patient ID Card</title>
    <link rel="stylesheet" href="/assets/fontawesome/css/all.min.css"> <!-- https://fontawesome.com/ -->
    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap" rel="stylesheet"> <!-- https://fonts.google.com/ -->
    <link href="/assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="/assets/css/templatemo-xtra-blog.css" rel="stylesheet">
    <style>
          .card {
    background-color: #ffffff;
    border: 1px solid #dddddd;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    margin: 20px auto;
    max-width: 400px;
    padding: 20px;
}

.card-header {
    background-color: #6C63FF;
    border-radius: 8px 8px 0 0;
    color: #ffffff;
    font-size: 18px;
    padding: 10px;
    text-align: center;
}

.card-body {
    padding: 20px;
}

.form-group {
    margin-bottom: 15px;
}

.form-group label {
    font-weight: bold;
}

.form-group p {
    margin: 0;
}

    </style>
</head>
<body>
<header class="tm-header" id="tm-header">
    <div class="tm-header-wrapper">
        <button class="navbar-toggler" type="button" aria-label="Toggle navigation">
            <i class="fas fa-bars"></i>
        </button>
        <div class="tm-site-header">
            <div class="mb-3 mx-auto tm-site-logo">
                <!-- Your logo here -->
            </div>            
            <br><br>
            <h1 class="text-center">Hello!!</h1>
        </div>
        <nav class="tm-nav" id="tm-nav">            
            <ul>
                <li class="tm-nav-item "><a href="${ctxpath}/home" class="tm-nav-link">
                    <i class="fas fa-home"></i>
                    Profile
                </a></li>
                <li class="tm-nav-item"><a href="${ctxpath}/patients" class="tm-nav-link">
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
        
        <div class="row">
            <div class="col-md-6 mx-auto">
                <div class="card">
                    <div class="card-header" >
                        <h3 class="card-title" >Patient Id Card</h3>
                    </div>
                    <div class="card-body">
                        <div class="form-group">
                            <label>Patient ID:</label>
                            <p>${patient.patientID}</p>
                        </div>
                        <div class="form-group">
                            <label>Name:</label>
                            <p>${patient.name}</p>
                        </div>
                        <div class="form-group">
                            <label>Phone:</label>
                            <p>${patient.phone}</p>
                        </div>
                        <div class="form-group">
                            <label>Address:</label>
                            <p>${patient.address}</p>
                        </div>
                        <div class="form-group">
                            <label>Gender:</label>
                            <p>${patient.gender}</p>
                        </div>
                        <div class="form-group">
                            <label>Date of Birth:</label>
                            <p>${patient.dob}</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>
</div>



<script src="${ctxpath}/resources/js/jquery.min.js"></script>
<script src="${ctxpath}/resources/js/templatemo-script.js"></script>
</body>
</html>

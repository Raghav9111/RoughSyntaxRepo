<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Patient </title>
    <link rel="stylesheet" href="/assets/fontawesome/css/all.min.css"> <!-- https://fontawesome.com/ -->
    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap" rel="stylesheet"> <!-- https://fonts.google.com/ -->
    <link href="/assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="/assets/css/header.css" rel="stylesheet">
  	<link href="/assets/css/patientId.css" rel="stylesheet">
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
                <li class="tm-nav-item "><a href="/patient/patientid" class="tm-nav-link">
                    <i class="fas fa-home"></i>
                    Profile
                </a></li>
                <li class="tm-nav-item"><a href="/patient/report" class="tm-nav-link">
                    <i class="fas fa-pen"></i>
                    Reports
                </a></li>
                <li class="tm-nav-item"><a href="/patient/pendingRequest" class="tm-nav-link">
                    <i class="fas fa-users"></i>
                    Requests
                </a></li>                   
                <li class="tm-nav-item"><a href="/user/logout/" class="tm-nav-link">
                  <i class="fas fa-key"></i>
                    Sign Out
                </a></li>
            </ul>
        </nav>
    </div>
</header>

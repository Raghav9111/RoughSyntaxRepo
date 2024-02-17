<%@include file="header.jsp"%>	
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

/* Button used to open the contact form - fixed at the bottom of the page */
.open-button {
  background-color: #555;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  opacity: 0.8;
  position: fixed;
  bottom: 23px;
  right: 28px;
  width: 280px;
}

/* The popup form - hidden by default */
.form-popup {
  display: none;
  position: fixed;
  bottom: 270px;
  right: 550px;
  border: 3px solid #f1f1f1;
  z-index: 9;
}

/* Add styles to the form container */
.form-container {
  max-width: 500px;
  padding: 5px;
  background-color: white;
  table-width:10px; 
  
}

/* Full-width input fields */
.form-container input, .form-container input {
  width: 100%;
  padding: 5px;
  margin: 5px 0 22px 0;
  border: solid 1px black;
  background: #f1f1f1;
}

/* When the inputs get focus, do something */
.form-container input[type=text]:focus, .form-container input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for the submit/login button */
.form-container .btn {
  background-color: #04AA6D;
  color: white;
  padding: 5px 5px;
  border: none;
  cursor: pointer;
  width: 100px;
  margin-bottom:10px;
  opacity: 0.8;
  margin-left: 100px;
}

/* Add a red background color to the cancel button */
.form-container .cancel {
  background-color: red;
}

/* Add some hover effects to buttons */
.form-container .btn:hover, .open-button:hover {
  opacity: 1;
}
</style>    
    <div class="container-fluid">
        <main class="tm-main">


<h1 class="alert-success">Reports Record</h1>

&nbsp; <a onclick="openForm()" style = "cursor: pointer;"> <b class="btn-sm btn-info">Create Report Folder</b> </a>
&nbsp; <input type="file" id="actual-btn" hidden/>

<label for="actual-btn" ><b class="btn-sm btn-info" style="cursor:pointer;">Upload Report</b> </label>



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
<div class="form-popup" id="myForm">
  <form action="/folder/create_repo" class="form-container">
    <h3>Create Folder</h3>
	<hr>
    <input type="text" placeholder="Title" name="title" required>
    <input type="text" placeholder="Description" name="description" required>
	<input type="hidden" value="${patient.getPatientID()}" name="patientID">
    <button type="submit" class="btn">Add</button>
    <button type="button" class="btn cancel" onclick="closeForm()">Close</button>
  </form>
</div>
  
<script src="/assets/JS/jquery.min.js"></script>
<script src="/assets/JS/templatemo-script.js"></script>
<script>
function openForm() {
  document.getElementById("myForm").style.display = "block";
}

function closeForm() {
  document.getElementById("myForm").style.display = "none";
}
</script>
</body>
</html>
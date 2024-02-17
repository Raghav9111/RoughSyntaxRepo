<%@include file="header.jsp"%>	    

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

.form-control {
    width: 100%;
    padding: 10px;
    border: 1px solid #cccccc;
    border-radius: 4px;
}

.btn-primary {
    background-color: #007bff;
    color: #ffffff;
    border: none;
    border-radius: 4px;
    padding: 10px 20px;
    cursor: pointer;
    font-size: 16px;
}

.btn-primary:hover {
    background-color: #0056b3;
}

        .form-group p {
            margin: 0;
        }
</style>

<div class="container-fluid">
    <main class="tm-main">
        
        <div class="row">
            <div class="col-md-6 mx-auto">
                <div class="card">
                    <div class="card-header">
                        <h3 class="card-title">Update Patient Record</h3>
                    </div>
                    <div class="card-body">
                        <form action="${ctxpath}/updatePatient" method="post">
                            <div class="form-group">
                                <label for="patientID">Patient ID:</label>
                                <p>${patient.patientID}</p>
                            </div>
                            <div class="form-group">
                                <label for="name">Name:</label>
                                <input type="text" id="name" name="name" value="${patient.name}" class="form-control" disabled>
                            </div>
                            <div class="form-group">
                                <label for="phone">Phone:</label>
                                <input type="tel" id="phone" name="phone" value="${patient.phone}" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="address">Address:</label>
                                <textarea id="address" name="address" class="form-control">${patient.address}</textarea>
                            </div>
                             <div class="form-group">
                                <label>Gender:</label>
                                <div>
                                    <label for="male">Male</label>
                                    <input type="radio" name="gender" value="male" ${patient.gender == 'male' ? 'checked' : ''}>
                                    <label for="female">Female</label>
                                    <input type="radio" name="gender" value="female" ${patient.gender == 'female' ? 'checked' : ''}>
                                    <label for="other">Other</label>
                                    <input type="radio"  name="gender" value="other" ${patient.gender == 'other' ? 'checked' : ''}>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="dob">Date of Birth:</label>
                                <input type="date" id="dob" name="dob" value="${patient.dob}" class="form-control">
                            </div>
                            <button align="centre" type="submit" class="btn btn-primary">Update</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </main>
</div>

<footer class="tm-footer text-center">
    <p class="mb-0">
        All rights reserved. Designed by Your Name
    </p>
</footer>

<script src="${ctxpath}/resources/js/jquery.min.js"></script>
<script src="${ctxpath}/resources/js/templatemo-script.js"></script>
</body>
</html>





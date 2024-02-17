<%@include file="header.jsp"%>	
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

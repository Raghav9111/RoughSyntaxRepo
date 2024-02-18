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
                            &nbsp;&nbsp;"${patient.patientID}"
                        </div>
                        <div class="form-group">
                            <label>Name:</label>
                             &nbsp;&nbsp;${patient.name}
                        </div>
                        <div class="form-group">
                            <label>Phone:</label>
                             &nbsp;&nbsp;${patient.phone}
                        </div>
                        <div class="form-group">
                            <label>Address:</label>
                            &nbsp;&nbsp;${patient.address}
                        </div>
                        <div class="form-group">
                            <label>Gender:</label>
                            &nbsp;&nbsp;${patient.gender}
                        </div>
                        <div class="form-group">
                            <label>Date of Birth:</label>
                            &nbsp;&nbsp;${patient.dob}
                        </div>
                    </div>
                    
                </div>
            </div>
        </div>
        
        <a href="/patient/updatepath"> <b class="btn-sm btn-info" style="margin-left:300px">Update Details</b> </a>
        <a href="/patient/updatePassword"> <b class="btn-sm btn-info" style="margin-left:130px">Update Login Credential</b> </a>
    </main>
</div>



<script src="${ctxpath}/resources/js/jquery.min.js"></script>
<script src="${ctxpath}/resources/js/templatemo-script.js"></script>
</body>
</html>
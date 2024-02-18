<%@include file="header.jsp"%>	    
<h1 class="alert-success" style="width:1200px; margin-left:330px;margin-top: 100px">Password Update</h1>
&nbsp;
<form action="patient/updatePassword" method="post">
  <div >
    <div class="col">
      <input type="text" class="form-control" placeholder="Old Password" name="oldPassword" style="width:300px; margin-left:350px">
    </div>
   &nbsp;
    <div class="col">
      <input type="text" class="form-control" placeholder="New Password" name="newPassword" style="width:300px;margin-left:350px">
    </div>
   &nbsp; 
    <div class="col">
      <input type="text" class="form-control" placeholder="Confirm Password" name="confirmPassword" style="width:300px; margin-left:350px">
  </div>
  <button type="button" class="btn btn-primary" style=" margin-left:452px ; margin-top: 20px">Change Password</button>
</form>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script
      src="https://kit.fontawesome.com/64d58efce2.js"
      crossorigin="anonymous"
    ></script>
    <link rel="stylesheet" href="/assets/css/style.css" />
    <title>Sign in / Sign up Form</title>
</head>
<body>
	  <div class="container">
      <div class="forms-container">
        <div class="signin-signup">
          <form action="/web/login" method="POST" class="sign-in-form">
            <h2 class="title">Sign in</h2>
            <div class="input-field">
              <i class="fas fa-user"></i>
              <input type="email" placeholder="Email" name="email" required/>
            </div>
            <div class="input-field">
              <i class="fas fa-lock"></i>
              <input type="password" placeholder="Password" name="password" required/>
            </div>
            <input type="submit" value="Login" class="btn solid" /> 
          </form>
          
          <!-- Register Form -->
          
          
          <form  action="/web/medicalAuthority_reg" method="POST" class="sign-up-form" enctype="multipart/form-data">
                    <h2 class="title">Sign up</h2>
                    <div class="input-field">
                        <i class="fas fa-user"></i>
                        <input type="text" name="name" placeholder="Name" required />
                    </div>
                    <div class="input-field">
                        <i class="fas fa-envelope"></i>
                        <input type="email" name="email" placeholder="Email" required />
                    </div>
                    <div class="input-field">
                        <i class="fas fa-lock"></i>
                        <input type="password" name="password" placeholder="Password" required />
                    </div>
                    <div class="input-field">
                        <i class="fas fa-map"></i>
                        <input type="text" name="address" placeholder="Address" required />
                    </div>
                    <div class="input-field">
                        <i class="fas fa-phone"></i>
                        <input type="text" name="phone" placeholder="Phone"  maxlength="10" required />
                    </div>
                  <input type="file" id="actual-btn" hidden/>

				<label for="actual-btn" ><b class="btn-sm btn-info" style="cursor:pointer; text-decoration: underline;">Attach Certificate</b> </label>

                  
            <input type="submit" class="btn" value="Sign up" />
          
          </form>
        </div>
      </div>

      <div class="panels-container">
        <div class="panel left-panel">
          <div class="content">
            <h3>New here ?</h3>
           
            <button class="btn transparent" id="sign-up-btn">
              Sign up
            </button>
          </div>
          <img src="/assets/img/login.svg" class="image" alt="" />
        </div>
        
        <div class="panel right-panel">
          <div class="content">
            <h3>One of us ?</h3>
           
            <button class="btn transparent" id="sign-in-btn">
              Sign in
            </button>
          </div>
          <img src="/assets/img/reg.svg" class="image" alt="" />
          
               </div>
      </div>
    </div>
    
    
    </script>

    <script src="/assets/JS/app.js"></script>
</body>
</html>
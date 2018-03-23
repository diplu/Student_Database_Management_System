<%-- 
    Document   : loginformforadmin
    Created on : Feb 16, 2018, 6:06:21 PM
    Author     : ABHIK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" type="text/css" href="adminlogin.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
    <title>Document</title>
</head>

<body>
    <div class="bg">
        <div class="container">
            <div class="row">
                <div class="form_bg">
                    <form action ="ControllerServlet" method="post">
                        <h2 class="text-center">Login Page</h2>
                        <br/>
                        <div class="form-group">
                            <label for="userName" class="col-sm-2 control-label">User Name:</label>
                            <div class="col-sm-10">
                                <input type="text" name="name" class="form-control" id="userName" placeholder="User Name">
                            </div>
                        </div>
                        <br><br>
                        <div class="form-group">
                            <label for="passwd" class="col-sm-2 control-label">Password:</label>
                            <div class="col-sm-10">
                                <input type="password" name="pass" class="form-control" id="passwd" placeholder="Password">
                            </div>
                        </div>
                        <br/> <br>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-primary" id="register">Log In</button>
                            </div>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </div>
 </body>
</html>

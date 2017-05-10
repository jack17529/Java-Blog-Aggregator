<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%HttpSession sess=request.getSession(false);
	String s=(String)sess.getAttribute("Name1");
	sess=request.getSession();
	sess.setAttribute("Name1",s);%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Blog</title>
<!-- Bootstrap Core CSS --> 
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> 
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script> 

  


    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Plugin CSS -->
    <link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="css/creative.min.css" rel="stylesheet">
    <style>
.abody  {
    background-image: url("img/blog-pen.jpg");
    background-color: #cccccc;
    width:100%;
    height:100%;
}
</style>
</head>
<body>

<section class="bg-primary abody" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h1 class="section-heading">Create Post</h1>
                    <hr class="light">
					<ul><div align="left">
						<form action="blog" method="post">
						<div class= "input-group">
      
      <input id="msg" type="text" class="form-control" name="blog" placeholder="Enter Title"><p>Title</p>
    </div>
		<div class="input-group">
     
      <input id="msg" type="text" class="input-lg form-control" name="content" placeholder="Enter Content"> <p>Content</p>
    </div>
						
						<input type="submit" value="Submit">
						</form>
						</div>
						</br>
						
						
					</ul>
					</div>
					</div>
					</div>
					</section>
					<a href="index1.jsp">view post</a>
</body>
</html>
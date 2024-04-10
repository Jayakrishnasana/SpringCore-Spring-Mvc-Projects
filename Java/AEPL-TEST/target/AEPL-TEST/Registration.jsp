<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

<style type="text/css">
body{

           background-image: url(https://www.athletadesk.com/wp-content/uploads/2016/08/join-background.jpg);
           
          
}
.form1{
	font-size: 40px;
	color: white;
	margin-top: 50px;
	height: 50px;
	margin-left:500px;
	width: 400px;
	text-align: center;
	font-style:italic;
	padding: 20px;
	text-decoration: underline;
	
	
	
}
.form2{
	font-size: 25px;
	color: ghostwhite;
	margin-left: 530px;
	margin-top: 50px;
	font-style: normal;
	
}
.final{
	font-size: 25px;
	color: green;
	padding: 5px;
	margin: 30px;
}

</style>
</head>
<body>
<div class="form">
	<div class="form1"> Registration Form</div>
			<div class="form2">
			
			<form action="user_register" method="post" onsubmit="return validate()">
	<table>
		<tr>
			<td> Name : </td>
			<td> <input type="text" placeholder="Name" name="name" required="required" id="name"> </td>
		
		</tr>
		
		<tr>
			<td> Email : </td>
			<td> <input type="email" placeholder="example@*" name="email" required="required" id="email"> </td>
		
		</tr>
		
		<tr>
			<td> Mobile Number : </td>
			<td> <input type="tel" placeholder="9876*****" name="phoneNumber" required="required" id="phoneNumber" onkeyup="phonevalidate()"> </td>
		
		</tr>
		
		<tr>
			<td> Date of Birth : </td>
			<td> <input type="date" placeholder="Name" name="dateOfBirth" required="required" id="dateOfBirth"> </td>
		
		</tr>
		
		<tr>
			<td > Location : </td>
			<td> 
				<select required="required" name="location" id="location">
						<option> Any Location</option>
						<option> Bangalore </option>
						<option> Hyderabad </option>
						<option> Chennai </option>
						<option> New Delhi</option>
				</select>
			 </td>
		</tr>
		
		<tr>
			<td> Identification Document : </td>
			<td> <input  type="file" placeholder="document" name="document" required="required" id="document"> </td>	
		
		</tr>
	</table>
		<div >
			<input type="submit" value="Register" onclick="validate()">
		</div>
	
	</form>
			
	</div>
</div>	
</body>

<script type="text/javascript">

	function namevalidate(){
		var name=document.getElementById("name").value;
		var usercheck=/^[A-Za-z]+$/
			 if(  usercheck.test(name)  ){    
		        }
		        else{
		            alert("Username must contains only alphabets ")
		        }
	}
	
	function emailvalidate(){
		var email=document.getElementById("email").value;
		var emailcheck=/[a-zA-Z][a-zA-Z0-9]*@[a-zA-Z0-9]+[.]com/
			if(emailcheck.test(email)){
            }else{
                alert("Enter valid email ")
            }
	}

	function phonevalidate(){
		var phone=document.getElementById("phoneNumber").value;
		 var phonecheck=/[6-9][0-9]{9}/
		if(!phonecheck.test(phone)){
            alert("Enter valid phonenumber ")
        }
	}
    function validate(){
        
        if(namevalidate() && emailvalidate() &&  phonevalidate()){
        	alert("Successful")
        }
        
        var birth=document.getElementById("dateOfBirth").value;
       
        var dobcheck=/^([0-9]{2})-([0-9]{2})-([0-9]{4})$/
       
    }

  
</script>
</html>
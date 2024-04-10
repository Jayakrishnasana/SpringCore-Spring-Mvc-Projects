<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
function check(){
	var name=document.getElementById("name");
	 var email=document.getElementById("email");
	 var mobileNumber=document.getElementById("phoneNumber");
	 var userdob=document.getElementById("dateOfBirth"); 
	 var location=document.getElementById("location"); 
	  
	 
	 var nameregx=/^[a-zA-Z ]+$/
	 var emailregx=/^[a-zA-Z][a-zA-Z0-9]*@[a-zA-Z0-9]+[.]com$/
	 var mobileNumbeeRegx=/^[6-9][0-9]{9}$/
	
	console.log(name.value);
	 console.log(email.value);
	 console.log(mobileNumber.value);
	 console.log(userdob.value); 
	 
	 if(name.value.length==0 || !nameregx.test(name.value)){
			document.getElementById("result").innerHTML= "**invalid name";
			console.log(name.value);
			return false;	
		 }
	 
	 else if(mobileNumber.value.length==0 || !mobileNumbeeRegx.test(mobileNumber.value) ){
			document.getElementById("result").innerHTML= "**invalid mobile number";
			return false;	
		 }
	 else if( email.value.length==0 || !emailregx.test(email.value)){
			document.getElementById("result").innerHTML= "**invalid email";
			return false;	
		 }
	 else if( userdob.value.length==0 ){
			document.getElementById("result").innerHTML= "**invalid Date of Birth ";
			return false;	
		 }
	 else if(location.value.length==0){
			document.getElementById("result").innerHTML= "**please select location";
			return false;	
		 }
	
	 return true;
	
}
</script>
</head>
<body>

</body>
</html>
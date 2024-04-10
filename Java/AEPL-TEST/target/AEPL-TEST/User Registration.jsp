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


	
	

 <style type="text/css">
		body{
		    background: url("https://image.freepik.com/free-photo/top-view-business-office-desk-background-the-applying-for-a-job-form-and-pen-pencil-eyeglasses-tree-on-wooden-table-background-with-copy-space_1921-21.jpg") no-repeat;
		    background-position: center;
		    background-size: cover;
		    min-height: 100vh;
		    width: 100%;
		
		}
		.container{
		    display: flex;
		    justify-content: center;
		    align-items: center;
		    min-height: 100vh;
		}
		.form-box{	
		    position: relative;
		    width: 600px;
		    height: 600px;
		    border: 2px solid rgba(255, 255, 2550.5);
		    border-radius: 20px;
		    backdrop-filter: blur(2px);
		    display: flex;
		    justify-content: center;
		}
		
		.form-box h2{
		    color:black;
		    text-align: center;
		    font-size: 32px;
		    
		}
		.form-box .input-box{
		    position: relative;
		    margin: 30px 0;
		    font-size: 17px;
		}
		.button{
		    color: red;
		    text-align: center;
		    
		   
		}
		#result{
		    color: red;
		}
		
 </style>
		 

</head>

<body>
	<div class="container">
        <div class="form-box">
            <form action="user_register" name="Formfill"  method="post"  >
                <h2>Register Form</h2>
                <p  id="result"></p>
                <div class="input-box">Enter Name:
                    <input  placeholder="abc"   name="name" id="name" >
                    <span id="result"></span>   
                  
                </div>

                <div class="input-box">Enter Email:
                    <input type="email" placeholder="abc@gmail.com" name="email" id="email" >
                </div>
                
                <div class="input-box">Date Of Birth:
                    <input type="date" name="dateOfBirth" id="dateOfBirth">
                </div>

                <div class="input-box">Mobile Number:
                    <input type="tel" placeholder="987*****" name="phoneNumber" id="phoneNumber">
                </div>

                <div class="input-box">Select Location
                    <select name="location" id="location"  >
                    <option> </option>
						<option> Any Location</option>
						<option> Bangalore </option>
						<option> Hyderabad </option>
						<option> Chennai </option>
						<option> New Delhi</option>
				</select>
                </div>
                <div class="input-box">Identification document:
                    <input type="file" name="document" >
                </div>

                <div>
                    <div class="button">
                        <input type="submit" value="Register" onclick="return  check()">
                    </div>
                    <div>
               <h6> <u>*mandatory</u> 
                <ul>
               <li>All fields are mandatory.</li>
               <li>Name  must have contains only alphabets[A-z/a-z].</li>
               <li>Duplicate values are not allowed for email field and mobile Number.</li>
               <li>Age should be above 21 years age as on date.</li>
               <li>Identification document must be size in less than or equal 2MB and<br> must be in format of PDF or PNG format. </li>
               </ul></h6> 
                
                </div>
                    
                </div>
                
            </form>
        </div>
    </div>
</body>

</html>
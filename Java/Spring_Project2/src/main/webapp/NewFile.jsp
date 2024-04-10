<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
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
    <script src="function.jsp"></script>
</body>
</html>
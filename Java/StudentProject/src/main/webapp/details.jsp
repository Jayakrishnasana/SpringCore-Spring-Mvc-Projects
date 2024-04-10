<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="saveStudentDetails">
	 <div>
            <label for="studentId">Id</label>
            <input type="text" name="studentId">
        </div>
	 <div>
            <label for="studentName">Name</label>
            <input type="text" name="studentName">
        </div>
        <div>
            <label for="contactNumber">Contact Number</label>
            <input type="tel" name="contactNumber">
        </div>
        <div>
            <label for="email">Email</label>
            <input type="email" name="email">
        </div>
        <div>
            <label for="password">Password</label>
            <input type="password" name="password">
        </div>
        <div>
        <input type="submit">
        </div>
	</form>
</body>
</html>
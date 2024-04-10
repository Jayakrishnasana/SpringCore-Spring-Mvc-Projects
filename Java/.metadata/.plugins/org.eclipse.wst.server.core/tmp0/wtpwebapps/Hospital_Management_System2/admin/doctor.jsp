<%@page import="com.entity.Doctor"%>
<%@page import="com.dao.DoctorDao"%>
<%@page import="com.entity.Specalist"%>
<%@page import="java.util.List"%>
<%@page import="com.db.DBconnet"%>
<%@page import="com.dao.SpecialistDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="../component/allcss.jsp"%>


<style type="text/css">
.point-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>


</head>
<body>
	<%@include file="navbar.jsp"%>
<div class="row p-2">
	<div class="col-md-5 offset-md-4">
		
			<div class="card point-card">
				<div class="card-body">
					<p class="fs-3 text-center text-yellow">Add Doctor</p>
					
					
					
					
					
					
					
					<form action="../addDoctor" method="post">
						<div class="mb-3">
							<label class="form-label">Full Name</label>
							<input type="text" required="required" name="fullname" class="form-control">
						</div>
						
						
						<div class="mb-3">
							<label class="form-label">DOB</label>
							<input type="date" required="required" name="dob" class="form-control">
						</div>
						
						<div class="mb-3">
							<label class="form-label">Qualifictaion</label>
							<input type="text" required="required" name="qualification" class="form-control">
						</div>
						
						
						
						<div class="mb-3">
							<label class="form-label">Specialist</label>
							<select name="specialist" required="required" class="form-control">
								<option>--select-- </option>
								
								<%
								SpecialistDao dao=new SpecialistDao(DBconnet.getcon());
								List<Specalist> list=dao.getAllSpecialist();
								for(Specalist s:list)
								{%>
									<option><%=s.getSpecalistName()%> </option>
									
								<% }%>
								
								
								
							</select>
						</div>
						
						
						
						<div class="mb-3">
							<label class="form-label">Email</label>
							<input type="email" required="required" name="email" class="form-control">
						</div>
						
						
						<div class="mb-3">
							<label class="form-label">Mobile No</label>
							<input type="tel" required="required" name="mobno" class="form-control">
						</div>
						
						
						<div class="mb-3">
							<label class="form-label">Password</label>
							<input type="password" required="required" name="password" class="form-control">
						</div>
						<button type="submit" class="btn btn-success">Submit</button>
						
					</form>
				</div>
			</div>
		</div>
</div>
	
	
	
	
</body>
</html>
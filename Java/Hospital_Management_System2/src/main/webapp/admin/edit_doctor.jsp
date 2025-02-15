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
	<div class="col-md-4 offset-md-4">
		
			<div class="card point-card">
				<div class="card-body">
					<p class="fs-3 text-center text-yellow">Edit Doctor Details</p>
					
					
					<c:if test="${not empty succMsg}">
							<p class="text-center text-success fs-3">${succMsg }</p>
							<c:remove var="succMsg" scope="session" />
						</c:if>

						<c:if test="${not empty errorMsg}">
							<p class="text-center text-danger fs-3">${errorMsg }</p>
							<c:remove var="errorMsg" scope="session" />
						</c:if>
					
					
					<%
					int id=Integer.parseInt(request.getParameter("id"));
					DoctorDao dao3=new DoctorDao(DBconnet.getcon());
					Doctor d=dao3.getDoctorById(id);
					
					%>
					
					<form action="../updatedoctor" method="post">
						<div class="mb-3">
							<label class="form-label">Full Name</label>
							<input type="text" required="required" name="fullname" class="form-control" value=<%=d.getFullName()%>>
						</div>
						
						
						<div class="mb-3">
							<label class="form-label">DOB</label>
							<input type="date" required="required" name="dob" class="form-control" value=<%=d.getDob() %>>
						</div>
						
						<div class="mb-3">
							<label class="form-label">Qualifictaion</label>
							<input type="text" required="required" name="qualification" class="form-control" value=<%=d.getQualification() %>>
						</div>
						
						
						
						<div class="mb-3">
							<label class="form-label">Specialist</label>
							<select name="specialist" required="required" class="form-control">
								<option><%=d.getSpecialist() %> </option>
								
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
							<input type="email" required="required" name="email" class="form-control" value=<%=d.getEmail()%>>
						</div>
						
						
						<div class="mb-3">
							<label class="form-label">Mobile No</label>
							<input type="tel" required="required" name="mobno" class="form-control" value=<%=d.getMobNo()%>>
						</div>
						
						
						<div class="mb-3">
							<label class="form-label">Password</label>
							<input type="text" required="required" name="password" class="form-control" value=<%=d.getPassword() %>>
						</div>
						<input type="hidden" name="id" value=<%=d.getId() %>>
						<button type="submit" class="btn btn-success col-md-12">Update</button>
						
					</form>
				</div>
			</div>
		</div>

</div>
	
	
	
	
</body>
</html>
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
<div class="row p-2" >
	
	
	
	
	<div class="col-md-12">
		<div class="card point-card">
			<div class="card-body">
				<p class="fs-3 text-center">Doctor Details</p>
				
				
				<c:if test="${not empty succMsg}">
							<p class="text-center text-success fs-3">${succMsg }</p>
							<c:remove var="succMsg" scope="session" />
						</c:if>

						<c:if test="${not empty errorMsg}">
							<p class="text-center text-danger fs-3">${errorMsg }</p>
							<c:remove var="errorMsg" scope="session" />
						</c:if>
				
				
				<table class="table text-center">
					<thead>
						<tr>
							<th scope="col">Full Name</th>
							<th scope="col">DOB</th>
							<th scope="col">Qualification</th>
							<th scope="col">Specialist</th>
							<th scope="col">Email</th>
							<th scope="col">Mob No</th>
							<th scope="col">Password</th>
							<th scope="col">Action</th>
						</tr>
					
					</thead>
					
					<tbody>
						<%
							DoctorDao dao2=new DoctorDao(DBconnet.getcon());
						
							List<Doctor> list2=dao2.getAllDoctor();
							for(Doctor d:list2)
							{%>
								<tr>
									<td><%=d.getFullName() %></td>
									<td><%=d.getDob() %></td>
									<td><%=d.getQualification() %></td>
									<td><%=d.getSpecialist() %></td>
									<td><%=d.getEmail() %></td>
									<td><%=d.getMobNo() %></td>
									<td><%=d.getPassword()%></td>
									<td>
										<a href="edit_doctor.jsp?id=<%=d.getId() %>" class="btn btn-sm btn-primary">Edit</a>
										<a href="../deletedoctor?id=<%=d.getId() %>" class="btn btn-sm btn-danger">Delete</a>
									</td>
						
								</tr>
								
								
								
							<%}
						
						%>
					
					</tbody>
				
				</table>
				
			</div>
		</div>
	</div>
</div>
	
	
	
	
</body>
</html>
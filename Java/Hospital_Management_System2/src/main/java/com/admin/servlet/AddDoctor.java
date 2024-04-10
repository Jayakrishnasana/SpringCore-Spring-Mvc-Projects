package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DoctorDao;
import com.db.DBconnet;
import com.entity.Doctor;

@WebServlet("/addDoctor")
public class AddDoctor extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String fullName=req.getParameter("fullname");
			String dob=req.getParameter("dob");
			String qualification=req.getParameter("qualification");
			String specialist=req.getParameter("specialist");
			String email=req.getParameter("email");
			String mobNo=req.getParameter("mobno");
			String password=req.getParameter("password");
			
		Doctor d = new Doctor(fullName, dob, qualification, specialist, email, mobNo, password);
		DoctorDao dao = new DoctorDao(DBconnet.getcon());
		
		HttpSession session = req.getSession();
		
		if(dao.rigisterDoctor(d)) {
			session.setAttribute("succMsg", "Doctor added successfully");
			resp.sendRedirect("admin/view_doctor.jsp");
			
		}else {
			session.setAttribute("errorMsg", "Something wrong on server");
			resp.sendRedirect("admin/doctor.jsp");
		}
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

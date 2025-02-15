package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.db.DBconnet;
import com.entity.User;

@WebServlet("/user_register")
public class UserRegister extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String fullName=req.getParameter("fullname");
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			
			User u=new User(fullName,email,password);
			UserDao dao=new UserDao(DBconnet.getcon());
			
			HttpSession session = req.getSession();
			boolean f = dao.register(u);
			
			if(f) {
				session.setAttribute("succMsg","Register Successfully");
				resp.sendRedirect("user_register.jsp");
			}else {
				session.setAttribute("errorMsg","Something wrong on server");
				resp.sendRedirect("user_register.jsp");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

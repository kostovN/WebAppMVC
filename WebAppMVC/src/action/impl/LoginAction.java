package action.impl;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import action.AbstractAction;
import domain.User;
import validator.Validator;
import validator.impl.UserValidator;

public class LoginAction extends AbstractAction {
	private static Validator validator = new UserValidator();

	@Override
	public String execute(HttpServletRequest request) {
		System.out.println("execute");
		String page = "/login.jsp";
		String notExists = "";
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		List<User> users = (List<User>) request.getServletContext().getAttribute("users");
		try {
			User user = new User(username, password);
			validator.validateObject(user);
			if (users.contains(user)) {
				System.out.println("ima user");
				HttpSession session = request.getSession(true);
				session.setAttribute("user", user);
				String loginMessage = "Logged in: " + username;
				session.setAttribute("loginMessage", loginMessage);
				page = "/WEB-INF/pages/home.jsp";
			} else {
				System.out.println("nema user");
				notExists = "The user doesn't exists!";
				request.setAttribute("notExists", notExists);
			}
		} catch (Exception e) {
			System.out.println("exception");
			
			request.setAttribute("validationError", e.getMessage());
			return "/login.jsp";

		}
		return page;

	}

}

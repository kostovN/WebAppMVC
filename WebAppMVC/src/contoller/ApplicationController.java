package contoller;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import action.factory.ActionFactory;
import action.impl.LoginAction;
import action.impl.LogoutAction;

public class ApplicationController {

	public String processRequest(String pathInfo, HttpServletRequest request) {
		/*
		 * U zavisnosti od toga koji je pathinfo prosledjen, kreirati odgovarajucu klasu
		 * koja je zaduzena za obradu zahteva
		 */
		String page = "/WEB-INF/pages/error/defaultErrorPage.jsp";
		AbstractAction action = ActionFactory.createActionFactory(pathInfo);
		
		if (action != null) {
			System.out.println("processReq");
			page = action.execute(request);
		}else {
			request.setAttribute("error", "Action " + pathInfo + " is not mapped.");
		}
		return page;
	}

}

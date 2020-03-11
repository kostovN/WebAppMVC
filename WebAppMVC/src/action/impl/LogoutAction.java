package action.impl;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;

public class LogoutAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		request.getSession().invalidate();
		return "/WEB-INF/pages/login1.jsp";
	}

	

}

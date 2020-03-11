package action.impl;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import domain.City;
import validator.Validator;
import validator.impl.CityValidator;
import validator.impl.UserValidator;

public class CityAction extends AbstractAction{
	private static Validator validator = new CityValidator();

	@Override
	public String execute(HttpServletRequest request) {
		String page="";
		if (request.getParameter("operation").equals("all")) {
			page="/WEB-INF/pages/allcity.jsp";
		} else if (request.getParameter("operation").equals("new")) {
			page = "/WEB-INF/pages/newcity.jsp";
		} else if (request.getParameter("operation").equals("back")) {
			page = "/WEB-INF/pages/home.jsp";
		} else if (request.getParameter("operation").equals("edit")) {
			page = "/WEB-INF/pages/edit.jsp";
		} else if (request.getParameter("operation").equals("remove")) {
			String message="";
			List<City> cities = (List<City>) request.getServletContext().getAttribute("cities");
			String ptt = (String) request.getParameter("ptt");
			City city = new City(ptt);
			cities.remove(city);
			if(cities.isEmpty()) {
				message= "List of cities is empty";
			}
			request.setAttribute("listIsEmpty", message);
			request.getServletContext().setAttribute("cities", cities);
			page = "/WEB-INF/pages/allcity.jsp";
		} else if (request.getParameter("operation").equals("save")) {
			String ptt = request.getParameter("ptt");
			String name = request.getParameter("name");

			List<City> cities = (List<City>) request.getServletContext().getAttribute("cities");
			try {
				City city = new City(ptt, name);
				validator.validateObject(city);
				if (cities.contains(city)) {
					request.setAttribute("validationError", "City already exists!");
					page="WEB-INF/pages/newcity.jsp";
				} else {
					cities.add(city);
					page="home";
				}
			} catch (Exception e) {
				request.setAttribute("validationError", e.getMessage());
				page="WEB-INF/pages/newcity.jsp";
				return page;
			}
		}else if(request.getParameter("operation").equalsIgnoreCase("editcity")) {
			String name = (String) request.getParameter("name1");
			String ptt = (String)request.getParameter("ptt1");
			List<City> cities = (List<City>) request.getServletContext().getAttribute("cities");
			for (City c : cities) {
				if (c.getPtt().equals(ptt.trim()))
					c.setName(name);
			}
			request.getServletContext().setAttribute("cities", cities);
			page="city?operation=all";
		}
		return page;
	}

}

package listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import domain.City;
import domain.User;


/**
 * Application Lifecycle Listener implementation class ContextListener
 *
 */
@WebListener
public class ContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	List<User> users = new ArrayList<User>();
		users.add(new User("user1", "user1"));
		users.add(new User("user2", "user2"));
		users.add(new User("user3", "user3"));
		users.add(new User("user4", "user4"));
		sce.getServletContext().setAttribute("users", users);
		List<City> cities = new ArrayList<City>();
		cities.add(new City("37000","Krusevac"));
		cities.add(new City("18000","Nis"));
		cities.add(new City("11000","Beograd"));
		sce.getServletContext().setAttribute("cities", cities);
    }
	
}

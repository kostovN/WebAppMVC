package action.factory;

import action.AbstractAction;
import action.impl.CityAction;
import action.impl.HomeAction;
import action.impl.LoginAction;
import action.impl.LogoutAction;

public class ActionFactory {
	public static AbstractAction createActionFactory(String actionName) {
		AbstractAction action =null;
		if(actionName.equalsIgnoreCase("/login")) {
			action = new LoginAction();
			
		}
		if(actionName.equalsIgnoreCase("/logout")) {
			action = new LogoutAction();
			
		}
		if(actionName.equalsIgnoreCase("/home")) {
			action = new HomeAction();
			
		}
		if(actionName.equalsIgnoreCase("/city")) {
			action = new CityAction();
			
		}
		return action;
	}

}

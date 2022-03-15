package list;

import java.util.ArrayList;

import database.Database;
import user.AdminPortal;

public class AdminList extends UserList{
	ArrayList<AdminPortal> list;

	@Override
	public void populate(Database database) {
		list = database.getAdminList();
	}

	@Override
	public AdminPortal getPortal(String username) {
		for(AdminPortal admin: list)
		{
			if(admin.getUsername().equals(username)){
				return admin;
			}
		}
		return null;
	}
	
}
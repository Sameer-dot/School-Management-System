package list;

import java.util.ArrayList;

import database.Database;
import user.ParentPortal;

public class ParentList extends UserList{
	ArrayList<ParentPortal> list;

	@Override
	public void populate(Database database) {
		list = database.getParentList();
	}

	@Override
	public ParentPortal getPortal(String username) {
		for(ParentPortal admin: list)
		{
			if(admin.getUsername().equals(username)){
				return admin;
			}
		}
		return null;
	}
}

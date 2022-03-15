package list;

import database.Database;
import user.Portal;

public abstract class UserList implements ConcreteList{

	@Override
	public abstract void populate(Database database);

	public abstract Portal getPortal(String username);
}

package list;

import java.util.ArrayList;

import clas.SchoolClass;
import database.Database;
import user.AdminPortal;

public class ClassList implements ConcreteList {
	ArrayList<SchoolClass> list;

	@Override
	public void populate(Database database) {
		list = database.getClassList();
	}

	public void addClass(SchoolClass schoolClass) {
		list.add(schoolClass);
	}
	
	public ArrayList<SchoolClass> getList(){
		return list;
	}

}

package list;

import java.util.ArrayList;

import database.Database;
import user.TeacherPortal;

public class TeacherList extends UserList{
	ArrayList<TeacherPortal> list;

	@Override
	public void populate(Database database) {
		list = database.getTeacherList();
		
	}

	public void addTeacher(TeacherPortal teacher) {
		list.add(teacher);
	}
	
	public ArrayList<TeacherPortal> getList() {
		return list;
	}
	
	@Override
	public TeacherPortal getPortal(String username) {
		for(TeacherPortal admin: list)
		{
			if(admin.getUsername().equals(username)){
				return admin;
			}
		}
		return null;
	}
}
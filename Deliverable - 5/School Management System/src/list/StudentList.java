package list;

import java.util.ArrayList;

import database.Database;
import user.StudentPortal;

public class StudentList extends UserList{
	ArrayList<StudentPortal> list;

	@Override
	public void populate(Database database) {
		list = database.getStudentList();
	}

	@Override
	public StudentPortal getPortal(String username) {
		for(StudentPortal admin: list)
		{
			if(admin.getUsername().equals(username)){
				return admin;
			}
		}
		return null;
	}

	public void addStudent(StudentPortal student) {
		list.add(student);
	}

	public ArrayList<StudentPortal> getList() {
		return list;
	}
}

package list;

import java.util.ArrayList;

import clas.SchoolClass;
import database.Database;
import others.StudentClass;
import user.StudentPortal;

public class StudentClassList {
	ArrayList<StudentClass> list;

	public void populate(StudentList studentList, ClassList classList, Database database) {
		list = new ArrayList<>();
		
		for (StudentPortal student: studentList.getList()) {
			String className = database.getStudentClassName(student.getUsername());
			
			for (SchoolClass schoolClass: classList.getList()) {
				if (className.equals(schoolClass.getName())) {
					list.add(new StudentClass(schoolClass, student));
					break;
				}
			}
		}
	}

	public void addStudentClass(StudentClass studentClass) {
		list.add(studentClass);
	}
	
	public ArrayList<StudentClass> getList() {
		return list;
	}
}

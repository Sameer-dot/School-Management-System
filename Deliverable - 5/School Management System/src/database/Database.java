package database;

import java.util.ArrayList;

import clas.SchoolClass;
import subject.SchoolSubject;
import user.AdminPortal;
import user.ParentPortal;
import user.Portal;
import user.StudentPortal;
import user.TeacherPortal;

public interface Database {
	public void connect();
	public void close();
	
	public ArrayList<StudentPortal> getStudentList();
	public ArrayList<TeacherPortal> getTeacherList();
	public ArrayList<AdminPortal> getAdminList();
	public ArrayList<ParentPortal> getParentList();
	public ArrayList<SchoolSubject> getSubjectList();
	public ArrayList<String> getTeacherSubjectList(TeacherPortal teacher);
	public ArrayList<SchoolClass> getClassList();
	public ArrayList<String[]> getClassSubjectTeacherList(SchoolClass schoolClass);
	public String getStudentClassName(String username);
	
	public void updateUser(Portal user);
	public void addSchoolSubject(SchoolSubject schoolSubject);
	public void addTeacher(TeacherPortal teacher);
	public void addTeacherSubject(TeacherPortal teacher, SchoolSubject subject);
	public void addClass(SchoolClass schoolClass);
	public void addClassSubjectTeacher(SchoolClass schoolClass, SchoolSubject subject, TeacherPortal teacher);
	public void addStudent(StudentPortal student);
	public void addStudentClass(StudentPortal student, SchoolClass schoolClass);
}

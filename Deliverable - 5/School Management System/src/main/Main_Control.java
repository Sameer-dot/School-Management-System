package main;

import java.awt.EventQueue;
import java.util.ArrayList;

import clas.SchoolClass;
import database.*;
import gui.Main_View;
import list.*;
import others.SubjectTeacher;
import others.TeacherSubjects;
import subject.SchoolSubject;
import subject.Subject;
import user.AdminPortal;
import user.Portal;
import user.StudentPortal;
import user.TeacherPortal;
import user.UserType;

public class Main_Control {
	Database database;
	ParentList parentList;
	TeacherList teacherList;
	AdminList adminList;
	StudentList studentList;
	SubjectList subjectList;
	ClassList classList;
	TeacherSubjectList teacherSubjectList;
	ClassSubjectTeacherList classSubjectTeacherList;
	StudentClassList studentClassList;
	
	Portal portal;
	
	public Main_Control() {
		database = SQLDatabase.getInstance();
		database.connect();
		
		parentList = new ParentList();
		teacherList = new TeacherList();
		adminList = new AdminList();
		studentList = new StudentList();
		subjectList = new SubjectList();
		classList = new ClassList();
		teacherSubjectList = new TeacherSubjectList();
		classSubjectTeacherList = new ClassSubjectTeacherList();
		studentClassList = new StudentClassList();

		parentList.populate(database);
		teacherList.populate(database);
		adminList.populate(database);
		studentList.populate(database);
		subjectList.populate(database);
		classList.populate(database);
		teacherSubjectList.populate(teacherList, subjectList, database);
		classSubjectTeacherList.populate(classList, subjectList, teacherList, database);
		studentClassList.populate(studentList, classList, database);
	}
	
	public static void main(String[] args) {

		Main_Control mainControl = new Main_Control();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_View mainView = new Main_View(mainControl);
					mainView.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Portal getPortal() {
		return portal;
	}

	public void setPortal(Portal portal) {
		this.portal = portal;
	}

	public boolean login(String uname, String pass, UserType userType){
		UserList list = null;

		if (userType.equals(UserType.Admin)) {
			list = adminList;
		}
		else if (userType.equals(UserType.Teacher)) {
			list = teacherList;
		}
		else if (userType.equals(UserType.Student)) {
			list = studentList;
		}
		else if (userType.equals(UserType.Parent)) {
			list = parentList;
		}
		
		Portal portal = list.getPortal(uname);
		if (portal != null) {
			setPortal(portal);
			return portal.login(pass);
		}
		
		return false;
	}
	
	public void logout() {
		portal.logout();
		portal = null;
	}

	public String getPassword() {
		return portal.getPassword();
	}

	public void changePassword(String newPass) {
		portal.setPassword(newPass);
		updatePortal();
	}
	
	public void updatePortal() {
		database.updateUser(portal);
	}

	public Portal getStudentInfo() {
		return portal;
	}

	public void addSubject(String name, String code) {
		Subject subject= new SchoolSubject(name, code);
		((AdminPortal)portal).addSubject((SchoolSubject)subject, (SubjectList)subjectList, database);
	}

	public ArrayList<SchoolSubject> getSubjects() {
		return subjectList.getList();
	}

	public void addTeacher(String name, String username, String password, ArrayList<String> assignedSubjectsCode) {
		TeacherPortal teacher = new TeacherPortal(name, username, password);
		((AdminPortal)portal).addTeacher(teacher, teacherList, database);
		((AdminPortal)portal).assignTeacherSubjects(teacher, getAssignSubjects(assignedSubjectsCode), teacherSubjectList, database);
	}
	
	private ArrayList<SchoolSubject> getAssignSubjects(ArrayList<String> assignedSubjectsCode){
		ArrayList<SchoolSubject> list = new ArrayList<>();
		for (String subjectCode: assignedSubjectsCode) {
			list.add(subjectList.getSubject(subjectCode));
		}
		return list;
	}

	public ArrayList<TeacherPortal> getTeachers(String subjectCode) {
		ArrayList<TeacherPortal> teachers = new ArrayList<>();
		for (TeacherSubjects teacherSubjects: teacherSubjectList.getList()) {
			if (teacherSubjects.searchSubjectCode(subjectCode)) {
				teachers.add(teacherSubjects.getTeacher());
			}
		}
		
		return teachers;
	}

	public void addClass(String className, int classRoom, ArrayList<String[]> subjectTeacher) {
		SchoolClass schoolClass = new SchoolClass(className, classRoom);
		((AdminPortal)portal).addClass(schoolClass, classList, database);
		((AdminPortal)portal).assignClassSubjectTeacher(schoolClass, getSubjectTeacher(subjectTeacher), classSubjectTeacherList, database);
	}

	private ArrayList<SubjectTeacher> getSubjectTeacher(ArrayList<String[]> subjectsTeacherString) {
		ArrayList<SubjectTeacher> subjectsTeacher = new ArrayList<>();
		
		for(String[] str: subjectsTeacherString) {
			SubjectTeacher subjectTeacher = new SubjectTeacher(null, null);
			for(TeacherPortal teacher: teacherList.getList()) {
				if (teacher.getUsername().equals(str[1])) {
					subjectTeacher.setTeacherPortal(teacher);
					break;
				}
			}
			for (SchoolSubject subject: subjectList.getList()) {
				if (subject.getCode().equals(str[0])) {
					subjectTeacher.setSubject(subject);
				}
			}
			subjectsTeacher.add(subjectTeacher);
		}
		
		return subjectsTeacher;
	}

	public ArrayList<SchoolClass> getClasses() {
		return classList.getList();
	}

	public void addStudent(String name, String username, String password, String className) {
		StudentPortal student = new StudentPortal();
		student.setName(name);
		student.setUsername(username);
		student.setPassword(password);
		
		((AdminPortal)portal).addStudent(student, studentList, database);
		((AdminPortal)portal).assignClass(student, getClass(className), studentClassList, database);
	}
	
	private SchoolClass getClass(String className) {
		for (SchoolClass schoolClass: classList.getList()) {
			if (className.equals(schoolClass.getName())) {
				return schoolClass;
			}
		}
		return null;
	}
}

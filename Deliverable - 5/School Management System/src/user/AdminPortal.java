package user;

import java.util.ArrayList;

import clas.SchoolClass;
import database.Database;
import list.ClassList;
import list.ClassSubjectTeacherList;
import list.StudentClassList;
import list.StudentList;
import list.SubjectList;
import list.TeacherList;
import list.TeacherSubjectList;
import others.ClassSubjectTeacher;
import others.StudentClass;
import others.SubjectTeacher;
import others.TeacherSubjects;
import subject.SchoolSubject;

public class AdminPortal extends UserPortal{

	public AdminPortal() {
	}

	@Override
	public UserType getUserType() {
		return UserType.Admin;
	}

	public void addSubject(SchoolSubject subject, SubjectList subjectList, Database database) {
		subjectList.addSubject(subject);
		database.addSchoolSubject(subject);
	}

	public void addTeacher(TeacherPortal teacher, TeacherList teacherList, Database database) {
		teacherList.addTeacher(teacher);
		database.addTeacher(teacher);
	}

	public void assignTeacherSubjects(TeacherPortal teacher, ArrayList<SchoolSubject> assignedSubjects, TeacherSubjectList teacherSubjectList, Database database) {
		TeacherSubjects teacherSubjects = new TeacherSubjects(teacher, assignedSubjects);
		teacherSubjectList.addTeacherSubjects(teacherSubjects);

		for (SchoolSubject subject: assignedSubjects) {
			database.addTeacherSubject(teacher, subject);
		}
	}

	public void assignClassSubjectTeacher(SchoolClass schoolClass, ArrayList<SubjectTeacher> subjectTeacher, ClassSubjectTeacherList classes, Database database) {
		ClassSubjectTeacher classSubjectTeacher = new ClassSubjectTeacher();
		classSubjectTeacher.setSchoolClass(schoolClass);
		classSubjectTeacher.setSubjectTeacher(subjectTeacher);
		
		classes.addClassSubjectTeacher(classSubjectTeacher);
		
		for (SubjectTeacher subTeach: subjectTeacher) {
			database.addClassSubjectTeacher(schoolClass, subTeach.getSubject(), subTeach.getTeacherPortal());
		}
	}

	public void addClass(SchoolClass schoolClass, ClassList classList, Database database) {
			classList.addClass(schoolClass);
			database.addClass(schoolClass);
	}

	public void addStudent(StudentPortal student, StudentList studentList, Database database) {
		studentList.addStudent(student);
		database.addStudent(student);
	}

	public void assignClass(StudentPortal student, SchoolClass schoolClass, StudentClassList studentClassList, Database database) {
		StudentClass studentClass = new StudentClass(schoolClass, student);
		studentClassList.addStudentClass(studentClass);
		
		database.addStudentClass(student, schoolClass);
	}

//	void viewInfo(String name, String userName) {
//	
//}

//boolean addStudent(String userName, String name, String password, Class class) {
//	
//}

//boolean addParent(String userName, String name, String password, StudentPortal std) {
//	
//}

//}
//
//boolean GenerateFee(String clas, int fee, int noOfMonths) {
//	
//}
//
//boolean changeOPassword(String userName, String newPass, String confnewPass) {
//	
//}
}

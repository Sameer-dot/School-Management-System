package list;

import java.util.ArrayList;

import clas.SchoolClass;
import database.Database;
import others.ClassSubjectTeacher;
import others.SubjectTeacher;
import subject.SchoolSubject;
import user.TeacherPortal;

public class ClassSubjectTeacherList {
	ArrayList<ClassSubjectTeacher> list;

	public void populate(ClassList classList, SubjectList subjectList, TeacherList teacherList, Database database) {
		list = new ArrayList<>();
		
		
		for(SchoolClass schoolClass: classList.getList()) {
			ClassSubjectTeacher classSubjectTeacher = new ClassSubjectTeacher();
			ArrayList<String[]> subTeach =  database.getClassSubjectTeacherList(schoolClass);
	
			ArrayList<SubjectTeacher> subjectTeachers = new ArrayList<>();
			for (String[] str: subTeach) {
				SubjectTeacher subjectTeacher = new SubjectTeacher(null, null);
				for (TeacherPortal teacher: teacherList.getList()) {
					if (teacher.getUsername().equals(str[1])) {
						subjectTeacher.setTeacherPortal(teacher);
					}
				}
				for (SchoolSubject subject: subjectList.getList()) {
					if (subject.getCode().equals(str[0])) {
						subjectTeacher.setSubject(subject);
					}
				}
				subjectTeachers.add(subjectTeacher);
			}
			
			if (subjectTeachers.size() > 0) {
				classSubjectTeacher.setSchoolClass(schoolClass);
				classSubjectTeacher.setSubjectTeacher(subjectTeachers);
				list.add(classSubjectTeacher);
			}
		}
	}

	public void addClassSubjectTeacher(ClassSubjectTeacher classSubjectTeacher) {
		list.add(classSubjectTeacher);
	}
	
	public ArrayList<ClassSubjectTeacher> getList() {
		return list;
	}
}

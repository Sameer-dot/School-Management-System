package list;

import java.util.ArrayList;

import database.Database;
import others.TeacherSubjects;
import subject.SchoolSubject;
import user.TeacherPortal;

public class TeacherSubjectList{
	ArrayList<TeacherSubjects> list;

	public void populate(TeacherList teacherList, SubjectList subjectList, Database database) {
		list = new ArrayList<>();
		for(TeacherPortal teacher: teacherList.getList()) {
			ArrayList<String> subjectsCode =  database.getTeacherSubjectList(teacher);
			
			ArrayList<SchoolSubject> assignedSubjects = new ArrayList<>();
			for (SchoolSubject subject: subjectList.getList()) {
				for (String subjectCode: subjectsCode) {
					if (subject.getCode().equals(subjectCode)) {
						assignedSubjects.add(subject);
						break;
					}
				}
			}
			
			if (assignedSubjects.size() > 0) {
				TeacherSubjects teacherSubjects = new TeacherSubjects(teacher, assignedSubjects);
				list.add(teacherSubjects);
			}
		}
	}

	public void addTeacherSubjects(TeacherSubjects teacherSubjects) {
		list.add(teacherSubjects);
	}
	
	public ArrayList<TeacherSubjects> getList() {
		return list;
	}

}
package others;
import java.util.ArrayList;

import subject.SchoolSubject;
import user.TeacherPortal;

public class TeacherSubjects {
	TeacherPortal teacher;
	ArrayList<SchoolSubject> assignedSubjects;
	
	public TeacherSubjects(TeacherPortal teacher, ArrayList<SchoolSubject> assignedSubjects) {
		setTeacher(teacher);
		setAssignedSubjects(assignedSubjects);
	}
	
	public void setAssignedSubjects(ArrayList<SchoolSubject> assignedSubjects) {
		this.assignedSubjects = assignedSubjects;
	}
	
	public void setTeacher(TeacherPortal teacher) {
		this.teacher = teacher;
	}
	
	public TeacherPortal getTeacher() {
		return teacher;
	}
	
	public ArrayList<SchoolSubject> getAssignedSubjects() {
		return assignedSubjects;
	}

	public boolean searchSubjectCode(String subjectCode) {
		for (SchoolSubject subject: assignedSubjects) {
			if (subject.getCode().equals(subjectCode)) {
				return true;
			}
		}
		return false;
	}
}

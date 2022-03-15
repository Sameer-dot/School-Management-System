package others;

import subject.SchoolSubject;
import user.TeacherPortal;

public class SubjectTeacher {
	private	SchoolSubject subject;
	private TeacherPortal teacher;
	
	public SubjectTeacher(SchoolSubject subject, TeacherPortal teacher) {
		setSubject(subject);
		setTeacherPortal(teacher);
	}
	
	public SchoolSubject getSubject() {
		return subject;
	}
	
	public void setSubject(SchoolSubject subject) {
		this.subject = subject;
	}
	
	public TeacherPortal getTeacherPortal() {
		return teacher;
	}
	
	public void setTeacherPortal(TeacherPortal teacher) {
		this.teacher = teacher;
	}
	
}

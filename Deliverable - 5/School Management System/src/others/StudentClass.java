package others;

import clas.SchoolClass;
import user.StudentPortal;

public class StudentClass {
	private SchoolClass schoolClass;
	private StudentPortal student;
	
	public StudentClass(SchoolClass schoolClass, StudentPortal student) {
		setSchoolClass(schoolClass);
		setStudent(student);
	}
	
	public SchoolClass getSchoolClass() {
		return schoolClass;
	}
	
	public void setSchoolClass(SchoolClass schoolClass) {
		this.schoolClass = schoolClass;
	}
	
	public StudentPortal getStudent() {
		return student;
	}
	
	public void setStudent(StudentPortal student) {
		this.student = student;
	}

}

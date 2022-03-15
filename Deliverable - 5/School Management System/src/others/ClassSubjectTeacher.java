package others;

import java.util.ArrayList;

import com.ibm.icu.impl.Pair;

import clas.*;
import subject.SchoolSubject;
import user.TeacherPortal;

public class ClassSubjectTeacher {
	private	SchoolClass schoolClass;
	private ArrayList<SubjectTeacher> subjectTeacher;
	
	public SchoolClass getSchoolClass() {
		return schoolClass;
	}
	
	public void setSchoolClass(SchoolClass schoolClass) {
		this.schoolClass = schoolClass;
	}

	public ArrayList<SubjectTeacher> getSubjectTeacher() {
		return subjectTeacher;
	}

	public void setSubjectTeacher(ArrayList<SubjectTeacher> subjectTeacher) {
		this.subjectTeacher = subjectTeacher;
	}
	
}

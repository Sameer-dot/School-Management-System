package list;

import java.util.ArrayList;

import database.Database;
import subject.SchoolSubject;

public class SubjectList implements ConcreteList {
	ArrayList<SchoolSubject> list;
	
	@Override
	public void populate(Database database) {
		list = database.getSubjectList();
	}

	public void addSubject(SchoolSubject subject) {
		list.add(subject);
	}

	public ArrayList<SchoolSubject> getList() {
		return list;
	}

	public SchoolSubject getSubject(String subjectCode) {
		for (SchoolSubject subject: list) {
			if (subject.getCode().equals(subjectCode)) {
				return subject;
			}
		}
		return null;
	}
}

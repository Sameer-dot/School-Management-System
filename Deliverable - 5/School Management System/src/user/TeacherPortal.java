package user;

public class TeacherPortal extends UserPortal{

	public TeacherPortal(String name, String username, String password) {
		setName(name);
		setUsername(username);
		setPassword(password);
	}

	@Override
	public UserType getUserType() {
		return UserType.Teacher;
	}
	
//	void viewInfo(String userName, String name, ClassSubject csList) {
//		
//	}
//	
//	void assignTask(String class, String subject, String title, String description,int marks) {
//		
//	}
//	
//	void markAttendance((String class, String subject, String date, String month, String year, Attendance atendanceList){
//		
//	}
//	
//	void makeReport(String class, String subject, int marks, Report reportList) {
//		
//	}
//	
//	void viewLeaves() {
//		
//	}
}

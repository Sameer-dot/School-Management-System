package user;

public class StudentPortal extends UserPortal{

	public StudentPortal() {
	}

	@Override
	public UserType getUserType() {
		return UserType.Student;
	}
	
//	void viewInformation(String name, String userName, Subject subList) {
//		
//	}
//	
//	void viewTask() {
//		
//	}
//	
//	void viewAttendance() {
//		
//	}
//	
//	void viewLeaves() {
//		
//	}
//	
//	void viewReport() {
//		
//	}
}

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clas.SchoolClass;
import subject.SchoolSubject;
import user.*;

public class SQLDatabase implements Database {
	private static SQLDatabase database;

	private String connectionUrl;
	private Connection connection;

	private SQLDatabase(){
		connectionUrl =
				"jdbc:sqlserver://localhost;"
						+ "database=SchoolDB;"
						+ "integratedSecurity=true;";
	}

	public static SQLDatabase getInstance() {
		if (database == null) {
			database = new SQLDatabase();
		}

		return database;
	}

	@Override
	public ArrayList<StudentPortal> getStudentList(){
		ArrayList<StudentPortal> list = new ArrayList<>();

		PreparedStatement select = null;

		try {
			select = connection.prepareStatement("SELECT username, password, name FROM student");

			ResultSet resultSet = select.executeQuery();
			while (resultSet.next()) {
				StudentPortal usr = new StudentPortal();

				usr.setUsername(resultSet.getString(1));
				usr.setPassword(resultSet.getString(2));
				usr.setName(resultSet.getString(3));

				list.add(usr);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public ArrayList<TeacherPortal> getTeacherList(){
		ArrayList<TeacherPortal> list = new ArrayList<>();

		PreparedStatement select = null;

		try {
			select = connection.prepareStatement("SELECT name, username, password FROM teacher");

			ResultSet resultSet = select.executeQuery();
			while (resultSet.next()) {
				TeacherPortal usr = new TeacherPortal(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));

				list.add(usr);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public ArrayList<AdminPortal> getAdminList(){
		ArrayList<AdminPortal> list = new ArrayList<>();

		PreparedStatement select = null;

		try {
			select = connection.prepareStatement("SELECT username, password, name FROM admin");

			ResultSet resultSet = select.executeQuery();
			while (resultSet.next()) {
				AdminPortal usr = new AdminPortal();

				usr.setUsername(resultSet.getString(1));
				usr.setPassword(resultSet.getString(2));
				usr.setName(resultSet.getString(3));

				list.add(usr);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public ArrayList<ParentPortal> getParentList(){
		ArrayList<ParentPortal> list = new ArrayList<>();

		PreparedStatement select = null;

		try {
			select = connection.prepareStatement("SELECT username, password, name FROM parent");

			ResultSet resultSet = select.executeQuery();
			while (resultSet.next()) {
				ParentPortal usr = new ParentPortal();

				usr.setUsername(resultSet.getString(1));
				usr.setPassword(resultSet.getString(2));
				usr.setName(resultSet.getString(3));

				list.add(usr);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public ArrayList<SchoolSubject> getSubjectList(){
		ArrayList<SchoolSubject> list = new ArrayList<>();

		PreparedStatement select = null;

		try {
			select = connection.prepareStatement("SELECT name, code FROM subject");

			ResultSet resultSet = select.executeQuery();
			while (resultSet.next()) {
				SchoolSubject subject = new SchoolSubject(resultSet.getString(1), resultSet.getString(2));

				list.add(subject);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public void connect() {		
		try {
			connection = DriverManager.getConnection(connectionUrl);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void close() {
		try {
			connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateUser(Portal user) {
		PreparedStatement select = null;

		try {
			select = connection.prepareStatement("UPDATE ? SET password = ? , name = ? WHERE username = ?");

			select.setString(1, user.getUserType().name());
			select.setString(2, user.getPassword());
			select.setString(3, user.getName());
			select.setString(4, user.getUsername());

			select.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addSchoolSubject(SchoolSubject schoolSubject) {
		PreparedStatement select = null;

		try {
			select = connection.prepareStatement("INSERT INTO subject values (?, ?)");

			select.setString(1, schoolSubject.getCode());
			select.setString(2, schoolSubject.getName());

			select.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addTeacher(TeacherPortal teacher) {
		PreparedStatement select = null;

		try {
			select = connection.prepareStatement("INSERT INTO teacher values (?, ?, ?)");

			select.setString(1, teacher.getUsername());
			select.setString(2, teacher.getPassword());
			select.setString(3, teacher.getName());

			select.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addTeacherSubject(TeacherPortal teacher, SchoolSubject subject) {
		PreparedStatement select = null;

		try {
			select = connection.prepareStatement("INSERT INTO teacherSubject values (?, ?)");

			select.setString(1, teacher.getUsername());
			select.setString(2, subject.getCode());

			select.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<String> getTeacherSubjectList(TeacherPortal teacher) {
		ArrayList<String> list = new ArrayList<>();

		PreparedStatement select = null;

		try {
			select = connection.prepareStatement("SELECT subjectCode FROM teacherSubject WHERE teacherUsername = ?");
			select.setString(1, teacher.getUsername());

			ResultSet resultSet = select.executeQuery();
			while (resultSet.next()) {
				list.add(resultSet.getString(1));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public ArrayList<SchoolClass> getClassList() {
		ArrayList<SchoolClass> list = new ArrayList<>();

		PreparedStatement select = null;

		try {
			select = connection.prepareStatement("SELECT name, roomNo FROM class");

			ResultSet resultSet = select.executeQuery();
			while (resultSet.next()) {
				SchoolClass schoolClass = new SchoolClass(resultSet.getString(1), Integer.parseInt(resultSet.getString(2)));

				list.add(schoolClass);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public void addClass(SchoolClass schoolClass) {
		PreparedStatement select = null;

		try {
			select = connection.prepareStatement("INSERT INTO class values (?, ?)");

			select.setString(1, schoolClass.getName());
			select.setString(2, String.valueOf(schoolClass.getRoomNo()));

			select.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addClassSubjectTeacher(SchoolClass schoolClass, SchoolSubject subject, TeacherPortal teacher) {
		PreparedStatement select = null;

		try {
			select = connection.prepareStatement("INSERT INTO classSubjectTeacher values (?, ?, ?)");

			select.setString(1, schoolClass.getName());
			select.setString(2, subject.getCode());
			select.setString(3, teacher.getUsername());

			select.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<String[]> getClassSubjectTeacherList(SchoolClass schoolClass) {
		ArrayList<String[]> list = new ArrayList<>();

		PreparedStatement select = null;

		try {
			select = connection.prepareStatement("SELECT subjectCode, teacherUsername FROM classSubjectTeacher WHERE className = ?");
			select.setString(1, schoolClass.getName());

			ResultSet resultSet = select.executeQuery();
			while (resultSet.next()) {
				list.add(new String[]{resultSet.getString(1), resultSet.getString(2)});
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public void addStudent(StudentPortal student) {
		PreparedStatement select = null;

		try {
			select = connection.prepareStatement("INSERT INTO student values (?, ?, ?)");

			select.setString(1, student.getUsername());
			select.setString(2, student.getPassword());
			select.setString(3, student.getName());

			select.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String getStudentClassName(String username) {
		String className = null;

		PreparedStatement select = null;

		try {
			select = connection.prepareStatement("SELECT className from studentClass WHERE username = ?");
			select.setString(1, username);

			ResultSet resultSet = select.executeQuery();
			if (resultSet.next()) {
				className = resultSet.getString(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return className;
	}

	@Override
	public void addStudentClass(StudentPortal student, SchoolClass schoolClass) {
		PreparedStatement select = null;

		try {
			select = connection.prepareStatement("INSERT INTO studentClass values (?, ?)");

			select.setString(1, student.getUsername());
			select.setString(2, schoolClass.getName());

			select.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

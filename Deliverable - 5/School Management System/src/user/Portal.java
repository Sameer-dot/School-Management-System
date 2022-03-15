package user;

public interface Portal {
	 public String getName();
	 public String getUsername();
	 public String getPassword();
	 public UserType getUserType();
	 
	 public void setName(String name);
	 public void setUsername(String username);
	 public void setPassword(String password);
	 
	 public boolean login(String password);
	 public void logout();
}

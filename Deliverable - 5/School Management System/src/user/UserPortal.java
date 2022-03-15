package user;

public abstract class UserPortal implements Portal{
	protected String name;
	protected String username;
	protected String password;
	
	public UserPortal() {
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public String getPassword() {
		return password;
	}
	
	@Override
	public abstract UserType getUserType();
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public boolean login(String password) {
		return getPassword().equals(password);
	}
	
	@Override
	public void logout() {
		//save
	}
}

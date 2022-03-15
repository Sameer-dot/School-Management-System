package subject;

public class SchoolSubject implements Subject {
	private String name;
	private String code;
	
	public SchoolSubject(String name, String code) {
		this.setName(name);
		this.setCode(code);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public void setCode(String code) {
		this.code = code;
	}
}

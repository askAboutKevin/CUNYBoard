package dao.entity;

public class Class {

	private String empl;
	private String section;
	private String name;
	
	public Class(String empl, String section, String name) {
		super();
		this.empl = empl;
		this.section = section;
		this.name = name;
	}

	public Class() {
	}

	public String getEmpl() {
		return empl;
	}

	public void setEmpl(String empl) {
		this.empl = empl;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

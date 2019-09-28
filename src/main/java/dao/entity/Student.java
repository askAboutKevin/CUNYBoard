package dao.entity;

public class Student {

	private String name;
	private String empl;
	private String email;
	private String number;
	private float gpa;
	
	public Student(String name, String empl, String email, String number, float gpa) {
		super();
		this.name = name;
		this.empl = empl;
		this.email = email;
		this.number = number;
		this.gpa = gpa;
	}

	public Student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpl() {
		return empl;
	}

	public void setEmpl(String empl) {
		this.empl = empl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	

}

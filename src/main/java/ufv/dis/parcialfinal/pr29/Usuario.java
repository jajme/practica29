package ufv.dis.parcialfinal.pr29;

public class Usuario {
	private String name;
	private String surname;
	private String Email;
	private String DNI;
	private String birthdate;
	private Integer age;
	private boolean adult;
	
	public Usuario(String name, String surname, String email, String dNI, String birthdate, Integer age) {
		super();
		this.name = name;
		this.surname = surname;
		Email = email;
		DNI = dNI;
		this.birthdate = birthdate;
		this.age = age;
		this.adult = age > 17;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
		this.adult = age > 17;
	}

	public boolean isAdult() {
		return adult;
	}
	
}

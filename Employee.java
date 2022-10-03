package circle;

import java.time.LocalDate;

abstract public class Employee {

	private int id;
	private String name;
	private LocalDate dob;
	private String email;
	private int phone;
	private GenderType gender;

	public Employee() {

	}

	public Employee(int id, String name, LocalDate dob, String email, int phone, GenderType gender) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
	}

	abstract public void calculateSalary();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public GenderType getGender() {
		return gender;
	}

	public void setGender(GenderType gender) {
		this.gender = gender;
	}

}

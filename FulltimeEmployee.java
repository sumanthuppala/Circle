package circle;

import java.time.LocalDate;

public class FulltimeEmployee extends Employee {

	private LocalDate doj;

	public FulltimeEmployee() {

	}

	public FulltimeEmployee(int id, String name, LocalDate dob, String email, int phone, GenderType gender,
			LocalDate doj) {
		super(id, name, dob, email, phone, gender);
		this.doj = doj;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	@Override
	public void calculateSalary() {

	}

	public static void main(String[] args) {
		FulltimeEmployee FE = new FulltimeEmployee();
		FE.setId(1589);
		FE.setName("jon smith");
		FE.setDob(LocalDate.of(1992, 12, 23));
		FE.setEmail("Jon@gmail.com");
		FE.setPhone(485698568);
		FE.setGender(GenderType.MALE);
		FE.setDoj(LocalDate.of(2021, 05, 25));

		System.out.println("ID        :  " + FE.getId());
		System.out.println("Name      :  " + FE.getName());
		System.out.println("DOB       :  " + FE.getDob());
		System.out.println("Email     :  " + FE.getEmail());
		System.out.println("Phone     :  " + FE.getPhone());
		System.out.println("Gender    :  " + FE.getGender());
		System.out.println("Doj       :  " + FE.getDoj());
	}
}

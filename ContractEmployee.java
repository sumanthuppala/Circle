package circle;

import java.time.LocalDate;

public class ContractEmployee extends Employee {

	private LocalDate startDate;
	private LocalDate endDate;

	public ContractEmployee() {

	}

	public ContractEmployee(int id, String name, LocalDate dob, String email, int phone, GenderType gender,
			LocalDate startDate, LocalDate endDate) {
		super(id, name, dob, email, phone, gender);
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public void calculateSalary() {

	}

	public static void main(String[] args) {

		ContractEmployee CE = new ContractEmployee();
		CE.setId(1487);
		CE.setName("Sansa Geller");
		CE.setDob(LocalDate.of(1993, 03, 15));
		CE.setGender(GenderType.FEMALE);
		CE.setEmail("sansa@gmail.com");
		CE.setPhone(456897554);
		CE.setStartDate(LocalDate.of(2021, 05, 25));
		CE.setEndDate(LocalDate.of(2022, 05, 25));

		System.out.println("ID           :  " + CE.getId());
		System.out.println("Name         :  " + CE.getName());
		System.out.println("DOB          :  " + CE.getDob());
		System.out.println("Gender       :  " + CE.getGender());
		System.out.println("Email        :  " + CE.getEmail());
		System.out.println("Phone        :  " + CE.getPhone());
		System.out.println("Start date   :  " + CE.getStartDate());
		System.out.println("End date     :  " + CE.getEndDate());

	}
}

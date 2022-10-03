package circle;

public class Test {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setId(253);
		customer.setName("ross");
		customer.setDob("2/4/99");
		customer.setEmail("ross66@gmail.com");

		System.out.println("Customer ID      :" + customer.getId());
		System.out.println("Customer name    :" + customer.getName());
		System.out.println("Customer dob     :" + customer.getDob());
		System.out.println("Customer email   :" + customer.getEmail());
	}

}

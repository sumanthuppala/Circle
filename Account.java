package circle;

public class Account {

	public static void main(String[] args) {
		Circle account = new Circle(1, 200, 6753);

		Circle account2 = new Circle(2, 300, 2356);
//		account.withdraw(10);
		System.out.println(account.accountNo);
		System.out.println("balance          :" + account.balance);
		System.out.println("balance          :" + account2.balance);
	}

}
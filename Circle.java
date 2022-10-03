package circle;

public class Circle {

	int accountNo;
	float balance;
	int pin;

	public Circle() {

	}

	public Circle(int accountNo, float balance, int pin) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.pin = pin;
	}

	public void deposit(int deposit) {
		if (deposit > 0) {

			balance = balance + deposit;
		} else {

			System.out.println("invalid amount");

		}
	}

	public void withdraw(int withdraw) {

		if (withdraw < balance) {

			balance = balance - withdraw;

		}

		else {
			System.out.println("insufficient funds");
		}

	}

}

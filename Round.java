package circle;

public class Round {

	float radius;
	final double pi = 3.14;

	public Round() {

	}

	public Round(float radius) {
		this.radius = radius;
	}

	public void cf(float circumference) {

		if (radius > 0) {

			circumference = (float) (2 * pi * radius);

		} else {
			System.out.println("invalid radius");

		}

	}

	public static void main(String[] args) {

		Round circle = new Round((float) -2.3);

//		System.out.println("circumference of the given circle is  :" + circle.circumference());
	}

}

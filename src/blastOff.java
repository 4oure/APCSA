public class blastOff {
	public static void main(String[] args) {


		launchSequence(10);
		System.out.println(factorialFinder(5));
	}

	public static int launchSequence(int num) {
		if (num != 0) {
			System.out.println(num);
			launchSequence(num - 1);

		} else {
			System.out.println("Blast off!!");
		}
		return 1;

	}

	public static int factorialFinder(int num) {
		if (num <= 1) {
			return 1;
		} else {
			return num * factorialFinder(num - 1);
		}
	}

}


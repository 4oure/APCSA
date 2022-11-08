public class blastOff {
	public static void main(String[] args) {


		launchSequence(10);
	}

	public static int launchSequence(int num) {
		if (num != 0) {
			System.out.println(num);
			launchSequence(num - 1);

		} else {
			System.out.println("Blast off!!");
		}
		// random return
		return 1;

	}
}

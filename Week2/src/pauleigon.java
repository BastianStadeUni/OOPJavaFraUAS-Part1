import java.util.Scanner;

public class pauleigon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int serverChange = scanner.nextInt();
		int scoreSum = scanner.nextInt() + scanner.nextInt();
		if((scoreSum / serverChange) % 2 == 0) {
			System.out.println("paul");
		}
		else {
			System.out.println("opponent");
		}
		

	}

}

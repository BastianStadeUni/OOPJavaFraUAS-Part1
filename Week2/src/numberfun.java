import java.util.Scanner;

public class numberfun {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int result = scanner.nextInt();
			if(a * b == result || (a / b == result && a % b == 0) || a + b == result || a - b == result || (b / a == result && b % a == 0) || b - a == result) {
				System.out.println("Possible");
			}
			else { System.out.println("Impossible"); }
		}
	}
}

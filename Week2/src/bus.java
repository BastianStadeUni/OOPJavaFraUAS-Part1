
import java.util.Scanner;
public class bus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 0; i < n; i++) {
			double result = 0;
			int stops = scanner.nextInt();
			for(int j = 0; j < stops; j++) {
				result += 0.5;
				result *= 2;
			}
			System.out.println((int)result);
		}
	}
}

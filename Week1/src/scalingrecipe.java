
import java.util.Scanner;
public class scalingrecipe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double x = scanner.nextInt();
		double y = scanner.nextInt();
		double multi = y / x;
		for(int i = 0; i < n; i++) {
			System.out.println(Math.round(scanner.nextInt() * multi));
		}
	}

}

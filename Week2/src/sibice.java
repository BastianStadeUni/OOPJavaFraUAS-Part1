import java.util.Scanner;

public class sibice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		double z = Math.sqrt(x * x + y * y);
		for(int i = 0; i < n; i++) {
			if(z >= scanner.nextInt()) {
				System.out.println("DA");
			}
			else {
				System.out.println("NE");
			}
		}

	}

}

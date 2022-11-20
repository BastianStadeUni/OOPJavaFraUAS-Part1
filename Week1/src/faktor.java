

import java.util.Scanner;
public class faktor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int articles = scanner.nextInt();
		int impact = scanner.nextInt();
		int scientists = articles * (impact - 1);
		System.out.println(scientists + 1);

	}
}
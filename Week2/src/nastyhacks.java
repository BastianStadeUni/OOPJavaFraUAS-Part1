import java.util.Scanner;
public class nastyhacks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int rev_if_not, expected_rev, cost;
		for(int i = 0; i < n; i++) {
			rev_if_not = scanner.nextInt();
			expected_rev = scanner.nextInt();
			cost = scanner.nextInt();
			if(expected_rev - cost > rev_if_not) {
				System.out.println("advertise");
			}
			else if(expected_rev - cost < rev_if_not) {
				System.out.println("do not advertise");
			}
			else {
				System.out.println("does not matter");
			}
		}
	}
}



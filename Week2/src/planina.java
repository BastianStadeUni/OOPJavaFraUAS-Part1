import java.util.Scanner;

public class planina {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int square = 2;
		int iterations = scanner.nextInt();
		for(int i = 0; i < iterations; i++) {
			square = square * 2 - 1;
		}
		System.out.println((int)Math.pow(square, 2));

	}
}

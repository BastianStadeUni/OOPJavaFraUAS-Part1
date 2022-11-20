import java.util.Scanner;

public class areal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long area = scanner.nextLong();
		double sideLenght = Math.sqrt(area);
		System.out.println(sideLenght * 4);
	}

}

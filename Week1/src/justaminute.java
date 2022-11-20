
import java.util.Scanner;
public class justaminute {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("Test");
		
		double SL;
		double minutes = 0, seconds = 0;
		for(int i = 0; i < n; i++) {
			minutes += scanner.nextInt();
			seconds += scanner.nextInt();
		}
		SL = seconds / (minutes * 60);
		if(SL <= 1) {
			System.out.println("measurement error");
		}
		else {
			System.out.println(SL);
		}
		scanner.close();

	}

}

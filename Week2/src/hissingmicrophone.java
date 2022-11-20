import java.util.Scanner;

public class hissingmicrophone {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char[] charArray = str.toCharArray();
		boolean hiss = false;
		char lf = 's';
		for(int i = 0; i < str.length() - 1; i++) {
			if(charArray[i] == 's' && charArray[i+1] == 's') {
				hiss = true;
			}
		}
		if(hiss) {
			System.out.println("hiss");
		}
		else {
			System.out.println("no hiss");
		}

	}

}

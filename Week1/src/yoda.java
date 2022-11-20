
import java.util.Scanner;

public class yoda {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int digits1 = 0, digits2 = 0, end1 = 0, end2 = 0;
		int mod1, mod2;
		while(number1 > 0 || number2 > 0) {
			mod1 = number1 % 10;
			number1 /= 10;
			mod2 = number2 % 10;
			number2 /= 10;
			if(mod1 == mod2) {
				end1 += mod1 * Math.pow(10, digits1);
				digits1 += 1;
				end2 += mod2 * Math.pow(10, digits2);
				digits2 += 1;
			}
			else if(mod1 > mod2) {
				end1 += mod1 * Math.pow(10, digits1);
				digits1 += 1;
			}
			else {
				end2 += mod2 * Math.pow(10, digits2);
				digits2 += 1;
			}
		}
		if(number1 != 0) {
			while(number1 > 0) {
				mod1 = number1 % 10;
				number1 /= 10;
				end1 += mod1 * Math.pow(10, digits1);
				digits1 += 1;
			}
		}
		else if(number2 != 0) {
			while(number1 > 0) {
				mod2 = number2 % 10;
				number2 /= 10;
				end2 += mod2 * Math.pow(10, digits2);
				digits2 += 1;
			}
		}
		if(end1 == 0 && digits1 == 0) {
			System.out.println("YODA");
		}
		else {
			System.out.println(end1);
		}
		if(end2 == 0 && digits2 == 0) {
			System.out.println("YODA");
		}
		else {
			System.out.println(end2);
		}
	}
}

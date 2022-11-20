import java.util.Scanner;

public class sok {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int orange = scanner.nextInt();
		int apple = scanner.nextInt();
		int pine = scanner.nextInt();
		int Rorange = scanner.nextInt();
		int Rapple = scanner.nextInt();
		int Rpine = scanner.nextInt();
		float orangeRatio = 0;
		float appleRatio = 0;
		float pineRatio = 0;
		while((orange - Rorange) >= 0 && (apple - Rapple) >= 0 && (pine - Rpine) >= 0) {
			orange -= Rorange;
			apple -= Rapple;
			pine -= Rpine;
		}
		if(orange - Rorange <= 0) {
			float ratio = (float)orange / Rorange;
			orangeRatio = orange - (Rorange * ratio);
			appleRatio = apple - (Rapple * ratio);
			pineRatio = pine - (Rpine * ratio);
		}
		else if(apple - Rapple <= 0) {
			float ratio = (float)apple / Rapple;
			orangeRatio = orange - (Rorange * ratio);
			appleRatio = apple - (Rapple * ratio);
			pineRatio = pine - (Rpine * ratio);
		}
		else if(pine - Rpine <= 0) {
			float ratio = (float)pine / Rpine;
			orangeRatio = orange - (Rorange * ratio);
			appleRatio = apple - (Rapple * ratio);
			pineRatio = pine - (Rpine * ratio);
		}
		System.out.println(orangeRatio + " " + appleRatio + " " + pineRatio);
	}

}

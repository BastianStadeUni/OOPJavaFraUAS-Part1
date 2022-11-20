import java.util.Scanner;

public class server {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int time = scanner.nextInt();
		int taskSum = 0; //time sum of the task that can be made
		int count = 0;
		for(int i = 0; i < n; i++) {
			int currInt = scanner.nextInt();
			if(taskSum + currInt <= time) {
				taskSum += currInt;
				count++;
			}
			else {
				break;
			}
		}
		System.out.println(count);
		
	}
}

import java.util.Scanner;
import java.util.ArrayList;

public class unlockpattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] locs = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				int currInt = sc.nextInt();
				locs[i][j] = currInt;
				
			}
		}
		int currX = 0, currY = 0, nextX = 0, nextY = 0;
		double distance = 0;
		for(int value = 1; value < 9; value++) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(locs[i][j] == value) {
						currX = i;
						currY = j;
					}
					else if(locs[i][j] == value + 1) {
						nextX = i;
						nextY = j;
					}
				}
			}
			if(currX == nextX) {
				distance += Math.abs(currY - nextY);
				continue;
			}
			else if(currY == nextY) {
				distance += Math.abs(currX - nextX);
				continue;
			}
			int diffX = Math.abs(currX - nextX);
			int diffY = Math.abs(currY - nextY);
			distance += Math.sqrt(Math.pow(diffX,  2) + Math.pow(diffY,  2));
		}
		System.out.println(distance);
	}

}

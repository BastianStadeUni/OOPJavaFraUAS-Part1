import java.util.Scanner;
import java.util.ArrayList;

public class rationalsequence2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Character> lr = new ArrayList<Character>();
		String[] splitPQ = new String[2];
		int pos, vleft, vright;
		for(int i = 0; i < n; i++) {
			int currCase = sc.nextInt();
			String pq = sc.next();
			splitPQ = new String[2];
			splitPQ = pq.split("/");
			vleft = Integer.valueOf(splitPQ[0]);
			vright = Integer.valueOf(splitPQ[1]);
			while(vleft != 1 || vright != 1) {
				if(vleft > vright) {
					vleft -= vright;
					lr.add('l');
				}
				else {
					vright -= vleft;
					lr.add('r');
				}
			}
			pos = 1;
			for(int j = lr.size() - 1; j >= 0; j--) {
				if(lr.get(j) == 'r') {
					pos *= 2;
				}
				else {
					pos = pos * 2 + 1;
				}
			}
			System.out.println((currCase) + " " + pos);
			lr.clear();
			
		}
		
		
	}

}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class goldbach2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> values = new ArrayList<Integer>();
		ArrayList<Integer> primes = new ArrayList<Integer>();
		ArrayList<String> reps = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			values.add(sc.nextInt());
		}
		for(int i = 2; i < Collections.max(values); i++) {
			if(isPrime(i)) {
				primes.add(i);
			}
		}
		int half = Collections.max(values) / 2 + 1;
		while(half < Collections.max(values)) {
			if(primes.contains(half)) {
				break;
			}
			half++;
		}
		for(int k = 0; k < values.size(); k++) {
			int count = 0;
			for(int i = 0; i < primes.indexOf(half); i++){
				for(int j = 0; j < primes.size(); j++) {
					if(primes.get(i) <= primes.get(j)) {
						if(primes.get(i) + primes.get(j) == values.get(k)) {
							reps.add(primes.get(i) + "+" + primes.get(j));
							count++;
						}
					}
				}
			}
			System.out.println(values.get(k) + " has " + (count) + " representation(s)");
			for(int i = 0; i < count; i++) {
				System.out.println(reps.get(i));
			}
			reps.clear();
			System.out.println();
			count = 0;
		}
		

	}
	public static boolean isPrime(int v) {
		for(int i = 2; i < v; i++) {
			if(v % i == 0) {
				return false;
			}
		}
		return true;
	}

}


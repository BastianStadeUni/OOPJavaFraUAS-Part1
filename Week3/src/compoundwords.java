import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class compoundwords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> samples = new ArrayList<String>();
		ArrayList<String> compounds = new ArrayList<String>();
		while(sc.hasNext()) {
			samples.add(sc.next());
		}
		for(int i = 0; i < samples.size(); i++) {
			for(int j = 0; j < samples.size(); j++) {
				if(i == j) { continue; }
				if(!compounds.contains(samples.get(i) + samples.get(j))) {
					compounds.add(samples.get(i) + samples.get(j));
				}
			}
		}
		Collections.sort(compounds);
		for(int i = 0; i < compounds.size(); i++) {
			System.out.println(compounds.get(i));
		}
	}
}

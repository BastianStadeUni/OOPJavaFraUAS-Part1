import java.util.*;
import java.io.*;


public class MixUpLetters2 {

	public static void main(String[] args) throws FileNotFoundException {
		File file1 = new File("C:\\Users\\Basti\\eclipse-workspace\\W4T5\\src\\text1.txt");
		File file2 = new File("C:\\Users\\Basti\\eclipse-workspace\\W4T5\\src\\text2.txt");
		Scanner sc1 = new Scanner(file1);
		Scanner sc2 = new Scanner(file2);
		ArrayList<Character> read1 = new ArrayList<Character>();
		ArrayList<Character> read2 = new ArrayList<Character>();
		boolean sametxt = true;
		String s1, s2;
		while(sc1.hasNext() || sc2.hasNext()) {
			if(!sc1.hasNext() || !sc2.hasNext()) { 
				sametxt = false;
				break;
			}
			s1 = sc1.next();
			s2 = sc2.next();
			char[] split1 = s1.toCharArray();
			char[] split2 = s2.toCharArray();
			if((split1[0] != split2[0]) || split1[split1.length - 1] != split2[split1.length - 1]) { 
				sametxt = false;
				break;
			}
			if(split1.length != split2.length) {
				sametxt = false;
				break;
			}
			for(char a : split1) {
				read1.add(a);
			}
			for(char b :split2) {
				read2.add(b);
			}
			Collections.sort(read1);
			Collections.sort(read2);
			for(int i = 0; i < read1.size(); i++) {
				if(read1.get(i) != read2.get(i)) {
					sametxt = false;
					break;
				}
			}
			read1.clear();
			read2.clear();
		}
		if(sametxt) { System.out.println("YES"); } //its from the same text
		else { System.out.println("NO"); } //its not from the same text
		sc1.close();
		sc2.close();
	}
}

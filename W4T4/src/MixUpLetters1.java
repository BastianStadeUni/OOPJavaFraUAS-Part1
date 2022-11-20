import java.util.*;
import java.io.*;

public class MixUpLetters1 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Basti\\eclipse-workspace\\W4T4\\src\\text.in.txt");
		FileWriter writer = new FileWriter("C:\\Users\\Basti\\eclipse-workspace\\W4T4\\src\\text.out.txt");
		Scanner sc = new Scanner(file);
		ArrayList<String> text = new ArrayList<String>();
		ArrayList<Character> word = new ArrayList<Character>();
		
		while(sc.hasNext()) {
			text.add(sc.next());
		}
		for(int i = 0; i < text.size(); i++) {
			String curr = text.get(i);
			char[] split = new char[text.get(i).length()];
			split = curr.toCharArray();
			for(int j = 1; j < split.length - 1; j++) {
				word.add(split[j]);
			}
			Collections.shuffle(word, new Random());
			for(int j = 1; j < split.length - 1; j++) {
				split[j] = word.get(j - 1);
			}
			curr = new String(split);
			writer.append(curr + " ");
			word.clear();
		}
		writer.close();

	}

}

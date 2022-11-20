import java.util.Scanner;
import java.util.ArrayList;

public class hittingtargets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> shapes = new ArrayList<String>();
        ArrayList<Integer> values = new ArrayList<Integer>();
        int n = sc.nextInt(); //number of shapes
        for(int i = 0; i < n; i++) {
            shapes.add(sc.next());
            if(shapes.get(i).equals("circle")) {
                for(int j = 0; j < 3; j++) {
                    values.add(sc.nextInt());
                }
            }
            else {
                for(int j = 0; j < 4; j++) {
                    values.add(sc.nextInt());
                }
            }
        }
        int m = sc.nextInt(); //Number of shots
        for(int i = 0; i <= m; i++) {
            int index = 0;    //count for value list
            int hits = 0;    //hits per shot
            int currX = sc.nextInt();
            int currY = sc.nextInt();
            for(int j = 0; j < shapes.size(); j++) {
                if(shapes.get(j).equals("circle")) {
                    int diffX = difference(values.get(index), currX);
                    int diffY = difference(values.get(index + 1), currY);
                    if(Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2)) <= values.get(index + 2)) {
                        hits++;
                    }
                    index += 3;
                }
                else if(shapes.get(j).equals("rectangle")) {
                    if((values.get(index) <=  currX && values.get(index+2) >= currX) &&
                            (values.get(index+1) <= currY && values.get(index+3) >= currY)) {
                        hits++;
                    }
                    index += 4;
                }
            }
            System.out.println(hits);
        }
        sc.close();
    }

    public static int difference(int value1, int value2) {
        if(value1 > value2) {
            return value1 - value2;
        }
        else if(value2 > value1) {
            return value2 - value1;
        }
        else {
            return 0;
        }
    }
}

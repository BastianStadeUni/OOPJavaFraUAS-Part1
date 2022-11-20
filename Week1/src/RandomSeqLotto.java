
public class RandomSeqLotto {
    public static void main(String[] args) {

        // a -> min	; b -> max
        int a = 1;
        int b = 49;
        int c = 6; // Total values
        int difference = b - a + 1;	//numbers from 5 - 10 would have a range of 6
        /* if i multiply the random numbers between 0 and 1 by the range
        	and add the min value to the random number then there will only
        	be numbers between the max and the min value */
        
        for (int i = 0; i < c; i++) {
            System.out.println((int)(Math.random() * difference + a));
        }
    }
}
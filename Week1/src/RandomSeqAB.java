
public class RandomSeqAB {
    public static void main(String[] args) {

        // command-line argument
        int n = Integer.parseInt(args[2]);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // generate and print n numbers between a and b
        // a -> min	; b -> max
        
        int difference = b - a + 1;	//numbers from 5 - 10 would have a range of 6
        /* if i multiply the random numbers between 0 and 1 by the range
        	and add the min value to the random number then there will only
        	be numbers between the max and the min value */
        
        for (int i = 0; i < n; i++) {
            System.out.println((int)(Math.random() * difference + a));
        }
    }
}
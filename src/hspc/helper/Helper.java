package hspc.helper;

import java.util.Random;

public class Helper {

	public static void generateArray(int lower, int upper, int length) {
		assert lower >= 0;
		assert upper > lower;
		assert length > 0;
		
		Random r = new Random();
		for(int i=0; i<length; i++) {
			System.out.print(r.nextInt(upper-lower) + " ");
		}
	}
	
	public static void main(String args[]) {
		generateArray(0, 10000, 1000);
	}
}

package hspc2019.p7;

import java.util.Scanner;

public class FeedingJackJack {

	public int computeMaxPiles(int[] piles) {		
		int ans = -1;
		//YOUR CODE HERE
		return ans;
		//YOUR CODE HERE
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numOfTestCases = sc.nextInt();
		sc.nextLine();

		for (int testCase=0; testCase < numOfTestCases; testCase++) { 
			int lenOfInput = sc.nextInt();
			int[] nums = new int[lenOfInput];
			for(int inputIdx=0; inputIdx<lenOfInput; inputIdx++) {
				nums[inputIdx] = sc.nextInt();
			}

			FeedingJackJack fjj = new FeedingJackJack();
			System.out.println( fjj.computeMaxPiles(nums) );
		}

		sc.close();
	}
}

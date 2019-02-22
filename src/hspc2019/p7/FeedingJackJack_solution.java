package hspc2019.p7;

import java.util.Scanner;

public class FeedingJackJack_solution {

	public int computeMaxPiles(int[] piles) {		
		int n = piles.length;
		// L[i] will hold the length of the longest allowed sequence terminating
		// at position i.  This satisfies the recurrence
		// L(i) = 1+max(L[j]), where the max is over all j<i with piles[j]<piles[i].
		int[] L = new int[n];
		L[0] = 1;
		for(int i=1; i<n; i++) {
			int maxSoFar = 0;
			for(int j=0; j<i; j++) {
				if(piles[j]<piles[i] && L[j]>maxSoFar)
					maxSoFar = L[j];
			}
			L[i] = maxSoFar+1;
		}
		
		// Now compute the largest entry in L
		int maxL = 0;
		for(int i=0; i<n; i++)
			if(L[i]>maxL)
				maxL = L[i];
		return maxL;
	}
	
	public static void main(String[] args) {
		FeedingJackJack_solution fjj = new FeedingJackJack_solution();
		int[] a = {3,6,6,2,5};
		int max = fjj.computeMaxPiles(a);
		System.out.println(max);
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int numOfTestCases = sc.nextInt();
//		sc.nextLine();
//
//		for (int testCase=0; testCase < numOfTestCases; testCase++) { 
//			int lenOfInput = sc.nextInt();
//			int[] nums = new int[lenOfInput];
//			for(int inputIdx=0; inputIdx<lenOfInput; inputIdx++) {
//				nums[inputIdx] = sc.nextInt();
//			}
//
//			FeedingJackJack_solution fjj = new FeedingJackJack_solution();
//			System.out.println( fjj.computeMaxPiles(nums) );
//		}
//
//		sc.close();
//	}
}

package hspc2019.p5;

import java.util.Scanner;

public class SupervillainIndex_solution {

	public int computeSupervillainIndex(int[] nums) {
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

			SupervillainIndex_solution si = new SupervillainIndex_solution();
			System.out.println( si.computeSupervillainIndex(nums) );
		}

		sc.close();
	}
}

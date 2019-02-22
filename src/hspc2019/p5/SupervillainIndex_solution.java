package hspc2019.p5;

import java.util.Scanner;

public class SupervillainIndex_solution {

	public int computeSupervillainIndex(int[] nums) {
		int ans = 0;

		int len = nums.length;
		int[] count = new int[len+1];
		int[] S = new int[len+1];
		
		// Supervillain Index can't be higher than number of inputs,
		// so cap every input that is greater than length with length
		for(int i=0; i<nums.length; i ++){
			if(nums[i] > len){
				nums[i] = len;   
			}
		}
		
		// O(N) accumulator for all counts
		for(int num : nums) {
			count[num]++;
		}
		
		// O(N) accumalator across count sizes, top to bottom
		S[len] = count[len];
		for(int i=len-1; i>=0; i --){
			S[i] = count[i] + S[i + 1];
		}
		for(int i=len; i>=0; i--){
			if(i <= S[i]){
				ans = i;
				break;
			}
		}

		return ans;
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

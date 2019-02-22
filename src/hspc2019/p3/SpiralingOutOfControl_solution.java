package hspc2019.p3;

import java.util.Scanner;

public class SpiralingOutOfControl_solution {

	public static int sumSpiralDiag(int n) {
		assert n > 0;
		assert n % 2 == 1;
		
		// For an n x n spiral, we have:
		// Top-right corner: n*n
		// Top-left corner: n*n - n + 1
		// Bottom-left corner: n*n - 2*n + 2
		// Bottom-right corner: n*n - 3*n + 3
		// So, total addition for that level is 4*n*n - 6*n + 6
		
		// 1x1 spiral is 1
		int sum=1;
		// Count to nxn on odd indices
		for(int idx=3; idx<=n; idx+=2) {
			sum += 4*idx*idx - 6*idx + 6;
		}
		return sum;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numOfTestCases = sc.nextInt();
		sc.nextLine();

		for (int testCase=0; testCase < numOfTestCases; testCase++) { 
			int n = sc.nextInt();
			System.out.println(sumSpiralDiag(n));
		}

		sc.close();
	}
}

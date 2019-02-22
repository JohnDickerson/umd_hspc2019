package hspc2019.p3;

import java.util.Scanner;

public class SpiralingOutOfControl {

	public static int sumSpiralDiag(int n) {
		int sum = 0;
		//YOUR CODE HERE
		return sum;
		//YOUR CODE HERE
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

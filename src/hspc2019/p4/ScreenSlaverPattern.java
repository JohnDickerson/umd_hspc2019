package hspc2019.p4;

import java.util.Scanner;

public class ScreenSlaverPattern {

	private static boolean findPattern(Scanner sc) {
		//YOUR CODE HERE
		return false;
		//YOUR CODE HERE
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numOfTestCases = sc.nextInt();
		sc.nextLine();

		for (int testCase=0; testCase < numOfTestCases; testCase++) { 
			System.out.println(
					"Frame " + testCase + 
					(findPattern(sc)?" has":" does not have") +
					" the pattern."
					);
		}

		sc.close();
	}


}


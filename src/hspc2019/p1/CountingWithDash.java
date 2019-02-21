package hspc2019.p1;

import java.util.Scanner;

public class CountingWithDash {

	private static String speakForDash(Scanner sc) {
		//YOUR CODE HERE
		return "";
		//YOUR CODE HERE
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numOfTestCases = sc.nextInt();
		sc.nextLine();

		for (int testCase=0; testCase < numOfTestCases; testCase++) { 
			System.out.println(
					"Dash says: " + speakForDash(sc)
					);
		}

		sc.close();
	}


}


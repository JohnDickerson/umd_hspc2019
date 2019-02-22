package hspc2019.p2;

import java.util.Scanner;

public class CountingWithJackJack {

	private static String speakForJackJack(Scanner sc) {
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
					"Jack-Jack says: " + speakForJackJack(sc)
					);
		}

		sc.close();
	}


}


package hspc2019.p1;

import java.util.Scanner;

public class CountingWithDash_solution {

	private static boolean isPrime(int num) {
		if (num == 2) return true;
		if (num%2 == 0) return false;
		for (int i=3; i<=Math.sqrt(num); i+=2) {
			if (num%i == 0) return false;
		}
		return true;
	}
	private static boolean isSquare(int num) {
		return (Math.pow((int)(Math.sqrt(num)),2) == num);
	}

	private static String speakForDash(Scanner sc) {
		//YOUR CODE HERE
		String answer = "";
		int start = sc.nextInt();
		int end = sc.nextInt();
		for (int i=start; i<=end; i++) {
			boolean prime = isPrime(i);
			boolean square = isSquare(i);
			if (prime) answer+="Prime";
			else if (square) answer+="Square";
			else answer+=i;
		}
		return answer;
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


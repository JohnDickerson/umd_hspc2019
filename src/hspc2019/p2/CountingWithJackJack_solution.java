package hspc2019.p2;

import java.util.Scanner;

public class CountingWithJackJack_solution {

	private static String speakForJackJack(Scanner sc) {
		//YOUR CODE HERE
		String answer = "";
		int start = sc.nextInt();
		int end = sc.nextInt();
		for (int i=start; i<=end; i++) {
			boolean divBy4 = (i%4)==0;
			boolean divBy5 = (i%5)==0;
			if (!divBy4 && !divBy5) answer+=i;
			else {
				if (divBy4) answer+="Fam";
				if (divBy5) answer+="Fro";
			}
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
					"JackJack says: " + speakForJackJack(sc)
					);
		}

		sc.close();
	}


}


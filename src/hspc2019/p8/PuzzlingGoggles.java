package hspc2019.p8;

import java.util.Scanner;

public class PuzzlingGoggles {

	public String determineOrdering(String[] codes) {
		//YOUR CODE HERE
		StringBuilder sb = new StringBuilder();
		
		
		return(sb.toString());
		//YOUR CODE HERE
	}
	
public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);

		int numOfTestCases = sc.nextInt();
		sc.nextLine();

		for (int testCase=0; testCase < numOfTestCases; testCase++) { 
			int lenOfInput = sc.nextInt(); sc.nextLine();
			
			String[] codes = new String[lenOfInput];
			for(int inputIdx=0; inputIdx<lenOfInput; inputIdx++) {
				codes[inputIdx] = sc.nextLine();
			}

			System.out.println(new PuzzlingGoggles().determineOrdering(codes));
		}

		sc.close();
	}
}

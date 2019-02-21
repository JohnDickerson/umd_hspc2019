package hspc2019.p4;

import java.util.Scanner;

public class ScreenSlaverPattern_solution {

	private static boolean findPattern(Scanner sc) {
		//YOUR CODE HERE
		int numOfSilverRectangles = sc.nextInt();
		int[] silverStartX = new int[numOfSilverRectangles];
		int[] silverStartY = new int[numOfSilverRectangles];
		int[] silverEndX = new int[numOfSilverRectangles];
		int[] silverEndY = new int[numOfSilverRectangles];
		for (int i=0; i<numOfSilverRectangles; i++) {
			silverStartX[i] = sc.nextInt();
			silverStartY[i] = sc.nextInt();
			silverEndX[i] = sc.nextInt();
			silverEndY[i] = sc.nextInt();
		}

		int numOfPinkRectangles = sc.nextInt();
		int[] pinkStartX = new int[numOfPinkRectangles];
		int[] pinkStartY = new int[numOfPinkRectangles];
		int[] pinkEndX = new int[numOfPinkRectangles];
		int[] pinkEndY = new int[numOfPinkRectangles];
		for (int i=0; i<numOfPinkRectangles; i++) {
			pinkStartX[i] = sc.nextInt();
			pinkStartY[i] = sc.nextInt();
			pinkEndX[i] = sc.nextInt();
			pinkEndY[i] = sc.nextInt();
		}

		for (int i=0; i<numOfSilverRectangles; i++) {
			for (int j=0; j<numOfPinkRectangles; j++) {
				if (  
						silverStartX[i]<pinkStartX[j] &&
						silverStartY[i]<pinkStartY[j] &&
						silverEndX[i]  >pinkEndX[j]   &&
						silverEndY[i]  >pinkEndY[j] 
						) {
					return true;
				} 
			}
		}

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


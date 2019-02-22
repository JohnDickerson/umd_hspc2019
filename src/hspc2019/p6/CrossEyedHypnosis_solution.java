package hspc2019.p6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CrossEyedHypnosis_solution {
	
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
			
			CrossEyedHypnosis_solution ceh = new CrossEyedHypnosis_solution();
			System.out.println( ceh.countStronglyReversingPairs(nums) );
		}

		sc.close();
	}
	
	class Pair{
        int i;
        int n;
        Pair(int i, int n){
            this.i = i;
            this.n = n;
        }
        int getN(){
            return n;
        }
        int getI(){
            return i;
        }
    }

    public int countStronglyReversingPairs(int[] nums) {
        List<Pair> list = new ArrayList<Pair>();
        Ftree ft = new Ftree(nums.length);
        for(int i = 0; i < nums.length; i ++){
            list.add(new Pair(i, nums[i]));
            ft.update(i, 1);
        }

        // Sort list in decreasing order, tiebreaking based on the lower index
        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(final Pair o1, final Pair o2) {
            	int diff = o2.n - o1.n;
                if(diff == 0) {
                	return o1.i - o2.i;
                } else {
                	return diff;
                }
            }
        });
        
        int[] indexMap = new int[nums.length];
        for(int i = 0, l = list.size(); i < l; i ++){
            indexMap[list.get(i).getI()] = i;
        }
        int ans = 0;
        for(int i = nums.length - 1; i >= 0; i --){
            ft.update(indexMap[i], -1);
            int index = binarySearch(list, (long)nums[i] * 2);
            if(index > -1){
                ans += ft.getRangeSum(index);
            }
        }
        return ans;
    }

    private int binarySearch(List<Pair> list, long n){
        int l = 0, h = list.size() - 1;
        int ans = -1;
        while(l <= h){
            int m = l + (h - l) / 2;
            if(list.get(m).n > n){
                ans = m;
                l = m + 1;
            } else{
                h = m - 1;
            }
        }
        return ans;
    }

    private class Ftree {
        private int[] a;

        Ftree(int n) {
            a = new int[n + 1];
        }

        void update(int p, int v) {
            for (int i = p + 1; i < a.length; i += (i & (-i))) {
                a[i] += v;
            }
        }

        int getRangeSum(int p) {
            int sum = 0;
            for (int i = p + 1; i > 0; i -= (i & (-i))) {
                sum += a[i];
            }
            return sum;
        }

    }
}

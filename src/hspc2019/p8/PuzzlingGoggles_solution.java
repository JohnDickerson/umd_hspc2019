package hspc2019.p8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

// Answer translated from similar LeetCode problem and https://github.com/gouthampradhan/leetcode/

public class PuzzlingGoggles_solution {

	private Map<Character, List<Character>> graph;
	private Set<Character> done;
	private Set<Character> visited;
	private Stack<Character> toposort;

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

			System.out.println(new PuzzlingGoggles_solution().determineOrdering(codes));
		}

		sc.close();
	}

	public String determineOrdering(String[] codes) {
		graph = new HashMap<Character, List<Character>>();
		done = new HashSet<Character>();
		visited = new HashSet<Character>();
		toposort = new Stack<Character>();
		
		boolean[] A = new boolean[26]; // guaranteed alphabet of 26 lowercase characters
		
		for(int i = 0; i < codes.length - 1; i ++) {
			for(int j = 0, l = Math.min(codes[i].length(), codes[i + 1].length()); j < l; j++) {
				if(codes[i].charAt(j) != codes[i + 1].charAt(j)){
					if(!graph.containsKey(codes[i].charAt(j))) {
						graph.put( codes[i].charAt(j), new ArrayList<Character>());
					}
					graph.get(codes[i].charAt(j)).add(codes[i + 1].charAt(j));
					break;
				}
			}
		}

		for(String w : codes) {
			for(int i = 0, l = w.length(); i < l; i++){
				A[w.charAt(i) - 'a'] = true;
			}
		}

		for(char c : graph.keySet()) {
			if(!done.contains(c)){
				if(!dfs(c)) return "";
			}
		}

		StringBuilder sb = new StringBuilder();
		while(!toposort.isEmpty()){
			sb.append(toposort.pop());
		}

		//Add remaining elements. This can come in any order.
		String result = sb.toString();
		StringBuilder remaining = new StringBuilder();
		for(int i = 0; i < 26; i ++){
			if(A[i]){
				char c = (char)(i + 'a');
				boolean found = false;
				for(char r : result.toCharArray()){
					if(r == c){
						found = true;
						break;
					}
				}
				if(!found){
					remaining.append(c);
				}
			}
		}
		return result.concat(remaining.toString().trim());
	}

	/**
	 * Dfs to toposort
	 * @param u
	 * @return
	 */
	private boolean dfs(char u){
		done.add(u);
		visited.add(u);
		List<Character> children = graph.get(u);
		if(children != null){
			for(char c : children){
				if(visited.contains(c)) return false; //check cycle
				if(!done.contains(c)){
					boolean status = dfs(c);
					if(!status) return false;
				}
			}
		}
		toposort.push(u);
		visited.remove(u);
		return true;
	}
}

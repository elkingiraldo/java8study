package co.learn.java8.elkin.online;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
	public static void NodesAtLevels(int nodesNumber, int[][] edges) {

		Map <Integer, Integer> levels = new HashMap<>();
		levels.put(0, 1);
		populateLevels(1, 1, levels, edges, nodesNumber);
		levels.forEach((key,value) -> System.out.println(value));
	}
	
	public static void populateLevels (int currentNode, int currentLevel, Map <Integer, Integer> levels, int[][] edges, int nodesNumber) {
		int totalChildren = 0;
		for (int i = 0; i < nodesNumber - 1; i++) {
			if (edges[i][0] - 1 == currentNode - 1) {
				totalChildren++;
				populateLevels(edges[i][1], currentLevel + 1, levels, edges, nodesNumber);
			}
		}
		if (totalChildren > 0) {
			levels.put(currentLevel, levels.containsKey(currentLevel) ? levels.get(currentLevel) + totalChildren : totalChildren);
		}
	}

	public static void main(String[] args) {

		// imput: 7 1 2 1 3 2 4 3 6 4 5 5 7
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] edges = new int[N - 1][2];

		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < 2; j++) {
//				int tmp = sc.nextInt();
				edges[i][j] = sc.nextInt();
//				System.out.println("i: " + i + ", j: " + j + ", tmp: " + tmp);
			}
		}

		NodesAtLevels(N, edges);

	}

}

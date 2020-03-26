package co.learn.java8.elkin.online;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.BiConsumer;

public class Main {

	public static void NodesAtLevels(int nodesNumber, int[][] edges) {
		Map<Integer, Integer> levelOfNode = new HashMap<Integer, Integer>();
		Map<Integer, Integer> nodesByLevel = new HashMap<Integer, Integer>();

		for (int i = 0; i < edges.length; i++) {
			if (levelOfNode.get(edges[i][0]) == null) {
				
				levelOfNode.put(edges[i][0], 0);
				levelOfNode.put(edges[i][1], 1);
				
				nodesByLevel.put(0, 1);
				nodesByLevel.put(1, 1);
				
			} else {
				int newLevel = levelOfNode.get(edges[i][0]) + 1;
				levelOfNode.put(edges[i][1], newLevel);
				
				nodesByLevel.put(newLevel, nodesByLevel.get(newLevel) == null ? 1 : nodesByLevel.get(newLevel) + 1);
			}
		}
		
		nodesByLevel.forEach((key,value) -> System.out.println(value));
	}

	public static void main(String[] args) {

		// imput: 7 1 2 1 3 2 4 3 6 4 5 5 7
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] edges = new int[N - 1][2];

		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < 2; j++) {
				int tmp = sc.nextInt();
				edges[i][j] = tmp;
//				System.out.println("i: " + i + ", j: " + j + ", tmp: " + tmp);
			}
		}

		NodesAtLevels(N, edges);

	}

	
//	public static void main(String[] args) {
//		Map<Integer, Integer> nodesByLevel = new HashMap<Integer, Integer>();
//		System.out.println(nodesByLevel.get(0));
//		nodesByLevel.put(0, 2);
//		System.out.println(nodesByLevel.get(0));
//		nodesByLevel.put(0, 1);
//		System.out.println(nodesByLevel.get(0));
//	}
	
}

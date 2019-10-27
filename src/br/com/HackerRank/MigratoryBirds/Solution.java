package br.com.HackerRank.MigratoryBirds;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.*;

public class Solution {
	
	// Complete the migratoryBirds function below.
	static int migratoryBirds(List<Integer> arr) {
		
		return arr.stream()
			.collect(groupingBy(x -> x, counting()))
			.entrySet()
			.stream()
			.max(Comparator.comparing(Map.Entry::getValue))
			.map(Map.Entry::getKey).get();
	}
	
	public static void main(String[] args) throws IOException {
		List<Integer> list = Arrays.asList(1, 4, 4, 4, 5, 3, 3, 3, 1, 1, 2, 2, 2);
		System.out.println(migratoryBirds(list));
	}
}

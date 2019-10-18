package br.com.HackerRank.SockMerchant;


import java.util.HashSet;
import java.util.Set;

public class Solution {
	
	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		if(n == 0 || n == 1) return 0;
		int pairs = 0;
		
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < n; i++){
			if (set.contains(ar[i])) {
				set.remove(ar[i]);
				pairs += 1;
			} else {
				set.add(ar[i]);
			}
		}
		
		return pairs;
	}
}

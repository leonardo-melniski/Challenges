package br.com.HackerRank.SockMerchant;

import org.junit.Test;

public class TestSolution {
	
	@Test
	public void testCornersCase(){
		
		int sol;
		sol = Solution.sockMerchant(0, null);
		assert sol == 0;
		
		int n = 1;
		int[] ar = new int[1];
		
		ar[0] = 1;
		sol = Solution.sockMerchant(n, ar);
		assert sol == 0;
		
	}
	@Test
	public void testSolutionLength1Solution0(){
		int[] ar = new int[]{2};
		int n = ar.length;
		
		int sol = Solution.sockMerchant(n, ar);
		assert sol == 0;
	}

	@Test
	public void testSolutionLength2Solution0(){
		int[] ar = new int[]{2, 1};
		int n = ar.length;
		
		int sol = Solution.sockMerchant(n, ar);
		assert sol == 0;
	}

	@Test
	public void testSolutionLength2Solution1(){
		int[] ar = new int[]{2, 2};
		int n = ar.length;
		
		int sol = Solution.sockMerchant(n, ar);
		assert sol == 1;
	}
	
	
	@Test
	public void testSolutionLengthBigSolution6(){
		int[] ar = new int[]{2, 5, 100, 5, 6, 2, 100, 1, 3, 2, 2, 1, 1, 1};
		int n = ar.length;
		
		int sol = Solution.sockMerchant(n, ar);
		assert sol == 6;
	}
}

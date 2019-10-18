package br.com.LeetCode.AddTwoNumbers;

import org.junit.Before;
import org.junit.Test;

public class TestSolution {
	Solution solution;
	
	@Before
	public void init(){
		// choose one approach
//		solution = new SolutionOO();
		solution = new SolutionProcedural();
	}
	
	@Test
	public void testSumWithoutCarry(){
		System.out.println("Test sum without carry, list same size, lists size = 1");
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(5);
		
		System.out.println(l1);
		System.out.println(l2);
		
		ListNode result = solution.addTwoNumbers(l1, l2);
		System.out.println(result);
		
		assert result.toString().equals("[6]");
		System.out.println("success");
	}
	
	@Test
	public void testSumMultiNodesWithoutCarry(){
		System.out.println("Test sum without carry, list same size, lists size > 1");
		
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		
		System.out.println(l1);
		System.out.println(l2);
		
		ListNode result = solution.addTwoNumbers(l1, l2);
		System.out.println(result);
		
		assert result.toString().equals("[6, 8]");
		System.out.println("success");
		
	}
	
	@Test
	public void testSumWithCarry(){
		System.out.println("Test sum with carry, list same size, lists size = 1");
		
		ListNode l1 = new ListNode(5);
		ListNode l2 = new ListNode(5);
		
		System.out.println(l1);
		System.out.println(l2);
		
		ListNode result = solution.addTwoNumbers(l1, l2);
		System.out.println(result);
		
		assert result.toString().equals("[0, 1]");
		System.out.println("success");
	}
	
	@Test
	public void testSumMultiNodesWithCarry(){
		System.out.println("Test sum with carry, list same size, lists size > 1");
		
		ListNode l1 = new ListNode(5);
		l1.next = new ListNode(1);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(2);
		
		System.out.println(l1);
		System.out.println(l2);
		
		ListNode result = solution.addTwoNumbers(l1, l2);
		System.out.println(result);
		
		assert result.toString().equals("[0, 4]");
		System.out.println("success");
	}
	
	@Test
	public void testSumMultiNodesWithCarry2(){
		System.out.println("Test sum with carry, list same size, lists size > 1");
		
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(1);
		l1.next.next = new ListNode(1);
		
		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		
		System.out.println(l1);
		System.out.println(l2);
		
		ListNode result = solution.addTwoNumbers(l1, l2);
		System.out.println(result);
		
		assert result.toString().equals("[0, 1, 1, 1]");
		System.out.println("success");
	}
	
	@Test
	public void testSumMultiNodesWithMultiCarry(){
		System.out.println("Test sum with multi carry, list same size, lists size > 1");
		
		ListNode l1 = new ListNode(5);
		l1.next = new ListNode(9);
		
		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(5);
		
		System.out.println(l1);
		System.out.println(l2);
		
		ListNode result = solution.addTwoNumbers(l1, l2);
		System.out.println(result);
		
		assert result.toString().equals("[4, 5, 1]");
		System.out.println("success");
	}
	
	@Test
	public void testSumDiffSize(){
		System.out.println("Test sum without carry, list different size, lists size : l1 = 1, l2 = 2)");
		
		ListNode l1 = new ListNode(5);
		ListNode l2 = new ListNode(3);
		l1.next = new ListNode(4);
		
		System.out.println(l1);
		System.out.println(l2);
		
		ListNode result = solution.addTwoNumbers(l1, l2);
		System.out.println(result);
		
		assert result.toString().equals("[8, 4]");
		System.out.println("success");
	}
	
	@Test
	public void testSumDiffSizeWithCarry(){
		System.out.println("Test sum with carry, list different size, lists size : l1 = 1, l2 = 2)");
		
		ListNode l1 = new ListNode(5);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(4);
		
		System.out.println(l1);
		System.out.println(l2);
		
		ListNode result = solution.addTwoNumbers(l1, l2);
		System.out.println(result);
		
		assert result.toString().equals("[0, 5]");
		System.out.println("success");
	}
	
	
	@Test
	public void testSumDiffSizeWithMultiCarry(){
		System.out.println("Test sum with carry, list different size, lists size : l1 = 1, l2 = 3)");
		
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		
		System.out.println(l1);
		System.out.println(l2);
		
		ListNode result = solution.addTwoNumbers(l1, l2);
		System.out.println(result);
		
		assert result.toString().equals("[1, 0, 0, 1]");
		System.out.println("success");
	}
	
	@Test
	public void testSumDiffSizeWithMultiCarry2(){
		System.out.println("Test sum with carry, list different size, lists size : l1 = 1, l2 = 3)");
		
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(1);
		
		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(4);
		l2.next.next = new ListNode(9);
		
		System.out.println(l1);
		System.out.println(l2);
		
		ListNode result = solution.addTwoNumbers(l1, l2);
		System.out.println(result);
		
		assert result.toString().equals("[0, 6, 9]");
		System.out.println("success");
	}
	
}

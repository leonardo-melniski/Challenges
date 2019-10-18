package br.com.LeetCode.AddTwoNumbers;

import java.util.Iterator;

public class ListNode implements Iterator {
	int val;
    public ListNode next;
   
    public ListNode(int x) {
    	val = x;
	    next = null;
    }
    
	@Override
	public String toString() {
    	ListNode no = this;
		StringBuilder stringBuilder = new StringBuilder("[");
		while(no.hasNext()){
			stringBuilder.append(no.val).append(", ");
			no = no.next;
		}
		return stringBuilder.append(no.val).append("]").toString();
	}
	
	@Override
	public boolean hasNext() {
		return next != null;
	}
	
	@Override
	public ListNode next() {
		return next;
	}

}

package com.cogent;
import java.util.ArrayDeque;
public class ArrayDQ {
	public static void main(String args[]) {
		ArrayDeque arrDQ = new ArrayDeque();
		for(int i = 0; i < 5; i++) {
			arrDQ.add(i);
		}
		System.out.println(arrDQ);
		System.out.println(arrDQ.peek());
		arrDQ.offer(7);
		arrDQ.offer(8);
		System.out.println(arrDQ);
		System.out.println(arrDQ.peek());
	}
}

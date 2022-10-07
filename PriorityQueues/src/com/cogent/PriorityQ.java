package com.cogent;
import java.util.PriorityQueue;

public class PriorityQ {
	public static void main(String args[]) {
		PriorityQueue pq = new PriorityQueue();
		for(int i = 0; i < 5; i++) {
			pq.add(i);
		}
		System.out.println(pq);
		System.out.println(pq.peek());
		pq.offer(8);
		pq.offer(7);
		System.out.println(pq);
	}
}

package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		// Queue
		// FIFO(선입선출)
		Queue<Integer> queue = new LinkedList<>();
		
		// 데이터 제공하기
		for (int i = 0; i< 5 ; i++) {
			queue.offer(i); // ENQUEUE
			System.out.println("QUEUE: " + queue);
			
		}
		
		
		// 가장 먼저 입력된 데이터 확인
		System.out.println("PEEK: " + queue.peek());
		System.out.println("QUEUE: " + queue );
		// poll 할때는 반드시 비어있는지 확인
		while (!queue.isEmpty()) {
			System.out.println("POLL: " + queue.poll());
			System.out.println("QUEUE: " + queue);
			
		}
		
	}

}

package com.wolken.wolkenapp.ByExtending;

public class Table2 implements Runnable {
	public void run() {
		System.out.println("Thread id"+Thread.currentThread().getId());
		System.out.println("Thread id"+Thread.currentThread().getName());
		
			int num=17;
			for (int i = 1; i < 11; i++) {
				System.out.println("Thread1");
				System.out.println(num+"*"+i+"="+(num*i));
				try {
					System.out.println("sleep2");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
			System.out.println("Ending of Thread");
			
		}

}

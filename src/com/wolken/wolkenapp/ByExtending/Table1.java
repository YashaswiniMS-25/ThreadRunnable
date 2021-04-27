package com.wolken.wolkenapp.ByExtending;

public class Table1 implements Runnable{
	

	@Override
	public void run() {
		System.out.println("Thread id"+Thread.currentThread().getId());
		System.out.println("Thread id"+Thread.currentThread().getName());
		
			int num=16;
			for (int i = 1; i < 11; i++) {
				System.out.println("Thread1");
				System.out.println(num+"*"+i+"="+(num*i));
				try {
					System.out.println("Calling sleep");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			System.out.println("Ending of Thread");
			
		}
		
	}



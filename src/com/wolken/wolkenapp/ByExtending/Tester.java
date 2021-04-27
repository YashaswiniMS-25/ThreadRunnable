package com.wolken.wolkenapp.ByExtending;

public class Tester {
	public static void main(String[] args) {
		Table1 table1=new Table1();
		Table2 table2=new Table2();
		
		Thread thread=new Thread(table1);
		Thread thread2=new Thread(table2);

		
		
		thread.start();
		thread2.start();
	}
		
		
	}



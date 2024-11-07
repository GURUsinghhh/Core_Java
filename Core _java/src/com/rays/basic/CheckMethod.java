package com.rays.basic;

public class CheckMethod {
	public  static void sum(int a ,int b) {
		int sum = a+b;
		System.out.println("Sum:="+sum);
	}
	public  static void sub(int c ,int d) {
		int sub = c-d;
		System.out.println("Sub:="+sub);
	}
	public static void multi(int a, int b) {
		double d = a * b;
		System.out.println("Multi:="+d);

	}
	public static int add(int a, int b) {
		return a + b;

	}
	public static void main(String[] args) {
		CheckMethod c = new CheckMethod();
		c.sum(100, 20);
		c.sub(5, 56);
		c.multi(10, 88);
		System.out.println("Add"+c.add(2,5));
		
		
	}


}

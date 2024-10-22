package com.rays.basic;

public class If {
	public static void main(String[] args) {

		int balance = 600000;
		int price = 700000;
		if (balance > price) {
			System.out.println("you can buy");
		} else {
			System.out.println("insuficient balance");
		}
	}
}
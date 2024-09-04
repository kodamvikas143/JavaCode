package com.code;

class casio{
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void add(double a, int b, int c) {
		System.out.println(a=a+b+c);
	}
	
}

public class MethodOverLoading {
	public static void main(String args[]) {
		casio cal = new casio();
		cal.add(23, 98);
		cal.add(12, 234, 65);
		cal.add(98.9, 23, 42);
	}
}

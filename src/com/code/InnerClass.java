package com.code;

import com.code.Outer.Inner;

class Outer{
	int a;
	public void show() {
		System.out.println("In SHow");
	}
	class Inner{
		public void display() {
			System.out.println("In DIsplay");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.show();
		
		Outer.Inner inner = outer.new Inner();
		inner.display();
	}
}

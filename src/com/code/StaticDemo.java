package com.code;

class Emp{
	int empid;
	int salary;
	static String ceo;
	public void show() {
		
		System.out.println(empid);
		System.out.println(salary);
		System.out.println(ceo);
	}
	
	public Emp() {
		salary =2000;
		empid=23;
		System.out.println("In COnstructor");
		
	}
	
	static {
		ceo="narayan murthy";
		System.out.println("In static Block");
	}
	
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp vikas = new Emp();
		Emp sai = new Emp();
		
		vikas.show();
		sai.show();
	}

}

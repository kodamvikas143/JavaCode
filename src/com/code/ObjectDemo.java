package com.code;


class Calc{
	
	int num1;
	int num2;
	int result;
	
	public  int addition(int num1, int num2){
		result=num1+num2;
		
		return result;
	}
	
}



public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc cal = new Calc();
		int res=cal.addition(10, 12);
		System.out.println(res);
	}

}

package com.code;

public class sampleCode {

	public static void main(String[] args) {
		
	}
}
//		// TODO Auto-generated method stub
//int num =61, count = 0;
//		
//		if(num>1) {
//			
//			for(int i=1;i<=num;i++) {
//				
//				if(num%i==0) {
//					count++;
//				}
//			}
//			if(count>2) {
//				System.out.println("not a prime number");
//			}else {
//				System.out.println("It is a prime number");
//			}
//		}else {
//			System.out.println("Enter values greater than zero");
//		}
//
//	}
//
//}
//
//package PracticePrograms;
//
//public class CountingNumbers {
//
//	public static void main(String[] args) {
//		
//		//Finding numbers of digits in a number
//		int num = 2435;
////		int count = 0;
////		while(num>0) {
////			num = num/10;
////		    count++;
////		}
////		System.out.println("Number of digits in a number "+count);
//		
//		//Counting even and odd numbers in a number
////		int evencount= 0;
////		int oddcount = 0;
////		while(num>0) {
////			
////			int rem = num%10;
////			
////			if(rem%2==0) {
////				evencount++;
////			}else {
////				oddcount++;
////			}
////			num = num/10;
////			
////		}
////		System.out.println("no of even digits "+evencount );
////		System.out.println("no of odd digits "+oddcount);
//		
//		//sum of digits in a number;
//		int sum = 0;
//		while(num>0) {
//			int rem = num%10;
//			sum = sum+rem;
//			num = num/10;
//		}
//		
//		System.out.println("sum of digit= "+sum);
//
//	}
//
//}
//
//package PracticePrograms;
//
//public class FactorialOfANumber {
//
//	public static void main(String[] args) {
//		
//		int num =5;
//		long factorial = 1;
//		
//		for(int i=num;i>=1;i--) {
//			
//			factorial=factorial*i;
//			
//			
//		}
//		System.out.println("Factorial of "+num+"= "+factorial);
//
//	}
//
//}
//package PracticePrograms;
//
//public class CheckGivenNumIsPrime {
//
//	public static void main(String[] args) {
//		
//		int num =61, count = 0;
//		
//		if(num>1) {
//			
//			for(int i=1;i<=num;i++) {
//				
//				if(num%i==0) {
//					count++;
//				}
//			}
//			if(count>2) {
//				System.out.println("not a prime number");
//			}else {
//				System.out.println("It is a prime number");
//			}
//		}else {
//			System.out.println("Enter values greater than zero");
//		}
//
//	}
//
//}
//
//package PracticePrograms;
//
//public class FibbonaciSeries {
//
//	public static void main(String[] args) {
//		
//		int sum =0, n1=0,n2=1;
//		System.out.print(n1+" "+n2);
//		for(int i=2;i<10;i++) {
//			sum = n1+n2;
//			n1=n2;
//			n2=sum;
//			System.out.print(" "+sum);
//		}
//		
//	}
//
//}
//
//package PracticePrograms;
//
//import java.util.Random;
//
//import org.apache.commons.lang3.RandomStringUtils;
//
//public class GeneratingRandomNumbersAndStrings {
//
//	public static void main(String[] args) {
//	
//		//approach1
//		Random rand = new Random();
//		int num = rand.nextInt(10);//print random values from 1 t0 9
//		System.out.println(num);
//		
//		double decimal = rand.nextDouble();//print double values from 0.0 to 0.1
//		System.out.println(decimal);
//		
//		//approach2
//		double num1 = Math.random();
//		System.out.println(num1);
//
//		//approach3: Apache common language api jar files(add jar file to project)
//		String randNum = RandomStringUtils.randomNumeric(10);
//		System.out.println(randNum);
//		
//		String randstr = RandomStringUtils.randomAlphabetic(10);
//		System.out.println(randstr);
//		
//	}
//
//}
//
//package PracticePrograms;
//
//import java.util.Scanner;
//
//public class LargestOfThreenumbers {
//
//	public static void main(String[] args) {
//		
//		int a,b,c = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		System.err.println("enter a= ");
//		a=sc.nextInt();
//		
//		System.err.println("enter a= ");
//		b=sc.nextInt();
//		
//		System.err.println("enter a= ");
//		c=sc.nextInt();
//		
//		//method1:
////		if(a>b&&a>c) {
////			System.out.println(a+" is the highest number");
////			
////		}else if(b>a&&b>c){
////			System.out.println(b+" is the highest number");
////		}
////		else if(c>a&&c>b){
////			System.out.println(c+" is the highest number");
////		}
//		//method2: using terenary operator
//		int largest1 = a>b?a:b;
//		int largest2 = c>largest1?c:largest1;
//		System.out.println(largest2+"is the largest number");
//	}
//
//}
//
//package PracticePrograms;
//
//import java.util.Scanner;
//
//public class Palindromes {
//
//	public static void main(String[] args) {
//		
//		//Checks weather the given number is palindrome or not
//		Scanner sc = new Scanner(System.in);
////		System.out.println("Enter the number: ");
////		int num = sc.nextInt();
////		int originalNumvalue = num;
////		int rev = 0;
////		while(num!=0) {
////			rev = rev*10+num%10;
////			num = num/10;
////		}
////		System.out.println("Reverse number: "+rev);
////
////		if(rev==originalNumvalue) {
////			System.out.println("It is a palindrome number");
////		}
////		else {
////			System.out.println("not a palindrome number");
////		}
//		
//		//checks weather the string is palindrom or not
//		System.out.println("Enter string variable: ");
//		String str = sc.next();
//		String originalStr = str;
//		String revstr = "";
//		int length = str.length();
//		
//		for(int i=length-1; i>=0; i--) {
//			revstr = revstr+str.charAt(i);
//		}
//		System.out.println("Reversed String= "+revstr);
//		System.out.println("Original string: "+originalStr);
//		if(originalStr.equals(revstr)) {
//			System.out.println("It is a palindrome string");
//		}
//		else {
//			System.out.println("not a palindrom string");
//		}
//
//	}
//
//}
//
//package PracticePrograms;
//
//import java.util.Scanner;
//
//public class ReverseANumber {
//	
//	public static void main(String[] args) {
//		
//		//Three different ways to reverse a number
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number: ");
//		int num = sc.nextInt();
//		
//		//Method1:
////		int rev = 0;
////		while(num!=0) {
////			rev = rev*10+num%10; //will give you last digit
////			num = num/10; //eliminate last digit and give you remaining number
////		}
////		System.out.println("Reversed number: "+ rev);
//		
//		//Method2: String buffer class method
////		StringBuffer rev;
////		StringBuffer sb = new StringBuffer(String.valueOf(num)); //string.value will convert integer into string
////		rev = sb.reverse();
////		System.out.println("Reversed number: "+ rev);
//		
//		//method3: string builder method
//		StringBuilder rev;
//		StringBuilder sb = new StringBuilder(String.valueOf(num)); //string.value will convert integer into string
//		rev = sb.reverse();
//		System.out.println("Reversed number: "+ rev);
//		
//	}
//
//}
//
//package PracticePrograms;
//
//public class ReverseAString {
//
//	public static void main(String[] args) {
//		
//		//3 methods to reverse a string
//		
//		String word = "lakshmi";
//		String rev = "";
//		int length = word.length();
//		
//		//method1:
////		for(int i=length-1; i>=0; i--) {
////			rev = rev+word.charAt(i);
////		}
////		System.out.println("Reverse string= "+rev);
//		
//		//method2: Using character array
//		//charater array will split the string into multiple characters
////		char a[] = word.toCharArray();
////		for(int i=length-1; i>=0; i--) {
////			rev = rev+a[i];
////		}
////		System.out.println("Reverse string= "+rev);	
//		
//		//method3: Using string buffer class
//		StringBuffer Rev;
//		StringBuffer sb = new StringBuffer(word);
//		Rev = sb.reverse();
//		System.out.println("Reverse string= "+Rev);	
//
//	}
//
//}
//
//package ArrayPrograms;
//
//import java.util.Arrays;
//
//public class CheckTwoAarraysAreEqualOrNot {
//
//	public static void main(String[] args) {
//
//		int a[] = { 3, 9, 5 };
//		int b[] = { 3, 9, 0 };
//
//		int aLength = a.length;
//		int bLength = b.length;
//		boolean status = true;
//		
//        //method1
////		if (aLength == bLength) {
////
////			for (int i = 0; i < aLength; i++) {
////
////				if (a[i] != b[i]) {
////
////					status = false;
////
////				}
////			}
////
////		} else
////			status = false;
////
////		if (status == false)
////			System.out.println("Arrays are not equal");
////		else
////			System.out.println("Arrays are equal");
////
////		System.out.println(status);
//		
//		//method2
//		
//		status = Arrays.equals(a, b);
//		if (status == false)
//			System.out.println("Arrays are not equal");
//		else
//			System.out.println("Arrays are equal");
//
//	}
//
//}
//
//public class FindingDuplicateElementsInArray {
//
//	public static void main(String[] args) {
//
//		String str[] = { "c", "c", "j", "ava" };
//		int length = str.length;
//		String duplicate;
//		boolean flag = false;
//
//		//method1
////		for (int i = 0; i < length; i++) {
////			for (int j = i+1; j < length; j++) {
////				if (str[i].equals(str[j])) {
////					System.out.println("duplicate element found: " + str[i]);
////					flag = true;
////				}
////
////			}
////		}
////		if (flag == false) {
////			System.out.println("Duplicate element not found");
////		}
//
//package ArrayPrograms;
//
//public class FindingMissingNumberInAnarray {
//
//	public static void main(String[] args) {
//		
//		//prerequisites
//		//array should not contain any duplicate values
//		//array no need to be sorted order
//		//values should be in range
//		
//		int a[]= {1,2,4,5};
//		int sum=0, sum1=0, num=0;
//		for (int value : a) {
//			
//			sum = sum+value;
//			
//		}
//		System.out.println(sum);
//		for(int i=1; i<=5; i++) {
//			
//			sum1= sum1+i;
//			System.out.println(sum1);
//		}
//		
//		num = sum1-sum;
//		System.out.println("missed number= "+num);
//	}
//
//}
//
//package ArrayPrograms;
//
//public class MinAndMaxNumberInAnArray {
//
//	public static void main(String[] args) {
//		
//		int a[]= {8,9,40,3};
//		int max,min;
//		max=a[0];
//		min=a[0];
//		
//		for (int value : a) {
//			if(value>max)
//				max=value;
//		}
//		System.out.println("max value in an array "+max);
//		for (int value : a) {
//			if(value<min)
//				min=value;
//		}
//		System.out.println("max value in an array "+min);
//
//	}
//
//}
//
//package ArrayPrograms;
//
//import java.util.ArrayList;
//
//public class PrintEvenAndoddNumbersInArray {
//
//	public static void main(String[] args) {
//
//		ArrayList even = new ArrayList();
//		ArrayList odd = new ArrayList();
//		int a[] = { 2, 4, 5, 6, 7,10,78 };
//		int length = a.length;
//
//		for (int i = 0; i <= length - 1; i++) {
//
//			if (a[i] % 2 == 0) {
//				even.add(a[i]);
//			} else
//				odd.add(a[i]);
//
//		}
//		System.out.println("even numbers"+even);
//		System.out.println("odd numbers"+odd);
//
//	}
//
//}
//
//package ArrayPrograms;
//
//import java.util.Iterator;
//
//public class SumOfElementsInArray {
//
//	public static void main(String[] args) {
//		
//		//method1
//		int a[] = { 2,3,4,5};
//		int sum =0;
//		
////		int length = a.length;
////		System.out.println(length);
////		
////		for(int i=0;i<=length-1;i++) {
////			
////			sum = sum+a[i];
////		}
////		System.out.println("sum of elements in an array: "+sum);
//		
//		//method2
//	    for (int value : a) {
//			
//	    	sum = sum+value;
//		}
//	    System.out.println(sum);
//			
//
//	}
//
//}
//

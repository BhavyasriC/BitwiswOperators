package com.sep06;

public class Program {

	public static void main(String[] args) {
		int num =5;
		// left side 2 elements will be removed. we need to add those in right side
		int num1=-5;
		System.out.println("left shift : "+(num<<2));
		// 0000 0110 : 0001 1000 =20
		// right shift we need to remove last 2 digits starting place if 0 is there we have to keep 2'0'
		System.out.println("right shift : "+(num>>2));
		// unsigned right shift
		// 
		System.out.println("unsigned right shift : "+(num>>>2));
		System.out.println("negative shifting : ");
		System.out.println("left shift : "+(num1<<2));
		System.out.println("right shift : "+(num1>>2));
		System.out.println("unsigned : "+(num1>>>2));

	}

}

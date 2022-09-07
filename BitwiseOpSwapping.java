package com.sep06;

public class BitwiseOpSwapping {

	public static void main(String[] args) {
    int a =10,b=8;
    a = a ^b;
    b = a^b;
    a = a^b;
    System.out.println(a);
    System.out.println(b);
	}

}

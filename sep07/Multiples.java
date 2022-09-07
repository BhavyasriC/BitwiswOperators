package com.sep07;

import java.math.BigInteger;
import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
	    BigInteger num = BigInteger.valueOf(sc.nextInt());
		System.out.println("enter position : ");
		BigInteger n=num;
		int position = sc.nextInt();
		for( int i =1;i<position;i++) {
			num = num.add(n.add(num));
		}
		System.out.println(num);
	     sc.close();
	}

}

package com.sep07;

import java.math.BigInteger;

public class Chess {

	public static void main(String[] args) {
	     BigInteger num = BigInteger.valueOf(1);
		 BigInteger n =num;
		for(int i=1;i<64;i++) {
			num=num.add(num);
			n =n.add(num);
					}
		System.out.println(n);

	}

}

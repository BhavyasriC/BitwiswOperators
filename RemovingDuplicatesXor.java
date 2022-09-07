package com.sep06;

import java.util.Arrays;

public class RemovingDuplicatesXor {

	public static void main(String[] args) {
		int [] arr = new int[]{1,2,2,3,3,4,4};
	//	int [] arr1 = arr;
	//	System.out.println(Arrays.toString(arr));
		int temp=0;
		for(int i =0;i<arr.length;i++) {
			temp^=arr[i];
		}
          System.out.println(temp);
	}

}

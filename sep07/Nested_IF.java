package com.sep07;

import java.util.Scanner;

public class Nested_IF {
	static String grade(int marks) {
		if(marks<100&& marks>=35) {
			if(marks>90)
				return "Grade S";
			else if(marks>80)
				return "Grade A++";
			else if(marks>70)
				return "Grade A";

			else if(marks>60)
				return "Grade B";
			else
				return "Grade C";
		}
		else {
			return "Fail";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks");
		int marks = sc.nextInt();
		System.out.println(grade(marks));
      sc.close();
	}

}

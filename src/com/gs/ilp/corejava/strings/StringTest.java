package com.gs.ilp.corejava.strings;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		// way 1
		String name = "mohit";

		// way 2
		String lname = new String("Malhotra");

		// String s1 = "test"; // s1 = 1020, : heap and pool
		// String s2 = "test"; // s2 =1020
		// if (s1 == s2) {
		// System.out.println("They are same");
		// } else {
		// System.out.println("They are not same");
		// }

		String s1 = new String("test"); // heap s1 = 1090 char[] ={t,e,s,t}
		String s2 = new String("test"); // heap s2 = 1080
		if (s1.equals(s2)) {
			System.out.println("They are same");
		} else {
			System.out.println("They are not same");
		}

		if (s1.length() == s2.length()) {
			int k = 0;
			boolean flag = true;
			while (k < s1.length()) {
				if (s1.charAt(k) != s2.charAt(k)) {
					flag = false;
					break;
				}
				k++;
			}
			if (flag) {
				System.out.println("Theya are same from my fun");
			}
		}
		// 0 1 2 3
		// charAt(2) , char[] ={t,e,s,t}
		char c = s1.charAt(3);
		System.out.println(c);

		// indexOf('s')
		int index = s1.indexOf("es");
		System.out.println("index of t is " + index);

		// replace
		s1 = s1.replace('t', 'v'); // 2390--> vesv
		// s1-> test (1020)
		System.out.println("after replace " + s1);

		// esv : vesv
		s1 = s1.substring(1, 4); // esv (3030)
		System.out.println("after substring is " + s1);

		String fname = "Mohit";
		System.out.println(fname.concat(lname));

		//
		if (fname.startsWith("mo")) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}

		fname = fname.toUpperCase(); // Mohit : MOHIT
		System.out.println("after upp " + fname);

		fname = "  Mo hit  ";
		fname = fname.trim(); //
		System.out.println("after trim" + fname);

		String s3 = "Mohit";
		String s4 = "MOHIT";
		if (s3.equalsIgnoreCase(s4)) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

		String str = "mohit,khushboo,jaydeep,shohom";
		String[] arr = str.split(",");
		Arrays.stream(arr).forEach(System.out::println);

	}

}

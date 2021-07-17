package com.interviewpreparationkit.hackerrank;

import java.util.Scanner;

public class RepeatedString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong(); // number till sequence is to calculated
		String str = scan.next(); // input string
		
		long result = repeatedString(str,n);
		System.out.println(result);
	}

	private static long repeatedString(String s, long n) {
		long num = n/s.length();
        long rem = n%s.length();
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a') {
                ans += num;
                if (i < rem)
                    ans++;
            }
        }
    return ans;
	}

}

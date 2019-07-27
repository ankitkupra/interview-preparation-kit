package com.interviewpreparationkit.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ankitkumar
 */

public class SockMerchant {

	public static int sockMerchantValidPair(int n, int[] ar) {
		Arrays.parallelSort(ar);
		int counter = 0;
		for (int i = 0; i < ar.length - 1;) {
			if (ar[i] == ar[i + 1]) {
				counter++;
				i += 2;
			} else {
				i++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < n; i++) {
			ar[i] = scan.nextInt();
		}

		int result = sockMerchantValidPair(n, ar);
		System.out.println(result);
	}

}

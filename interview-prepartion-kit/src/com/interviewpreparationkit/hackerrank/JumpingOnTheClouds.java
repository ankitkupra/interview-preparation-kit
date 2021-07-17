package com.interviewpreparationkit.hackerrank;

import java.util.*;

/*
 * @author ankitkumar
 * */

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rounds = scan.nextInt();
		int ar[] = new int[rounds];
		for (int i = 0; i < rounds; i++) {
			ar[i] = scan.nextInt();
		}

		int count = 0;
		int i = 0;
		while (i != rounds - 1) {
			if (i != ar.length - 2 && ar[i + 2] == 0)
				i += 2;
			else
				i++;
			count++;
		}
		System.out.println(count);
	}
}

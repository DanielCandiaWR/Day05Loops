package com.day05loops.app;
import java.util.Scanner;
/*
* HackerRank 30 Days of Code
* ========== Day 05 Loops ===========
* Given an integer, n, prints its first 10 multiples. Each multiple n x i (where 1<=i<=10) should be printed on a new line
* in the form: n x i = result.
*/
public class Loops {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		final int MAX_MULTIPLIER = 10;
		int multiplicand = 0;
		System.out.print("Input your number: ");
		multiplicand = scanner.nextInt();
		for(int i=1;i<=MAX_MULTIPLIER;i++) {
			System.out.format("%d x %d = %d\n",multiplicand,i,multiplicand*i);
		}
	}
}

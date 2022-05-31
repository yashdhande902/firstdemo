package com.ProgramsArray;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter a no..");
			a[i] = sc.nextInt();

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}

	}

}

package com.ProgramsArray;

public class Sorting {

	public static void main(String[] args) {

		int a[] = { 11, 5, -7, 22, 100, 55, 66 };
System.out.println("input= { 11, 5, -7, 22, 100, 55, 66 }");
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {//a[i] < a[j]=for decending order
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}

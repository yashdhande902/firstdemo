package com.ProgramsArray;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student Studlist[] = new Student[3];

		for (int i = 0; i < Studlist.length; i++) {
			System.out.println(" id, name, per");
			int id = sc.nextInt();
			String name = sc.next();
			float per = sc.nextFloat();

			Student s1 = new Student(id, name, per);
			Studlist[i] = s1;

		}
		System.out.println("=====================================");
		for (int i = 0; i < Studlist.length; i++) {
			System.out.println(Studlist[i]);
		}
	}
}

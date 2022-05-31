package com.ProgramsArray;

public class ArrayComparison {

	public static void main(String[] args) {
		int id[] = { 121, 123, 222 };
		String name[] = { "yash", "manish", "rohit" };
		float per[] = { 83.4f, 45.4f, 77.9f };

		Student Studlist[] = new Student[3];
		for (int i = 0; i < Studlist.length; i++) {
			Studlist[i] = new Student(id[i], name[i], per[i]);
		}
//***********this cod for sorting by percentage of student************
//		for (int i = 0; i < Studlist.length; i++) {
//			for (int j = i + 1; j < Studlist.length; j++) {
//				if (Studlist[i].per > Studlist[j].per) {// a[i] < a[j]=sorting for decending order
//														// by percentage
//					Student t = Studlist[i];
//					Studlist[i] = Studlist[j];
//					Studlist[j] = t;
//				}
//			}
//		}
		System.out.println("==========sort basis on percentage===========");
		for (int i = 0; i < Studlist.length; i++) {
			 
			if (Studlist[i].per > 75) {//when sorting this will comment out
			
			System.out.println(Studlist[i]);
}

		}
	}
}

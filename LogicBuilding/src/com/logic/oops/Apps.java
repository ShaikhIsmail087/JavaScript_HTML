package com.logic.oops;

import java.util.Scanner;

public class Apps {

	public static void main(String[] args) {

		while (true) {

			System.out.println("*********welcome to School Management System (SMS)**********\n");
			System.out.println("choose below option to fill out the details...." + "\n a:-Students Details"
					+ "\n b:-Teachers Details" + "\n c:-School Details");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your option:");
			String options = sc.next();

			switch (options) {
			case "a":
				System.out.println("Enter Student details:");

				Student s = new Student();
				System.out.println("Enter Student Id:");
				s.setId(sc.nextInt());
				System.out.println("Enter Student Name:");
				s.setName(sc.next());
				sc.nextLine();
				System.out.println("Enter Student Address:");
				s.setAddress(sc.nextLine());
				System.out.println("Enter Student Div:");
				s.setDivision(sc.next());
				sc.nextLine();
				System.out.println("Enter Student Standard:");
				s.setStandard(sc.nextLine());
				System.out.println("Enter Student Fees:");
				s.setFees(sc.nextDouble());
				System.out.println("Enter Student is present:");
				s.setPresent(sc.nextBoolean());
				System.out.println("Enter Student is fees payed:");
				s.setFeesPayed(sc.nextBoolean());

				System.out.println("*******************************************");
				System.out.println("Student Details:-");
				System.out.println(s);
				break;

			case "b":
				System.out.println("Enter Teachers details:");

				Teachers t = new Teachers();
				System.out.println("Enter Teacher Id:");
				t.setId(sc.nextInt());
				System.out.println("Enter Teacher Name:");
				t.setName(sc.next());
				sc.nextLine();
				System.out.println("Enter Teacher Address:");
				t.setAddress(sc.nextLine());
				System.out.println("Enter subjects teaches by teacher:");
				t.setSubjectTeaching(sc.next());
				System.out.println("Enter divisions teacher teach:");
				t.setTeachToDivisions(sc.next());

				System.out.println("*******************************************");
				System.out.println("Teacher Details:-");
				System.out.println(t);
				break;

			case "c":
				System.out.println("Enter School details:");

				School s1 = new School();
				System.out.println("Enter School Name:");
				s1.setName(sc.next());
				sc.nextLine();
				System.out.println("Enter School divisions:");
				s1.setDivison(sc.next());
				System.out.println("Enter School Subjects:");
				sc.nextLine();
				s1.setSubjects(new String[] { sc.next() });
				System.out.println("Enter School Timings:");
				sc.nextLine();
				s1.setSchoolTiming(sc.next());
				System.out.println("Enter School Total Classes:");
				sc.nextLine();
				s1.setTotalClass(sc.nextInt());
				System.out.println("Enter School Medium:");
				s1.setMedium(sc.next());
				System.out.println("Enter School Total Students:");
				s1.setTotalStudents(sc.nextInt());
				System.out.println("Enter School Total Floor:");
				s1.setTotalFloor(sc.nextInt());

				System.out.println("*******************************************");
				System.out.println("School Details:-");
				System.out.println(s1+"\n"+s1.getDetails()+"\n"+s1.getInfo());
				break;

			case "x":
				System.out.println("Exiting School Management System. Goodbye!");
				System.exit(0);

			default:
				System.out.println("Invalid option please choose valid options!!!");

			}
		}

		/*
		 * Student s1=new Student(101, "Ismail", "mumbai", 'C', "8th", 1600,
		 * true, true); System.out.println("Students personal details:-");
		 * System.out.println("Student 1 details:"+s1); Teachers t1=new
		 * Teachers(6312, "Tarique", "banglore", "Science,Social-Science", new
		 * char[]{'A','C','F'});
		 * System.out.println("Teacher personal details:-");
		 * System.out.println("Teacher 1 details:"+t1);
		 * System.out.println("School details:-"); School s=new
		 * School("Kalsekar", 'G', new
		 * String[]{"Subject Teaches:","English","Hindi","Marathi","Urdu","Math"
		 * ,"Sceince","Social-Sci","History"},
		 * "Morning:(7:30AM to 12:30PM) AfterNoon:(1:30PM to 6:30PM)", 45,
		 * "English, Semi English, Urdu", 450, 4, 1600, s1, t1);
		 * System.out.println(s.toString());
		 */
	}

}
package org.collage;

public class Collage {
	public void colleageName() {
		System.out.println("Collage Name : Auxullium ");
	}

	public void collageCode() {
		System.out.println("Collage Code : 001");
	}

	public void collageRank() {
		System.out.println("Collage Rank : 1");
	}

	public static void main(String[] args) {
		Collage c = new Collage();
		c.colleageName();
		c.collageCode();
		c.collageRank();
		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		Hostel h = new Hostel();
		h.hostelName();
		Dept d = new Dept();
		d.depName();
	}
}

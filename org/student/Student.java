package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName()
	{
		System.out.println("Name of the student: Preethi R");
	}
	
	public void studentDept()
	{
		System.out.println("Student Dept: CS");
	}
	
	public void studentId()
	{
		System.out.println("Student ID: 513");
	}
	
	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		
		obj.deptName();
		
		obj.studentName();
		obj.studentId();
		obj.studentDept();
	}
}

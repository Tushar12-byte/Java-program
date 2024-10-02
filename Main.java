package com.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		//arrayList
		ArrayList<Student> a1=new ArrayList<Student>();
		
		//add
		a1.add(new Student(101,"Tejash",21));
		a1.add(new Student(102,"Rohit",28));
		a1.add(new Student(103,"Mohit",19));
		a1.add(new Student(104,"Ram",25));
		a1.add(new Student(105,"Raj",20));
		
		//sorting
		Collections.sort(a1);
		
		//for
		for(Student obj : a1) {
			System.out.println(obj.rollno+" "+obj.name+" "+obj.age); 
		}
	}

}

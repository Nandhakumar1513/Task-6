package com.guvi;

public class Person {
	private String name;
	private int age;


	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;


	}



	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	public static void main(String[] args) {
		Person person = new Person("John Doe", 30);

		System.out.println("Name: " + person.getName());

		System.out.println("Age: " + person.getAge());

	}

}

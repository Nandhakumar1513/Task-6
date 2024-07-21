package com.guvi;

public class circle {
	private double radius;
	
	//No argument constrcutor
	public circle() {
		this.radius = 1.0;
			
	}
	
	//Two argument constrcutor
	public circle(double radius) {
		this.radius = radius;
	}
	
	//Method to calculate circumference
	public double calculatecircumference() {
		return 2 * 3.14 * radius;
	}
	
	//Getter method for radius
	public double getRadius() {
		return radius;
	}

	//Setter method for radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {
		 // Create a Circle object with default radius
        circle circle1 = new circle();
        System.out.println("Circle 1: Radius = " + circle1.getRadius() + ", Circumference = " + circle1.calculatecircumference());

        // Create a Circle object with specified radius
        circle circle2 = new circle(5.0);
        System.out.println("Circle 2: Radius = " + circle2.getRadius() + ", Circumference = " + circle2.calculatecircumference());

	}

	

}

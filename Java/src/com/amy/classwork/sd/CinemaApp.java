package com.amy.classwork.sd;/*
* CinemaApp3.java
* @author Enda
* 21/10/2024
*/
import javax.swing.JOptionPane;

public class CinemaApp{
	public static void main (String args[]){
		// Declare variables
		int age;
		double cost;

		// Declare and create objects
		Cinema myC = new Cinema();

		// Input
		age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age"));

		// Process
		myC.setAge(age);
		myC.compute();

		// Output
		cost = myC.getCost();

		JOptionPane.showMessageDialog(null, "For age: " + age + ", the cost is: E" + cost);

	} // main
} // class
package com.LITS.JAVA.HomeWork.Task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkWithList {
	/*
	 * Написати програму для роботи з списком. У першій половині списку замінити
	 * всі входження деякого елементу Е1 на будь-який інший елемент Е2;
	 */

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		stringList = Arrays
				.asList("asd", "qw", "qw", "qw", "qwe", "zxca", "qw");

		String s1 = "qw";
		String s2 = "LITS";

		System.out.println("This is correct list " + "\n" + stringList);
		for (int i = 0; i <= (stringList.size() / 2); i++) {
			if (stringList.get(i) == s1)
				stringList.set(i, s2);
		}
		System.out.println("This is list after replacement '" + s1
				+ "' in to '" + s2 + "'" + "\n" + stringList);
		/*
		 * List<String> list = Arrays.asList( "one", "two", "three", "four",
		 * "two", "six", "five"); System.out.println("This is correct array " +
		 * "\n" + list);
		 * 
		 * Collections.replaceAll(list, "two", "one");
		 * System.out.println("This is array after replace " + "\n" + list);
		 */
		
		/*Fibonacci number*/
		
		System.out.println("Fibonacci number");
		int numberOfElements = 50;
		int a = 1;
		int b = 1;
		int sumF;
		for (int i = 0; i <= numberOfElements; i++) {
			if (i == 0)
				System.out.print("0, ");
			else if (i == 1 || i == 2)
				System.out.print("1, ");
			else {
				sumF = a + b;
				a = b;
				b = sumF;
				System.out.print(sumF + ", ");
			}
			
		}
		System.out.println("");
	}
}

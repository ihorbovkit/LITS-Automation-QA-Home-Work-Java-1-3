package com.LITS.JAVA.HomeWork.Task_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;


public class WorkWithArrays {

/*Задано масив цілих чисел. Вивести масив в оберненому порядку, а потім видалити з нього повторні входження кожного 
 елемента.*/

	public static void main(String[] args) {
		Integer[] array = {1, 14, 3, 13, 3, 12, 2, 3, 1};
		
		/*using collections */
		
		Collections.reverse(Arrays.asList(array));
		
		System.out.println("This is reversed list: " + Arrays.asList(array));
		LinkedHashSet<Integer> listWithOutDuplicates = new LinkedHashSet<Integer>(Arrays.asList(array));
		System.out.println("This is list without duplicates: " + listWithOutDuplicates);	
		
		
	}

}

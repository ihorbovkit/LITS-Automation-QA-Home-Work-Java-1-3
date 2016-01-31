package com.LITS.JAVA.HomeWork.Task_3;

public class Task_3 {

	public static void main(String[] args) {

/*Ќайменший елемент масиву зам≥нити ц≥лою частиною середнього арифметичного вс≥х елемент≥в. якщо в масив≥ Ї дек≥лька 
  найменших елемент≥в, то зам≥нити останн≥й з них.*/
		
		int [] array = {1, 14, 3, 13, 3, 12, 2, 3, 1};
		int min = array[0], sum = 0,  positionOfMin = 0;
		for (int i = 0; i<array.length; i++){
			sum += array[i];
			if (min>=array[i]){
				min = array[i];
				positionOfMin = i;
			}
		}
		array[positionOfMin] = sum/array.length;
		System.out.println("Min element in array is: " + min + " on position " + (positionOfMin+1));
		System.out.print("This is final list: ");
		for (int i = 0; i < array.length; i++){
			System.out.print(array[i] + ", ");
		}
		
	}

}

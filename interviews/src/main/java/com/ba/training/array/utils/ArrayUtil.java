package com.ba.training.array.utils;

public class ArrayUtil {

	public static int[] reverseArray(int[] array) {

		int[] reverseArray = new int[array.length];
		int lastIndex = array.length - 1;
		int counter = 0;

		for (int i = lastIndex; i >= 0; i--) {

			reverseArray[counter] = array[i];
			counter++;

		}

		return reverseArray;
	}

}

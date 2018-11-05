package com.ba.training.array.utils;

import java.util.Arrays;

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

	public static int[] removeDuplicates(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = arr[len - 1];
					len--;
					j--;
				}
			}
		}
		int[] newArr = Arrays.copyOf(arr, len);
		return newArr;
	}
}

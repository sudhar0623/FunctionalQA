package com.ba.training.array.utils;

import java.util.HashSet;
import java.util.Set;

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

	public static Integer[] removeDuplicates(int[] arr) {
		{
			Set<Integer> set = new HashSet<Integer>();
			for (int i = 0; i < arr.length; i++) {
				set.add(arr[i]);
			}
			Integer[] newArr = new Integer[set.size()];
			return set.toArray(newArr);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 4, 5, 2, 1 };
		Integer[] newArray = removeDuplicates(arr);
		for (int i = 0; i <= newArray.length - 1; i++) {
			System.out.print(newArray[i] + " ");
		}
	}
}

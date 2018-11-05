package com.ba.training.array.utils.tests;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.ba.training.array.utils.ArrayUtil;

public class ArrayUtilTests {

	@Test
	public void arrayUtilPositiveTest() {
		int[] inputArray = { 6, 4, 3, 2, 1 };
		int[] outputArray = ArrayUtil.reverseArray(inputArray);

		System.out.println("The reversed array is : " + Arrays.toString(outputArray));

	}

	@Test
	public void duplicateRemovalPositiveTest() {
		int[] inputArray = { 1, 2, 3, 3, 4, 5, 2, 1 };
		int[] outputArray = ArrayUtil.removeDuplicates(inputArray);
		System.out.print("The New array without duplicates is : " + Arrays.toString(outputArray));
	}

}

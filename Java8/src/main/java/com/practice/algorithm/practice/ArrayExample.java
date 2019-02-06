package com.practice.algorithm.practice;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class ArrayExample {

	static void PrintDuplicateArray(int[] inp) {
		for (int i = 0; i < inp.length; i++) {
			for (int j = i + 1; j < inp.length; j++) {
				if (inp[i] == inp[j]) {
					System.out.println("Duplicate is " + inp[i]);
				}
			}
		}
	}

	static int findSecondLargestElement(int[] inp) {
		int firstLar = inp[0];
		int secondLar = inp[1];
		for (int i = 2; i < inp.length; i++) {
			if (inp[i] > firstLar) {
				secondLar = firstLar;
				firstLar = inp[i];
			} else {
				if (inp[i] < firstLar && inp[i] > secondLar) {
					secondLar = inp[i];
				}
			}

		}
		return secondLar;

	}

	static int largestLessNowitjoutGivenDigit(int number, int giveno) {
		char given = Integer.toString(giveno).charAt(0);
		for (int i = number; i > 0; i--) {
			if (Integer.toString(i).indexOf(given) == -1) {
				return i;
			}
		}
		return 0;
	}

	static void commonElementsinArray(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length - 1; i++) {
			int j = i;
			if (IntStream.of(arr2).anyMatch(x -> x == arr1[j])) {
				System.out.println("Duplicate is " + arr1[j]);
			}
		}

	}

	static void pairOfElements(int[] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == val) {
					System.out.println("Combination are  (" + arr[i] + "," + arr[j] + ")");
				}
			}
		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 3, 5, 5, 6, 7, 8, 9, 10 };
		// PrintDuplicateArray(arr);

		int[] arr1 = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		// System.out.println(findSecondLargestElement(arr1));

		// System.out.println(largestLessNowitjoutGivenDigit(1244,4));

		// commonElementsinArray(arr,arr1);

		int[] inp = { 4, 5, 7, 11, 9, 13, 8, 12 };
		pairOfElements(inp, 20);

		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1 == i2);
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4);
	}

}

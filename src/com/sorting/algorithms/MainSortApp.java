package com.sorting.algorithms;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author kumari Main Application class
 *
 */
public class MainSortApp implements SortConstants {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Please enter the number of items in the list =>");
			int length = sc.nextInt();
			int[] inputs = new int[length];
			
			// loop over number list to save user input
			System.out.println("Please enter the numbers.");
			for (int i = 0; i < length; i++) {
				inputs[i] = sc.nextInt();
			}
			StringBuilder string = null;

			SortNumbers sortNumbers = new SimpleSortNumbers();
			int[] outputs = sortNumbers.simpleSort(inputs, ASC);

			System.out.println("sorting the number list in ascending order");
			System.out.println("******************************************");
			string = new StringBuilder();
			string.append("[");
			for (int i = 0; i < outputs.length; i++) {
				string.append(outputs[i]);
				if (i < outputs.length - 1)
					string.append(",");
			}
			string.append("]");
			System.out.println(string);

			outputs = sortNumbers.simpleSort(inputs, DSC);
			System.out.println("\nsorting the number list in descending order");
			System.out.println("*******************************************");
			string = new StringBuilder();
			string.append("[");
			for (int i = 0; i < outputs.length; i++) {
				string.append(outputs[i]);
				if (i < outputs.length - 1)
					string.append(",");
			}
			string.append("]");
			System.out.println(string);

			System.out.println("\nprinting number of times each number appears in ascending order");
			System.out.println("***************************************************************");
			sortNumbers.printSortedFrequency(inputs);

			System.out.println("\nprinting total number of unique numbers");
			System.out.println("***************************************");
			int uniqueNumberCount = sortNumbers.numberOfUniqueValues(inputs);
			System.out.println("Number of unique numbers = " + uniqueNumberCount);
		} catch (InputMismatchException ex) {
			System.out.println("Please enter a integer number");
		} finally {
			sc.close();
		}
	}
}

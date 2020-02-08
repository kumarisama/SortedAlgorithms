package com.sorting.algorithms;

/**
 * 
 * @author kumari 
 * @version 1.0.0 
 *
 * This interface defines three methods to sort and group numbers in a list
 */
public interface SortNumbers {	
	
	/**
	  * This method takes a list of numbers and sort it according to ascending 
	  * or descending order.
	  * @param inputs - list of numbers
	  * @param order - 0 for Ascending order; 1 for Descending order 
	  */
	public int[] simpleSort(int[] inputs, int order);
		
	
	/**
	  * This method takes a list of numbers and prints them according to ascending 
	  * order to standard out along with the number of times that integer 
	  * appears in the list.
	  * @param inputs - list of numbers
	  */
	public void printSortedFrequency(int[] inputs);
	
	
	/**
	 * This method takes a list of numbers and returns the number of times
	 * a unique value appears in the list.
	 */
	public int numberOfUniqueValues(int[] inputs);

}

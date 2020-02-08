package com.sorting.algorithms;

/**
 * 
 * @author kumari 
 * @version 1.0.0 
 *
 * This class implements SortNumbers and SortConstants
 */
public class SimpleSortNumbers implements SortNumbers, SortConstants {
	
	/**
	  * This method takes a list of numbers and sort it according 
	  * to ascending or descending order and returns the sorted numbers
	  * @param inputs - list of numbers
	  * @param order - 0 for Ascending order; 1 for Descending order
	  * @returns int[] - sorted numbers 
	  */
	public int[] simpleSort(int[] inputs, int order) {	
		boolean swap = false;
		int temp = 0;
		if (order != ASC && order != DSC) order = ASC;
		for (int i=0; i < inputs.length; i++) {			
			for (int j=i+1; j < inputs.length; j++) {
				swap = false;
				if ((inputs[i] > inputs[j]) && (order == ASC)) {
					swap = true;
				}
				
				if ((inputs[i] < inputs[j]) && (order == DSC)) {
					swap = true;
				}
				
				if (swap) {
					temp = inputs[i];
					inputs[i] = inputs[j];
					inputs[j] = temp;
				}
			}
		}
		return inputs;
	}
		
	@Override
	/**
	  * This method takes a list of numbers and sort it according 
	  * to ascending or descending order and prints the numbers with
	  * the frequency that sorted numbers appeared in the original list
	  * This method also prints the sorted numbers to stdout.
	  * @param inputs - list of numbers
	  * @param order - 0 for Ascending order; 1 for Descending order
	  * @This also sets the number of unique numbers in the list 
	  */
	public void printSortedFrequency(int[] inputs) {
		int[][] outputs = new int[inputs.length][2];
		int pos = 0;
		StringBuilder string = null;
				
		inputs = simpleSort(inputs, ASC);
		
		outputs[0][0] = inputs[0];
		outputs[0][1] = 1;
				
		for (int i=1; i < inputs.length; i++) {
			if (outputs[pos][0] == inputs[i]) {
				outputs[pos][1]++;
			} else {
				pos++;
				outputs[pos][0] = inputs[i];
				outputs[pos][1]++;
			}			
		}
		
		for (int i = 0; i < pos+1 ; i++) {
			string = new StringBuilder();
			string.append(outputs[i][0]);
			string.append(" appears ");
			string.append(outputs[i][1]);
			string.append(" time");
			if (outputs[i][1] > 1) {
				string.append("s");
			}
			System.out.println(string);
		}
	}

	@Override
	/**
	  * This method takes a list of numbers and returns number of unique values
	  * @param inputs - list of numbers
	  * @returns number of unique numbers in the list 
	  */
	public int numberOfUniqueValues(int[] inputs) {
		int uniqueNumbers = 0;
		inputs = simpleSort(inputs, ASC);
						
		for (int i = 0; i < inputs.length-1; i++) {
			if (inputs[i] != inputs[i+1]) {
				uniqueNumbers++;
			} 		
		}		
		return uniqueNumbers+1;
	}	

}

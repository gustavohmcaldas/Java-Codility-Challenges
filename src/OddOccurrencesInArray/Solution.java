package OddOccurrencesInArray;

import java.io.IOException;

class OddOccurrencesInArray {

	public static int solution(int[] A) {

		int result = A[0];
		for (int i = 1; i < A.length; i++) {
			result ^= A[i];
		}
		return result;
	}
}

public class Solution {
	public static void main(String[] args) throws IOException {

		int[] array = { 9, 3, 9, 3, 9, 7, 9 };
		int result = OddOccurrencesInArray.solution(array);
		
		System.out.print("Array: [");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
		System.out.println(" ]");
		System.out.println("Number " + result + " is unpaired.");

	}
}

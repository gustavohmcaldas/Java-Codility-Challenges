package binaryGap;

import java.io.IOException;
import java.util.Random;

class BinaryGap {

	public static int solution(int N) {

		String binaryNumber = Integer.toBinaryString(N);
		int longestGap =0;
		
		if (isPowerOfTwo(N) || isPowerOfTwo(N + 1)) {
			return 0;
		} else if (isPowerOfTwo(N-1)) {
			return binaryNumber.length() -2;
		} else {
			int zeroCounter = 0;
			
			for(int i=0;i<binaryNumber.length();i++) {
				char bit = binaryNumber.charAt(i);
				
				if(bit == '0') {
					zeroCounter++;
				} else {
					if(longestGap < zeroCounter) {
						longestGap = zeroCounter;
					}
					zeroCounter = 0;
				}
			}
		}
		
		return longestGap;
	}
	
	static boolean isPowerOfTwo(int num) {
	    return (num != 0) && ((num & (num - 1)) == 0);
	}
}

public class Solution {
	public static void main(String[] args) throws IOException {

		Random rand = new Random();
		int k = rand.nextInt(2147483647) + 1;
		int result = BinaryGap.solution(k);
		
		System.out.println("Random number: " + k);
		System.out.println("Binary number: " + Integer.toBinaryString(k));
		System.out.println("The longest binary gap is: " + result);
	}
}

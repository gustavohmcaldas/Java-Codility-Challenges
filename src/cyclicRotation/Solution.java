package cyclicRotation;

import java.io.IOException;
import java.util.Random;

class CyclicRotation {

    	public static int[] solution(int[] A, int K) {
            
    		if(A.length == 0)
    			return A;
    		
        	int[] result = new int[A.length];
        	int modulus = K % A.length;
        	
        	for(int i=0; i< A.length; i++){
        		int dif = i + modulus - A.length;
        		if(dif < 0) {
        			result[i + modulus] = A[i];
        		} else {
        			result[dif] = A[i];
        		}
        	}
        	
        	return result;
        }
    }

    public class Solution {
    	public static void main(String[] args) throws IOException {
    		
    		Random rand = new Random();
    		
    		int k = rand.nextInt(100);
    		int[] array = {1,2,3,4,5,6};

    		int[] result = CyclicRotation.solution(array, k);
    		System.out.println("K = " + k);
    		System.out.print("Array: [");
    		for (int i = 0; i < array.length; i++) {       
            	System.out.print(" " + array[i]);
            } 
    		System.out.println(" ]");

    		System.out.print("After rotation: [");
    		for (int i = 0; i < result.length; i++) {       
            	System.out.print(" " + result[i]);
            } 
    		System.out.print(" ]");
    	}
    }

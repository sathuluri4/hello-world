package com.java.sample;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySplit {

	//Split Array in to two arrays where sum of two array values are equal. 
	//count number of indexs to get arrays of equal sums
	public static int solution() {
		int[] A = {0,4,-1,0,3};
		int[] B = {0,-2,5,0,3};
        // write your code in Java SE 8
		int count = 0;
        if(A.length==0){
            return count;
        }
    	int leftSum = 0;
    	int rightSum = 0;
         for(int i=0;i<A.length; i++){
         	if(leftSum == rightSum){
         		 int[] B1 = Arrays.copyOfRange(B, 0, i);
                 int[] B2 = Arrays.copyOfRange(B, i, B.length);
                 int totalB1 = IntStream.of(B1).sum();
                 int totalB2 = IntStream.of(B2).sum();
                 if(leftSum== totalB1 && totalB1==totalB2){
                 	count = count + 1;
                 }
         	}
         	leftSum +=A[i];
         	rightSum = IntStream.of(Arrays.copyOfRange(A, i+1, A.length)).sum();
         }
         System.out.println("count--->"+count);
        return count;
    }

}

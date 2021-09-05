package com.java.sample;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TipicoTest {

	//Split Array in to two arrays where sum of two array values are equal. 
	//count number of indexs to get arrays of equal sums
	public static int solution(int a) {
		int[] A = {2,-2,-3,3};
		int[] B = {0,0,4,-4};
        // write your code in Java SE 8
		int count = 0;
        if(A.length==0){
            return count;
        }
        int total = 0;
        for(int j=0;j<A.length; j++){
        	total = total+A[j];
        }
        if(total==0){
        	return 1;
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
         
		/*a = 4;
         String value ="red";
         switch(value){
         case "red":
        	 System.out.println("fail");
         case "greeen":
        	 System.out.println("ok");
         }*/
        return count;
    }
	
	
//Cards Game
	    public static int solution(String A, String B) {
	        // write your code in Java SE 8
	        char[] arrayA = A.toCharArray();
	        char[] arrayB = B.toCharArray();
	        int alecWins = 0;
	        int bobWins = 0;
	        for(int i=0;i<arrayA.length;i++){
	            char valA = arrayA[i];
	            char valB = arrayB[i];
	            int valueOfA = 0;
	            int valueOfB = 0;
	            if(Character.isDigit(valA) && Character.isDigit(valB)){
	                valueOfA = Character.getNumericValue(valA);
	                valueOfB = Character.getNumericValue(valB);
	                if(valueOfA > valueOfB){
	                    alecWins = alecWins+1;
	                }else{
	                    bobWins=bobWins+1;
	                }
	            }
	            if(Character.isDigit(valA) && !Character.isDigit(valB)){
	                bobWins = bobWins+1;
	            }
	            if(!Character.isDigit(valA) && Character.isDigit(valB)){
	                alecWins = alecWins+1;
	            }
	            if(!Character.isDigit(valA) && !Character.isDigit(valB)){
	                if(valA != valB){
	                    if(valA=='A'){
	                        alecWins = alecWins+1;
	                    }else if(valB=='A'){
	                        bobWins = bobWins+1;
	                    }else{
	                    	 int tempValA = 0;
	 	                    int tempValB = 0;
	 	                     if(valA== 'K'){
	 	                        tempValA = 4;
	 	                    }else if(valA== 'Q'){
	 	                        tempValA = 3;
	 	                    }else if(valA== 'J'){
	 	                        tempValA = 2;
	 	                    }else if(valA== 'T'){
	 	                        tempValA = 1;
	 	                    }
	 	                     if(valB== 'K'){
	 	                        tempValB = 4;
	 	                    }else if(valB== 'Q'){
	 	                        tempValB = 3;
	 	                    }else if(valB== 'J'){
	 	                        tempValB = 2;   
	 	                    }else if(valB== 'T'){
	 	                        tempValB = 1;
	 	                    }
	 	                    if(tempValA > tempValB){
	 	                        alecWins = alecWins+1;
	 	                    }else{
	 	                        bobWins = bobWins+1;
	 	                    }
	                    }
	                   
	                }
	            }

	        }
	        System.out.println("alecWins--->"+alecWins);
	        return alecWins;
	    }

	
	public static void main(String args[]){
		TipicoTest.solution(2);
		TipicoTest.solution("23A84Q","K2Q25J");
	}

}

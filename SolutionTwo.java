package com.java.sample;
/***
 * 
 * @author Z2311071
 * 
 * Returns the smallest number with the same number of digits.
 *
 */

public class SolutionTwo {
	
	
	public long solution(long N) {
		// write your code in Java SE 8
		long retunrVal =0;
		if(N==1){
			return retunrVal;
		}else{
			String str = String.valueOf(N);
			int length = str.length();
			String numberStr = "1";
			for(int i=0;i<length-1;i++){
				numberStr=numberStr+"0";
			}
			retunrVal = Long.parseLong(numberStr);
		}
		return retunrVal;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionTwo sol = new SolutionTwo();
		System.out.println(sol.solution(1234));
	}

}

package com.java.sample;

import java.util.stream.IntStream;
/***
 * 
 * @author Z2311071
 * 
 * Given two integers, returns no. integers from from given range, 
 * which can be expressed as product two consecutive integers
 * 6=2*3, 12=3*4 and 20=4*5
 *
 */
public class SolutionOne {
	
	private int count = 0;
	public int findNumber(int start, int end) {
		if(start > end)
			return count;
		IntStream
				.rangeClosed(start, end)
				.parallel()
				.filter(test -> test % 2 == 0)
				.forEach(x -> {
					int sqrt = (int)Math.sqrt(x);
						if(sqrt * (sqrt + 1) == x){
							count = count + 1;
							//System.out.println("" + x + "-->" + sqrt+ "*" + (sqrt + 1));
						}
						});

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionOne s = new SolutionOne();
		System.out.println("number----->" + s.findNumber(10, 1000000000));

	}

}

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		
		int r = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		
		//3. Now make r random. 
		//   Create an object of the Random class
		//	 use .nextInt() to get a random number
		Random ra = new Random();
		r = ra.nextInt();

		//4. Limit the random number between 0 and 100
		Random ran = new Random();
		a = ran.nextInt(101);
		//5. Limit the random number between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value
		Random rand = new Random();
		b=rand.nextInt(51)+25;
		//6. Challenge: Limit the random number between -222 and 88
		Random randy = new Random();
		c=rand.nextInt(311)-222;
		//1. Print out the value of r
		System.out.println(r);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}
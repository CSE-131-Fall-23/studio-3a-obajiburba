package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			System.out.println("Up to what number do you want to find prime numbers?");
			int n = in.nextInt();
			
			//makes array that goes up to (and includes) n, with indexes in the array matching the number that index contains (i.e. index 2 has value 2)
			int[] sieve = new int[n+1];
			for(int i = 2; i < n +1; i++)
			{
				sieve[i] = i;
			}
			
			//sets initial hop size to 2 so that array gets rid of even numbers first
			int hopSize = 2;
			
			//repeats the process of eliminating multiples of hopSize until the end of the array
			while(hopSize < n)
			{
				for(int i = 2 * hopSize; i<n+1; i += hopSize)
				{
					//sets the non-prime numbers equal to zero (to be ignored later)
					sieve[i] = 0;
					
				}
				//sets the next hopSize to the next prime number (ie. hop size goes from 2 to 3 to 5 to 7, etc)
				while(hopSize + 1 < n && (sieve[hopSize + 1] ==0))
				{
					hopSize++;
				}
				hopSize++;
			}
			
			
			
			
			//prints out everything in array that doesn't equal 0
			for(int value: sieve)
			{
				if(value != 0)
						{
							System.out.println(value);
						}
			}
	}

}

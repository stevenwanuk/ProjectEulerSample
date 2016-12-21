package com.sven.euler.sample;

public class Problem4
{

    /*
     * <P>https://projecteuler.net/problem=4</P> Largest palindrome product Problem 4 A
     * palindromic number reads the same both ways. The largest palindrome made from the
     * product of two 2-digit numbers is 9009 = 91 × 99.
     * 
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */
    public static void main(String[] args) 
    {
    
        
        int max = 999;
        for (int i = max; i > 100; i--) 
        {

            boolean isFound = false;
            int palindrome = i * 1000 + i/100 + i%10 * 100 + i%100 - i%10;
            for (int j = 100; j < 999; j++) 
            {
                if (palindrome % j ==0 && palindrome / j >= 100 && palindrome / j <=999) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                System.out.println(i);
                break;
            }
        }
    }
}

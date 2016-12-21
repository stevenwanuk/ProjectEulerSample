package com.sven.euler.sample;

public class Problem9
{

    public static void main(String[] args)
    {
        /*
         * https://projecteuler.net/problem=9
         * Special Pythagorean triplet
Problem 9
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
         */
        
        
        int sum = 1000;
        
        for (int a = 1; a <= sum; a++) 
        {
            
            boolean isFound = false;
            for (int b = a+1; b<= sum / 2; b++) 
            {
            
                int c = sum - a - b;
                if (a * a + b * b == c *c) 
                {
                
                    isFound = true;
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(a * b * c);
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        
        
    }
}

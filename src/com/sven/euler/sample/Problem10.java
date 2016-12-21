package com.sven.euler.sample;

import java.util.ArrayList;
import java.util.List;

public class Problem10
{

    public static void main(String[] args) 
    {
    
/*
 * https://projecteuler.net/problem=10
 * Summation of primes
Problem 10
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */
        
        List<Integer> list = new ArrayList<>();
        int max = 10;
        long sum = 0;
        for (int i = 2; i <= max; i++) 
        {
            boolean isPrime = true;
            for (int j = 0; j < list.size(); j++) 
            {
            
                if (i % list.get(j) == 0) {
                
                    isPrime = false;
                    break;
                };
                
            }
            if (isPrime) {
                System.out.println(i);
                list.add(i);
                sum += i;
            }
        }
        System.out.println(sum);
        
        
    }
}

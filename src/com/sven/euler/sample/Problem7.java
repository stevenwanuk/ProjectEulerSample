package com.sven.euler.sample;

import java.util.ArrayList;
import java.util.List;

public class Problem7
{

    public static void main(String[] args) 
    {
        /*
         * https://projecteuler.net/problem=7
         * 10001st prime
Problem 7
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
         */
        
        
        List<Integer> list = new ArrayList<>();
        int i = 1;
        while(list.size() < 10001) 
        {
            
            i++;
            
            boolean isPrime = true;
            for(int j = 0; j < list.size(); j++) 
            {
            
                if (i % list.get(j) == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
                list.add(i);
            }
        }
        System.out.println(list.get(10000));
        
    }
}

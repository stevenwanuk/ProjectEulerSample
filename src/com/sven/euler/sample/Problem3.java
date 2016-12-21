package com.sven.euler.sample;

import java.util.ArrayList;
import java.util.List;

public class Problem3
{

    /*
     * <p>https://projecteuler.net/problem=3</p> Largest prime factor Problem 3 The prime
     * factors of 13195 are 5, 7, 13 and 29.
     * 
     * What is the largest prime factor of the number 600851475143 ?
     */
    
    public static void main(String[] args) 
    {
    
        long num = 600851475143l;
        List<Long> list = new ArrayList<>();
        while(true) 
        {
        
            boolean isFound = false;
            for(long i = 2; i < num; i++) 
            {
            
                if (num % i == 0) 
                {
                
                    num = num / i;
                    list.add(i);
                    System.out.println(i + "  " + num);
                    isFound = true;
                    break;
                }
                
            }
            if (!isFound) 
            {
            
                list.add(num);
                System.out.println(num);
                break;
            }
        }
        
    }
    
    public static void main1(String[] args)
    {

        long num = 600851475143l;
        for (long i = num; i > 2; i--)
        {
            System.out.println(i);

            if (num % i > 0)
            {
                continue;
            }

            boolean isPrimeNumber = true;
            for (long j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isPrimeNumber = false;
                    break;
                }

            }

            if (isPrimeNumber)
            {

                System.out.println("found:" + i);
                break;
            }
        }

    }

}

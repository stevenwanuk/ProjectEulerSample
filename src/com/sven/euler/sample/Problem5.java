package com.sven.euler.sample;

import java.util.ArrayList;
import java.util.List;

public class Problem5
{

    /*
     * <P>https://projecteuler.net/problem=5</P>
     * Smallest multiple
Problem 5
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */
    
    public static void main(String[] args) 
    {
    
        int maxnum = 20;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < maxnum; i++) 
        {
            
            int temp = i;
            for(int j = 0; j < list.size(); j++) 
            {
            
                
                if (temp % list.get(j) == 0) {
                    temp = temp / list.get(j);
                }
            }
            if (temp > 1) 
            {
                list.add(temp);
            }
        }
        
        int sum = 1;
        for(int i = 0; i < list.size(); i++) 
        {
        
            sum *= list.get(i);
        }
        System.out.println(sum);
    }
}

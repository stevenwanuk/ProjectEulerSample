package com.sven.euler.sample;

public class Problem6
{

    public static void main(String[] args)
    {

        /*
         * <p>https://projecteuler.net/problem=6</p>
         *  Sum square difference Problem 6 The sum of
         * the squares of the first ten natural numbers is,
         * 
         * 12 + 22 + ... + 102 = 385 The square of the sum of the first ten natural numbers
         * is,
         * 
         * (1 + 2 + ... + 10)2 = 552 = 3025 Hence the difference between the sum of the
         * squares of the first ten natural numbers and the square of the sum is 3025 − 385
         * = 2640.
         * 
         * Find the difference between the sum of the squares of the first one hundred
         * natural numbers and the square of the sum.
         */
        
        int number = 100;
        
        int sumSquare = 0;
        int sum = 0;
        for(int i =1; i<= number; i++) 
        {
        
            sumSquare += i * i;
            sum += i;
        }
        
        int squareSum = sum*sum;
        System.out.println(squareSum - sumSquare);
        
        
        

    }

}

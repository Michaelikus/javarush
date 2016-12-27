package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[4];

        for (int number_index = 0; number_index < 4; number_index++){
            numbers[number_index] = Integer.parseInt(reader.readLine());
            //System.out.println(numbers[number_index]);
        }


        System.out.println("Maximum is " + MaxInt(numbers));
    }
    private static int MaxInt(int[] numbers_array){
        int maximum;
        maximum = numbers_array[0];
        for (int number_index = 0; number_index < 4; number_index++){
            if(numbers_array[number_index] > maximum ) maximum = numbers_array[number_index];
        }
        return maximum;
    }
}

package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[3];

        for(int position=0; position < numbers.length; position++){
            numbers[position] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(numbers);
        for(int position=numbers.length-1; position > -1; position--){
            System.out.println(numbers[position]);
        }

    }
}
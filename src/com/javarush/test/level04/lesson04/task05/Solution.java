package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sDigit = reader.readLine();
        int iDigit = Integer.parseInt(sDigit);

        if(iDigit > 0 ) iDigit = iDigit * 2;
        if(iDigit < 0 ) iDigit = iDigit + 1;

        System.out.println(iDigit);

    }

}
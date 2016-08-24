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

        int i1 = Integer.parseInt(reader.readLine());
        int i2 = Integer.parseInt(reader.readLine());

        int i3 = Integer.parseInt(reader.readLine());
        int i4 = Integer.parseInt(reader.readLine());

        int iMax;

        iMax = i1;

        if( i1 < i2){
            if(i2 < i3) {
                if(i3 < i4){
                    System.out.println(i4);
                }
            }
        } else if(i1 < i3){
            if(i3 < i4){
                System.out.println(i3);
            }
        }
    }
}

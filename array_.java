package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] my_array = {20, 23, 43, 76, 99};
        int[] new_array = new int[7];
        System.out.println(Arrays.toString(my_array));

        for(int i = 0; i < my_array.length; i++)
        {
            new_array[i] = my_array[i];
        }
        System.out.println(Arrays.toString(new_array));

    }
}


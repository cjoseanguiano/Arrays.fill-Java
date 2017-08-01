package com.devix.www;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = new int[10];
        Arrays.fill(values, 5);

        for (int value : values) {
            System.out.println(value);
            System.out.println(' ');
        }
    }
}

package com.company;
public class Main {
    public static void main(String[] args) {
        System.out.println("Input of odd numbers: ");
        for(int i = 1; i < 99; i++) {
            if( i % 2 != 0)
                System.out.println(i);
        }
    }
}
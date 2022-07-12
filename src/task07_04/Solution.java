package task07_04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Массив из чисел в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] list = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < list.length; i++) {
            String temp = reader.readLine();
            list[i] = Integer.parseInt(temp);
        }
        for (int i = list.length-1; i >= 0 ; i--) {
            System.out.println(list[i]);
        }
    }
}


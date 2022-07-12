package task07_05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArray = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];
        for (int i = 0; i < bigArray.length; i++) {
            String temp = reader.readLine();
            bigArray[i] = Integer.parseInt(temp);
        }

        for (int i = 0; i < bigArray.length/2 ; i++) {
            smallArray1[i] = bigArray[i];
            smallArray2[i] = bigArray[bigArray.length/2 + i];
            System.out.println(smallArray1[i] + " ----");
            System.out.println(smallArray2[i]);
        }


    }
}

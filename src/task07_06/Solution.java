package task07_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Улица и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] street = new int[15];
        int lefties = 0;
        int righties = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < street.length; i++) {
            String temp = reader.readLine();
            street[i] = Integer.parseInt(temp);
            if(i%2 == 1){
                lefties += street[i];
            }
            else {
                righties += street[i];
            }
        }
        if (lefties > righties){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        else if(righties > lefties){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }

    }
}
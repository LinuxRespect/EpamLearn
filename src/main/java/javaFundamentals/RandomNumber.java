package javaFundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int number = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input any number :");
        try {
            number = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < number; i++) {
            if ((i % 2) == 0)
                System.out.println(new Random().nextInt(100) + " ");
            else System.out.print(new Random().nextInt(100) + " ");
        }
    }
}

package javaFundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OptionalTask2 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input size matrix[n][n] :");
        int n = 0;
        int m = 0;
        try {
            n = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Please input max/min value matrix :");
            m = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }


        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> rows = new ArrayList();
            for (int j = 0; j < n; j++) {
                int randomValue = (int) (Math.random() * (2 * m + 1)) - m;
                System.out.print("|" + randomValue + " |");
                rows.add(randomValue);
            }
            System.out.println();
            map.put(i, rows);
        }
        System.out.println(map.toString());

        System.out.println("Choose number column which need sort :");
        int column = 0;
        ArrayList<Integer> array = new ArrayList<>();
        try {
            column = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Map.Entry<Integer, ArrayList<Integer>> arr : map.entrySet()) {
            ArrayList<Integer> valueArr = arr.getValue();
            int valueByColumn = valueArr.get(column);
            array.add(valueByColumn);
        }
        Collections.sort(array);

        for (Map.Entry<Integer, ArrayList<Integer>> arr : map.entrySet()) {
            ArrayList<Integer> valueArr = arr.getValue();
            valueArr.set(column, array.get(arr.getKey()));
            System.out.println(arr.toString());
        }

        //Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.

        ArrayList<Integer> maxCountElements = new ArrayList<>();
        ArrayList<Integer> allElementMatrix = new ArrayList<>();
        for (Map.Entry<Integer, ArrayList<Integer>> arr : map.entrySet()) {
            ArrayList<Integer> valueArr = arr.getValue();
            for (Integer value : valueArr) {
                allElementMatrix.add(value);
            }
        }
        System.out.println("All elements matrix =" + allElementMatrix.toString());
        ArrayList<Integer> currentArrayElements = new ArrayList<>();
        for (int i = 0; i < allElementMatrix.size() - 1; i++) {
            int valueInit = allElementMatrix.get(i);
            int valueNext = allElementMatrix.get(i + 1);
            if (valueNext > valueInit) {
                currentArrayElements.add(valueInit);
                if (valueNext == allElementMatrix.get(allElementMatrix.size() - 1)) {
                    currentArrayElements.add(valueNext);
                }

            } else {
                if (currentArrayElements.size() >= maxCountElements.size()) {
                    maxCountElements = currentArrayElements;
                    currentArrayElements = new ArrayList<>();
                } else
                    currentArrayElements = new ArrayList<>();

            }
        }
        System.out.println("Number of increasing matrix : " + maxCountElements.toString());

    }
}

package javaCollections.optionalTask;

import java.io.*;
import java.util.*;

public class Tasks {
    public static void main(String[] args) {
        optionalTask1();
        optionalTask2();
        optionalTask3();
    }

    //   Создать список из элементов каталога и его подкаталогов.
    private static void optionalTask3() {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> directoryC = new ArrayList<>();
        ArrayList<String> directoryD = new ArrayList<>();
        directoryC.add("subDirectoryC1");
        directoryC.add("subDirectoryC2");
        directoryD.add("subDirectoryD1");
        directoryD.add("subDirectoryD2");
        directoryD.add("subDirectoryD3");
        map.put("C", directoryC);
        map.put("D", directoryD);
        System.out.println(map.toString());
    }

    // Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
    private static void optionalTask2() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        System.out.println("Input number: ");
        String number = null;
        try {
            number = bufferedReader.readLine();
            char[] array = number.toCharArray();
            for (int i = 0; i < array.length; i++) {
                stack.push(array[i]);
            }
            System.out.print("Reverse number :");
            for (int i = 0; i < array.length; i++) {
                System.out.print(stack.pop());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
    private static void optionalTask1() {
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;
        BufferedReader bufferedReaderInput;
        ArrayList arrayList = new ArrayList();
        try {
            System.out.println("Input path to the file: ");
            bufferedReaderInput = new BufferedReader(new InputStreamReader(System.in));
            String inputPathFile = bufferedReaderInput.readLine();
            System.out.println("Put path to the file where will save reverse sort: ");
            String outputPathFile = bufferedReaderInput.readLine();
            bufferedReader = new BufferedReader(new FileReader(inputPathFile));
            String line = bufferedReader.readLine();
            while (line != null) {
                arrayList.add(line);
                line = bufferedReader.readLine();
            }
            System.out.println("List data from input file : " + arrayList.toString());
            Collections.reverse(arrayList);
            System.out.println("List data after reverse sort : " + arrayList);
            bufferedWriter = new BufferedWriter(new FileWriter(outputPathFile));
            for (Object fileContent : arrayList) {
                String lineString = (String) fileContent;
                String[] arrayLines = lineString.trim().split(" ");
                for (String element : arrayLines) {
                    bufferedWriter.write(element + " ");
                    bufferedWriter.flush();
                }
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException ioException) {
            ioException.printStackTrace();
        }
    }

}

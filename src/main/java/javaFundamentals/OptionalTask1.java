package javaFundamentals;

import java.text.CollationElementIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OptionalTask1 {
    public static void main(String[] args) {
        List<Integer> arraysList = Arrays.asList(5, 2, 1, 7, 4, 10, 1);
        List<Integer> sortedList = arraysList.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        System.out.println("--------------------");
        for (int i = 0; i < arraysList.size() / 2; i++) {
            System.out.println(arraysList.get(i));
        }
        System.out.println("Size =" + arraysList.size());

        System.out.println("--------------------");
        int minIndex = arraysList.indexOf(Collections.min(arraysList));
        System.out.println("At first min number = "+minIndex);


    }
}

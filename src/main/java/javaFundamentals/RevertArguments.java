package javaFundamentals;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RevertArguments {
    public static void main(String[] args) {
        System.out.println("Before sorting :");
        for(String arg:args){
            System.out.println( arg);
        }
        Arrays.sort(args, Collections.reverseOrder());
        System.out.println("After sotring :");
        for(String arg:args){
            System.out.println(arg);
        }


    }
}

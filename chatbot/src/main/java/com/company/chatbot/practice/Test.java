package com.company.chatbot.practice;

import java.util.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String... args) {
        String str = "apple";
        String key = Stream.of(str.split(""))
                .collect(Collectors.groupingBy(UnaryOperator.identity(), Collectors.counting()))
                .entrySet().stream().filter(map -> map.getValue() == 1).findFirst().get().getKey();
        //System.out.println(key);

        String a = "Tata";
        String b = a;
        a = "Birla";
//        System.out.println(b);

       List<Integer> lsitInt =  List.of(1,2,4,6,8,10,24,23,7,9,1,11);
        List<Integer> collect = lsitInt.stream()
                .takeWhile(n -> n%2 == 0)
//                .dropWhile(n -> n%2 != 0)
                .collect(Collectors.toList());
        System.out.println("collect: "+ collect);


       double avg = lsitInt.stream().mapToInt(m->m).average().getAsDouble();

       //
        Collections.frequency(Arrays.asList(str.split("")), "a");
        Arrays.asList(str.split("")).stream().collect(
                Collectors.groupingBy(UnaryOperator.identity(), Collectors.counting())
        );


        int arr1[] = {2,3,1,4,7};
        int arr2[] = {0,9,8,5};
        int []merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).
                boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer :: valueOf).toArray();
        System.out.println(Arrays.toString(merged));

    }

}

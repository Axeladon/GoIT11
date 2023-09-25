package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Mary", "Alex", "Sarah", "Michael", "Emily", "David",
                "Anna", "Robert", "Olivia", "William", "Sophia", "James", "Emma", "Joseph", "Lily", "Benjamin",
                "Ava", "Samuel", "Mia");

        System.out.println("---Task1---");
        System.out.println(filterOddIndexedNames(names) + "\n");

        System.out.println("---Task2---");
        System.out.println(convertToUppercaseAndSortDescending(names) + "\n");

        System.out.println("---Task3---");
        String[] numbers = {"1, 2, 0", "4, 5"};
        System.out.println(extractAndSortNumbers(numbers) + "\n");

        System.out.println("---Task4---");
        Stream<Long> lcg = LinearCongruentialGenerator(25214903917L, 11, (long)Math.pow(2, 48));
        lcg.limit(10)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("---Task5---");
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4);
        Stream<Integer> stream2 = Stream.of(5, 6, 7, 8, 9, 10, 11, 12);
        Stream<Integer> ziped = zip(stream1, stream2);
        ziped.forEach(System.out::print);
    }
    public static String filterOddIndexedNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }

    public static List<String> convertToUppercaseAndSortDescending(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    public static String extractAndSortNumbers(String[] inputArray) {
        return Arrays.stream(inputArray)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static Stream<Long> LinearCongruentialGenerator(long a, long c, long m) {
        return Stream.iterate(1L, x -> (a * x + c) % m);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();

        Stream.Builder builder = Stream.builder();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            builder.add(iterator1.next());
            builder.add(iterator2.next());
        }
        return builder.build();
    }

}

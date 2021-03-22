package com.test.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Дописать метод поиска в коллекци строк все строки, которые на java регистроНЕзависимо
 */
public class FirstTask {

    private static final List<String> strings = Arrays.asList("Java", "java", "First element", "Last java");

    public static void main(String[] args) {
        List<String> result = getAllJava();
        System.out.println(result);
    }

    /**
     * Дописать метод
     */
    private static List<String> getAllJava() {
        return strings.stream()
                .filter(w -> w.equalsIgnoreCase("java"))
                .collect(Collectors.toList());
    }
}

package com.test.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Дописать метод поиска в коллекци строк все строки, которые на java регистроНЕзависимо
 */
public class FirstTask {

    private static final List<String> STRINGS = Arrays.asList("Java", "java", "First element", "Last java");

    public static void main(String[] args) {
        List<String> result = getAllJava();
        System.out.println(result);
    }

    /**
     * Дописать метод
     */
    private static List<String> getAllJava() {
        return new ArrayList<>();
    }
}

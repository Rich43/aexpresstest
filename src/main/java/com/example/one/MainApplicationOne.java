package com.example.one;

public class MainApplicationOne {
    public static void main(String[] args) {
        final var service = new SolutionOneService();
        service.run(4).forEach(System.out::println);
    }
}

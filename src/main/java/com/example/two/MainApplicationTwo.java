package com.example.two;

public class MainApplicationTwo {
    public static void main(String[] args) {
        final var service = new SolutionTwoService();
        System.out.println(service.run(new int[]{1, 2, 3, 4}));
    }
}

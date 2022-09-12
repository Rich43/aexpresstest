package com.example.two;

public class MainApplicationTwo {
    public static void main(String[] args) {
        System.out.println("Testing");
    }

    int solution(int[] A) {
        int ans = 0;
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }
}

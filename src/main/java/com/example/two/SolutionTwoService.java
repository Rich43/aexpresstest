package com.example.two;

import static java.lang.Integer.MAX_VALUE;

public class SolutionTwoService {
    public int run(int[] A) {
        int ans = MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < ans) {
                ans = A[i];
            }
        }
        return ans;
    }
}

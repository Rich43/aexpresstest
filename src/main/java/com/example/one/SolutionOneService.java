package com.example.one;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.IntStream.range;

public class SolutionOneService {
    public List<String> run(int n) {
        final var output = new ArrayList<String>();
        int y = 0;
        while (y < n) {
            final var stringToAppend = new StringBuilder("L");
            if (y + 1 == n) {
                range(0, y).forEach(ignore -> stringToAppend.append("L"));
            }
            output.add(stringToAppend.toString());
            y++;
        }
        return output;
    }
}

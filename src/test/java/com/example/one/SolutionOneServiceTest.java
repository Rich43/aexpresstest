package com.example.one;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;

class SolutionOneServiceTest {
    private SolutionOneService solutionOneService = new SolutionOneService();

    @Test
    void run() {
        final var output = solutionOneService.run(4);
        Assertions.assertEquals(asList("L", "L", "L", "LLLL"), output);
    }
}

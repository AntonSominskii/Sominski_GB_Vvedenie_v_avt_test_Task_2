package org.max.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NegativeAccountTest {

    @Test
    void creatingAccountWithNegativeSumShouldThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Account(-100L);
        });
    }
}
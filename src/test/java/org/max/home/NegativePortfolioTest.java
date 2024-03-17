package org.max.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NegativePortfolioTest extends AbstractComponentTest {

    @Test
    void addingNullElementShouldThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            portfolio.add(null);
        });
    }
}
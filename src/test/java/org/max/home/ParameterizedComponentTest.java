package org.max.home;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedComponentTest {

    @ParameterizedTest
    @ValueSource(longs = {100L, 200L, 300L})
    void accountTest(Long sum) {
        Account account = new Account(sum);
        assertEquals(sum, account.getSum());
    }
}
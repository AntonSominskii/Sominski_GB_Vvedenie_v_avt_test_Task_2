package org.max.home;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public abstract class AbstractComponentTest {

    protected Portfolio portfolio;

    @BeforeEach
    void setUp() {
        portfolio = new Portfolio();
        // Общая инициализация для всех тестов
    }

    @AfterEach
    void tearDown() {
        // Здесь может быть код для очистки ресурсов, если это необходимо.
        // В текущей реализации кода специфических действий для очистки не требуется.
    }
}
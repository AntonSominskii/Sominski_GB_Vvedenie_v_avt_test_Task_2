package org.max.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class CompositeTest extends AbstractComponentTest {

    @Test
    void testAddComponent() {
        Leaf leaf = new Leaf("Leaf");
        Assertions.assertDoesNotThrow(() -> root.add(leaf), "Добавление компонента должно пройти без исключений");
    }

    @Test
    void testAddNullComponent() {
        Executable action = () -> root.add(null);
        Assertions.assertThrows(IllegalArgumentException.class, action, "Добавление null должно вызвать исключение");
    }
}
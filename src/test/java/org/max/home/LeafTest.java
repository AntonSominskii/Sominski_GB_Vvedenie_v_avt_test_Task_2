package org.max.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LeafTest extends AbstractComponentTest {

    @ParameterizedTest
    @ValueSource(strings = {"Leaf1", "Leaf2", "Leaf3"})
    void testLeafWithName(String name) {
        Leaf leaf = new Leaf(name);
        Assertions.assertEquals(name, leaf.getName(), "Имя листа должно соответствовать заданному");
    }
}
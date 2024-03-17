package org.max.home;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("Leaf1");
        Leaf leaf2 = new Leaf("Leaf2");

        Composite composite1 = new Composite("Branch1");
        Composite composite2 = new Composite("Branch2");

        composite1.add(leaf1);
        composite2.add(leaf2);
        composite2.add(composite1);

        Composite root = new Composite("Root");
        root.add(composite2);

        root.performOperation();
    }
}
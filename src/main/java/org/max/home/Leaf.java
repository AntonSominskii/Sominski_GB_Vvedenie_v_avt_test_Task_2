package org.max.home;

public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void performOperation() {
        System.out.println("Leaf " + name + ": операция выполнена.");
    }

    public String getName() {
        return name;
    }
}
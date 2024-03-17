package org.max.home;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> children = new ArrayList<>();
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component component) {
        if (component == null) {
            throw new IllegalArgumentException("Компонент не может быть null");
        }
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void performOperation() {
        System.out.println("Composite " + name + ": операция выполнена.");
        for (Component child : children) {
            child.performOperation();
        }
    }

    public String getName() {
        return name;
    }
}
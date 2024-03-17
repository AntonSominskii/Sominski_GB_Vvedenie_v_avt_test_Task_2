package org.max.home;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Портфолио - контейнер, не имеет стоимости но состоит из других элементов
 */
public class Portfolio implements IElement{

    public List<IElement> elements = new ArrayList<>();

    @Override
    public Long getSum() {
        AtomicReference<Long> result = new AtomicReference<>(0L);
        elements.forEach(IElement -> {
            result.set(result.get() + IElement.getSum());
        });

        return result.get();
    }

    public void add(IElement element){
        if (element == null) {
            throw new IllegalArgumentException("Cannot add null element to the portfolio.");
        }
        elements.add(element);
    }
}
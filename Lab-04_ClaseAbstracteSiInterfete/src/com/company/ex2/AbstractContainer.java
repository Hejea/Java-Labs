package com.company.ex2;

import com.company.ex1.Task;

import java.util.ArrayList;

public abstract class AbstractContainer implements Container {
    private ArrayList<Task> container;

    AbstractContainer() {
        container = new ArrayList<>(10);
    }

    ArrayList<Task> getContainer() {
        return container;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void transferFrom(Container container) {
        while (container.isEmpty()) {
            push(container.pop());
        }
    }
}

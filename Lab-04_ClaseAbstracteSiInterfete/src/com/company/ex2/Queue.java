package com.company.ex2;

import com.company.ex1.Task;

public class Queue extends AbstractContainer {

    public Queue() {
        super();
    }

    @Override
    public Task pop() {
        if (getContainer().isEmpty()) {
            return null;
        }
    
        return getContainer().remove(0);
    }

    @Override
    public void push(Task task) {
        getContainer().add(task);
    }

    @Override
    public int size() {
        return getContainer().size();
    }
}

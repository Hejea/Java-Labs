package com.company.ex2;

import com.company.ex1.Task;

public class Stack extends AbstractContainer {

    public Stack() {
        super();
    }

    @Override
    public int size() {
        return getContainer().size();
    }


    @Override
    public Task pop() {
        if (getContainer().isEmpty()) {
            return null;
        }
    
        return getContainer().remove(getContainer().size() - 1);
    }

    @Override
    public void push(Task task) {
        getContainer().add(task);
    }
}

package com.company.ex5;

import com.company.ex1.Task;
import com.company.ex2.Container;
import com.company.ex3.ContainerFactory;
import com.company.ex3.Strategy;
import com.company.ex4.AbstractClassRunner;

public class RedoTaskRunner extends AbstractClassRunner {
    private Container reversedContainer;

    public RedoTaskRunner(Strategy strategy) {
        super(strategy);
        reversedContainer = ContainerFactory.INSTANCE.createContainer(Strategy.LIFO);
    }

    public void redo() {
        while (!reversedContainer.isEmpty())
            reversedContainer.pop().execute();
    }

    @Override
    protected void afterExecution(Task task) {
        reversedContainer.push(task);
    }
}

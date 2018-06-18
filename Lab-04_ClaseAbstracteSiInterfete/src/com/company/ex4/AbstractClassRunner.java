package com.company.ex4;

import com.company.ex1.Task;
import com.company.ex2.Container;
import com.company.ex3.ContainerFactory;
import com.company.ex3.Strategy;

public abstract class AbstractClassRunner {
    private Container container;

    protected AbstractClassRunner(Strategy strategy) {
        container = ContainerFactory.INSTANCE.createContainer(strategy);
    }

    public void addTask(Task task) {
        container.push(task);
    }

    public void executeAll() {
        while (!container.isEmpty()) {
            Task task = container.pop();

            task.execute();

            afterExecution(task);
        }
    }

    protected abstract void afterExecution(Task task);
}

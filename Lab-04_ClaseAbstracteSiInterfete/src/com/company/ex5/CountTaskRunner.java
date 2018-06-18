package com.company.ex5;

import com.company.ex1.Task;
import com.company.ex3.Strategy;
import com.company.ex4.AbstractClassRunner;

public class CountTaskRunner extends AbstractClassRunner {
    private int counter;

    public CountTaskRunner(Strategy strategy) {
        super(strategy);

        counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    protected void afterExecution(Task task) {
        counter++;
    }
}

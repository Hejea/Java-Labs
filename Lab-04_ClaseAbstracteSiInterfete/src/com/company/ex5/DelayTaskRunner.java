package com.company.ex5;

import com.company.ex1.Task;
import com.company.ex3.Strategy;

public class DelayTaskRunner extends PrintTaskRunner {
    private int delay;

    public DelayTaskRunner(Strategy strategy, int delay) {
        super(strategy);
        
        this.delay = delay;
    }

    @Override
    protected void afterExecution(Task task) {
        super.afterExecution(task);

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

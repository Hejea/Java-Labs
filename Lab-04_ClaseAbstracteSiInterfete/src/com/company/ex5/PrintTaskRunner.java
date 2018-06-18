package com.company.ex5;

import com.company.ex1.Task;
import com.company.ex3.Strategy;
import com.company.ex4.AbstractClassRunner;

import java.util.Date;

public class PrintTaskRunner extends AbstractClassRunner {

    public PrintTaskRunner(Strategy strategy) {
        super(strategy);
    }

    @Override
    protected void afterExecution(Task task) {
        System.out.println("Task-ul s-a executat la ora: " + new Date().toString());
    }
}

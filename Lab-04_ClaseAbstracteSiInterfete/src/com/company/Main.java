package com.company;

import com.company.ex1.*;
import com.company.ex2.*;
import com.company.ex3.*;
import com.company.ex4.*;
import com.company.ex5.*;

public class Main {

    private static final int TASK_NO = 6;

    private static Task[] taskList;

    private static void test1() {
        taskList = new Task[TASK_NO];

        taskList[0] = new MessageTask("First message task");
        taskList[1] = new RandomNumberTask();
        taskList[2] = new GlobalCounter();
        taskList[3] = new MessageTask("Second message task");
        taskList[4] = new GlobalCounter();
        taskList[5] = new RandomNumberTask();

        for (Task task : taskList) {
            task.execute();
        }
    }

    static private void testContainer(Strategy strategy) {
        Container container = ContainerFactory.INSTANCE.createContainer(strategy);

        for (Task task : taskList) {
            container.push(task);
        }

        System.out.println("Testing order: " + strategy.toString());

        while (!container.isEmpty()) {
            container.pop().execute();
        }

        System.out.println();
    }

    private static void test2_3() {
        testContainer(Strategy.LIFO);
        testContainer(Strategy.FIFO);
    }

    private static void testTaskRunner(AbstractClassRunner taskRunner) {
        System.out.println("Testing: " + taskRunner);

        for (Task task : taskList) {
            taskRunner.addTask(task);
        }

        taskRunner.executeAll();

        System.out.println();
    }

    private static void test4_5() {
        testTaskRunner(new PrintTaskRunner(Strategy.LIFO));

        CountTaskRunner counterTaskRunner = new CountTaskRunner(Strategy.FIFO);

        testTaskRunner(counterTaskRunner);
        System.out.println("#Executed tasks: " + counterTaskRunner.getCounter());

        RedoTaskRunner redoTaskRunner = new RedoTaskRunner(Strategy.LIFO);

        testTaskRunner(redoTaskRunner);
        System.out.println("Reexecuting: ");
        
        redoTaskRunner.redo();

        testTaskRunner(new DelayTaskRunner(Strategy.LIFO, 1000));
    }

    public static void main(String[] args) {
        test1();
        System.out.println("------\tTEST EX 1 FINALIZAT\t------");

        test2_3();
        System.out.println("------\tTEST EX 2 SI EX 3 FINALIZAT\t------");

        test4_5();
        System.out.println("------\tTEST EX 4 SI EX 5 FINALIZAT\t------");
    }
}

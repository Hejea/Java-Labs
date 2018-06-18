package com.company.ex1;

public class MessageTask implements Task {
    private String name;

    public MessageTask(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        
        System.out.println(name);
    }
}

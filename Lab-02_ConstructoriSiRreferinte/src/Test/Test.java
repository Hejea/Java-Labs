package Test;


import Condition_1_2.TestShape;
import Condition_3.TestTime;
import Condition_4.TestMemory;

public class Test {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------------");
        TestShape.testRun();

        System.out.print("-----------------------------------------------------------");
        new TestTime().testRun();

        System.out.print("-----------------------------------------------------------");
        new TestMemory().testRun();

        System.out.println("-----------------------------------------------------------");
    }
}

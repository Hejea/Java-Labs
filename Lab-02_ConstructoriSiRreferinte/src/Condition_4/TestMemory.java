package Condition_4;

public class TestMemory {
    private long showUsedMemory() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    public void testRun() {
        System.out.println("\nMemory in use : " + this.showUsedMemory() + " bits");
    }
}

package Condition_3;

public class TestTime {
    private static final int n = 1000;

    private long testInt() {
        long start = System.nanoTime();
        int[] arrayInt;
        arrayInt = new int[n];
        for (int i = 0; i < n; i++) arrayInt[i] = i;
        return System.nanoTime() - start;
    }

    private long testInteger() {
        long start = System.nanoTime();
        Integer[] arrayInteger;
        arrayInteger = new Integer[n];
        for (int i = 0; i < n; i++) arrayInteger[i] = new Integer(i);
        return System.nanoTime() - start;
    }

    public void testRun() {
        System.out.printf("\nTime using     int for %d elements : %d ms"  , n, this.testInt());
        System.out.printf("\nTime using Integer for %d elements : %d ms\n", n, this.testInteger());
    }
}

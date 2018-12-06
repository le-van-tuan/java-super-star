package vn.sps.threads;

public class SynchronizationApplication {
    private int sum = 0;

    public synchronized void calculate() {
        setSum(getSum() + 1);
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

public class StopWatch {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.nanoTime();

    }

    public void stop() {
        endTime = System.nanoTime();

    }

    public double getElapsedTime() {
        double elapsedTime = (endTime - startTime) / 1000000;
        return elapsedTime;
    }
}
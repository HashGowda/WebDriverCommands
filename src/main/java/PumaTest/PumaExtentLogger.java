package PumaTest;

public class PumaExtentLogger {
    public static void pass(String message) {
        PumaExtentTestManager.getExtentTest().pass(message);
    }

    public static void fail(String message) {
        PumaExtentTestManager.getExtentTest().fail(message);
    }

    public static void info(String message) {
        PumaExtentTestManager.getExtentTest().info(message);
    }

    public static void skip(String message) {
        PumaExtentTestManager.getExtentTest().skip(message);
    }
}

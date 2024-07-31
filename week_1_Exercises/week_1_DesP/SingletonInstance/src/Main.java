public class Main {
    public static void main(String[] args) {
        Logger logA = Logger.getObject();
        Logger logB = Logger.getObject();

        logA.log("First log");
        logB.log("Second log");

        if (logA == logB) {
            System.out.println("Both Loggers refer to the same object");
        } else {
            System.out.println("loggers refer to different instances.");
        }
    }
}

import java.util.Random;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        loadFromServer();
        this.fileName = fileName;
    }

    private void loadFromServer() {
        try {
            System.out.println("Loading image: " + fileName);
            Thread.sleep(new Random().nextInt(2000) + 1000); // Simulate loading time
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("src/drone.txt");
        try (Scanner scanner = new Scanner(file)) {
            int numDataPoints = 0;
            while (scanner.hasNextLine()) {
                ++numDataPoints;
                System.out.println(scanner.nextLine());
            }
            System.out.println(numDataPoints + " data points");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + file.getPath());
        }
    }
}

import java.io.FileReader;
import java.io.IOException;

public class pr26 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java LineCounts file1.txt file2.txt ...");
            return;
        }

        for (String fileName : args) {
            int lineCount = 0;
            try (FileReader reader = new FileReader(fileName)) {
                int character;
                boolean emptyLine = true;
                while ((character = reader.read()) != -1) {
                    if (character == '\n') {
                        lineCount++;
                        emptyLine = true;
                    } else if (character != '\r') {
                        emptyLine = false;
                    }
                }
                if (!emptyLine) {
                    lineCount++;  // Count the last line if file doesn't end with a newline
                }
                System.out.println(fileName + ": " + lineCount + " lines");
            } catch (IOException e) {
                System.out.println("Error reading " + fileName + ": " + e.getMessage());
            }
        }
    }
}
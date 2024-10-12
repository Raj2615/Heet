import java.io.*;
import java.util.*;

public class pr28 {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        String searchWord = "Java"; // Word to search for

        // Demonstrate use of Wrapper Class
        Integer lineCount = countWordOccurrences(fileName, searchWord);
        
        if (lineCount != null) {
            System.out.println("The word '" + searchWord + "' appears in " + lineCount + " line(s).");
        } else {
            System.out.println("An error occurred while reading the file.");
        }

        // Demonstrate another use of Wrapper Class
        Double version = 17.0;
        System.out.println("Using Java version: " + version);
        
        // Convert Double to double primitive
        double primitiveVersion = version.doubleValue();
        System.out.println("Primitive double value: " + primitiveVersion);
    }

    public static Integer countWordOccurrences(String fileName, String searchWord) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(searchWord.toLowerCase())) {
                    count++;
                }
            }
            return Integer.valueOf(count); // Using Integer Wrapper Class
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            return null;
        }
    }
}
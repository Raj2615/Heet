import java.io.*;

public class pr29 {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try {
            // Create FileInputStream for the source file
            FileInputStream fis = new FileInputStream(sourceFile);

            // Create FileOutputStream for the destination file
            FileOutputStream fos = new FileOutputStream(destinationFile);

            int byteRead;
            // Read from source and write to destination
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }

            // Close the streams
            fis.close();
            fos.close();

            System.out.println("File copied successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error occurred while copying file: " + e.getMessage());
        }
    }
}
import java.io.*;

public class pr30 {
    public static void main(String[] args) {
        // Byte Stream example
        try (FileInputStream in = new FileInputStream("input.txt");
             FileOutputStream out = new FileOutputStream("output.txt")) {
            
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("File copied using byte stream.");
        } catch (IOException e) {
            System.out.println("IOException in byte stream: " + e.getMessage());
        }

        // Character Stream example
        try (FileReader reader = new FileReader("input.txt");
             FileWriter writer = new FileWriter("output_char.txt")) {
            
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
            System.out.println("File copied using character stream.");
        } catch (IOException e) {
            System.out.println("IOException in character stream: " + e.getMessage());
        }

        // BufferedReader/BufferedWriter example
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("user_input.txt"))) {
            
            System.out.println("Enter text (type 'exit' to quit):");
            String line;
            while (!(line = br.readLine()).equals("exit")) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("User input saved to file.");
        } catch (IOException e) {
            System.out.println("IOException in buffered reader/writer: " + e.getMessage());
        }
    }
}
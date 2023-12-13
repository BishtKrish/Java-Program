import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputToFile {

    public static void main(String[] args) {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter fileWriter = null;

        try {
   
            String filePath = "output.txt";
            fileWriter = new BufferedWriter(new FileWriter(filePath));

            System.out.println("Enter text (type 'exit' to stop):");

            String inputLine;
            while (!(inputLine = consoleReader.readLine()).equalsIgnoreCase("exit")) {
            
                fileWriter.write(inputLine);
                fileWriter.newLine();
            }

            System.out.println("Text has been written to " + filePath);

        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } finally {
            try {
             
                if (consoleReader != null) {
                    consoleReader.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("IOException during closing: " + e.getMessage());
            }
        }
    }
}



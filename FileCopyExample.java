import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {

    public static void main(String[] args) {
        String sourceFilePath = "source.txt"; 
        String destinationFilePath = "destination.txt";
        try {
            FileInputStream inputStream = new FileInputStream(sourceFilePath);
            FileOutputStream outputStream = new FileOutputStream(destinationFilePath);
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");

            inputStream.close();
            outputStream.close();

        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}



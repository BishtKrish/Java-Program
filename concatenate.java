import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class concatenate 
{
    public static void main(String[] args) 
    {
        String inputFile1="remove.java";
        String inputFile2="prime.java";
        String outputFile="output.txt";

        concatenate(inputFile1,inputFile2,outputFile);

        System.out.println("files concatenated successfully");
    }

    private static void concatenate(String inputFile1,String inputFile2,String outputFile)
    {
        try(BufferedReader reader1=new BufferedReader(new FileReader(inputFile1));
            BufferedReader reader2=new BufferedReader(new FileReader(inputFile2));
            BufferedWriter writer=new BufferedWriter(new FileWriter(outputFile))){
                String line;

                while ((line=reader1.readLine())!=null){
                    writer.write(line);
                    writer.newLine();
                }

                while ((line=reader2.readLine())!=null){
                    writer.write(line);
                    writer.newLine();
                }
    }
    catch(IOException e){
        e.printStackTrace();
    }
    }
}
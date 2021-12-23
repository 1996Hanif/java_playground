package file_io;

import java.io.*;

public class FileIOExamples {

    public static void printLines(){
        String fileLocation = "src/main/resources/twas_the_night_before_chrismas.txt";

        try {
            //FileReader fileReader = new FileReader(fileLocation);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation));

            String line = bufferedReader.readLine();
            while (line != null){
                System.out.println(bufferedReader.readLine());
                line = bufferedReader.readLine(); // \n \cr
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printAllLinesUsingForLoop(String fileLocation){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation));
            for(String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("File not found");
        }

    }

    public static void writeToAFile(){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/write_example.txt"));
            bufferedWriter.write("this is a new line");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        FileIOExamples.printAllLinesUsingForLoop("src/main/resources/twas_the_night_before_chrismas.txt");
        FileIOExamples.writeToAFile();
    }
}

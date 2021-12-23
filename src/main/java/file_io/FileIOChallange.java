package file_io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FileIOChallange {
    ArrayList<String> allWords = new ArrayList<>();

    public void printAllLinesUsingForLoop(String fileLocation) {
        String[] words;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation));
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                System.out.println(line);
                words = line.split("\\W+");

                for (int i = 0; i < words.length; i++) {
                    if (!words[i].equals(""))
                        allWords.add(words[i]);
                }
                System.out.println(Arrays.toString(words));
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("File not found");
        }
        System.out.println(allWords);
    }
    public int checkWords(String fileLocation){
        ArrayList<String> acceptedWord = new ArrayList<>();
        try {
            for (int i = 0; i < allWords.size(); i++) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation));
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    if (allWords.get(i).equals(line)) {
                        acceptedWord.add(allWords.get(i));
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("File not found");
        }

        return acceptedWord.size();
    }
    public void writeToFile(String filename){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

            int amountOfWords = checkWords("src/main/resources/english.txt");
            int amountOfPronouns = checkWords("src/main/resources/pronouns.txt");
            bufferedWriter.write("Amount of Words:      " + allWords.size() + "\n");
            bufferedWriter.write("Amount of Real Words: " + amountOfWords + "\n");
            bufferedWriter.write("Amount of Pronouns:   " + amountOfPronouns + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileIOChallange file = new FileIOChallange();
        file.printAllLinesUsingForLoop("src/main/resources/twas_the_night_before_chrismas.txt");


        file.writeToFile("src/main/resources/nbc_parse.txt");

    }
}

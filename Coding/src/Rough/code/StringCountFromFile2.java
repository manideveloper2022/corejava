package Rough.code;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringCountFromFile2 {
    public static void main(String[] args) {
        String filePath = "C:\\\\Users\\\\MRNB\\\\Downloads\\\\mbom-Migration\\\\mbom-Migration.log";
        String searchWord = "Existing";
        
        int count = countStringOccurrences(filePath, searchWord);
        System.out.println("The count of \"" + searchWord + "\" in the file is: " + count);
    }
    
    public static int countStringOccurrences(String filePath, String searchWord) {
        int count = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                count += countOccurrencesInLine(line, searchWord);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return count;
    }
    
    public static int countOccurrencesInLine(String line, String searchWord) {
        int count = 0;
        int index = line.indexOf(searchWord);
        
        while (index != -1) {
            count++;
            index = line.indexOf(searchWord, index + searchWord.length());
        }
        
        return count;
    }
}

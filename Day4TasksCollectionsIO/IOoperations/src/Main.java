import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //List of all files under certain directory
        File file = new File("C:\\Users\\anton\\projects\\Accenture\\Day4TasksCollectionsIO\\IOoperations\\src");
        File file2 = new File("C:\\Users\\anton\\projects\\Accenture\\Day4TasksCollectionsIO\\IOoperations\\src\\Files\\bjjbbj.txt");
        StringBuilder builder = new StringBuilder(" ");
        String[] list = file.list();
        for (String str : list) {
            System.out.println("file under directory: " + str);
            System.out.println(file.exists());
            System.out.println("Is src a file? " + file.isFile());
            System.out.println(file.compareTo(file2));
        }
        Date date = new Date(file2.lastModified());
        System.out.println(date);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("file size is " + file2.length() + " bytes");

        //Read from file and store in variable
        try {
            builder = readFile(file2,builder);
            appendToFile(file2, "SOME TEXT");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
          System.out.println(builder);

        try {
            System.out.println("Longest word in a file: "+findLongestWord(file2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static StringBuilder readFile(File file, StringBuilder builder) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        String line = null;
        try {
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
                builder.append(line);
            }
        } catch (IOException e) {
        }
        fileReader.close();
        return builder;
    }

    static void appendToFile(File file, String toAppend) throws IOException {
       FileWriter fileWriter = new FileWriter(file, true);
       fileWriter.write(toAppend);
       fileWriter.flush();
       fileWriter.close();
    }

    static String findLongestWord(File file) throws IOException {
        String longest = " ";
        String temp = " ";
        Scanner scanner = new Scanner(file);
       while (scanner.hasNext()){
           temp = scanner.next();
           if(temp.length()>longest.length())
           {
               longest = temp;
           }
       }
        return longest;
    }
}

package src.common;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class FileReader {

    public static List<String> readInputFile() {

        List<String> lines = new ArrayList<>();

        try {
            File myObj = new File("src/input/input.txt");
            if (myObj.exists()) {
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    lines.add(myReader.nextLine());
                }
                myReader.close();
                System.out.println("The input file has been read with success.");
            } else {
                System.out.println("The input file does not exist.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return lines;
    }

}

package exercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class ArrayListToFile {
    private static ArrayList priceArray;

    public static void main(String[] args) {
        File file = new File("/home/siged/Desktop/javaintro/javaIntro/testing/src/exercise/textfiles");
        try {
            file.mkdir();
            file.getParentFile().createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

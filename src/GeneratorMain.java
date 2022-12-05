import java.io.FileNotFoundException;

public class GeneratorMain {
    public static void main(String[] args) {
        String[] femaleNamesArray;
        String[] maleNamesArray;
        String[] surnamesArray;
        try {
            String femaleNamesPath = "TextFiles/female names.txt";
            femaleNamesArray = StudentGenerator.convertingFileToArray(femaleNamesPath);

            String maleNamesPath = "TextFiles/male names.txt";
            maleNamesArray = StudentGenerator.convertingFileToArray(maleNamesPath);

            String surnamePath = "TextFiles/surnames.txt";
            surnamesArray = StudentGenerator.convertingFileToArray(surnamePath);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

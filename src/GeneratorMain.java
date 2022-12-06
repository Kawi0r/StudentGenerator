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

            char gender = StudentGenerator.settingGender(1);
            System.out.println(StudentGenerator.settingName(
                    gender,
                    maleNamesArray,
                    femaleNamesArray,
                    surnamesArray
            ));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(StudentGenerator.settingDateOfBirth());
        System.out.println(StudentGenerator.settingStudentID());
    }

}

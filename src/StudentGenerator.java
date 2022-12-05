import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StudentGenerator {
    private static int random10() {
        Random random = new Random();
        return random.nextInt(10);
    }

    private static int random20() {
        Random random = new Random();
        return random.nextInt(20);
    }

    private static int random2() {
        Random random = new Random();
        return random.nextInt(2);
    }

    public static String[] convertingFileToArray(String file) throws FileNotFoundException {

        // array list to store strings
        List<String> listOfStrings = new ArrayList<String>();

        // load content of file based on specific delimiter
        Scanner sc = new Scanner(new FileReader(file))
                .useDelimiter(",\\s*");

        String str;

        // checking end of file
        while (sc.hasNext()) {
            str = sc.next();

            // adding each string to array list
            listOfStrings.add(str);
        }

        // convert any array list to array
        String[] array = listOfStrings.toArray(new String[0]);

        return array;
    }

    private static char settingGender(int num) {
        if (num == 0) {
            return 'F';
        } else if (num == 1) {
            return 'M';
        } else {
            return 'O';
        }
    }

    private static String settingName(char gender, String[] maleNames, String[] femaleNames, String[] surname) {
        int random10 = random10();
        int random20 = random20();

        // depend on what gender will be rolled, this type of name will be used
        if (gender == 'M') {
            return maleNames[random10] + " " + surname[random20];
        } else if (gender == 'F') {
            return femaleNames[random10] + " " + surname[random20];
        } else {
            return "Error";
        }
    }



}

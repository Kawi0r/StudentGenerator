import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StudentGenerator {
    private static int random(int num) {
        Random random = new Random();
        return random.nextInt(num);
    }

    private static int random(int num1, int num2) {
        Random random = new Random();
        return random.nextInt(num1, num2);
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

    public static char settingGender(int num) {
        if (num == 0) {
            return 'F';
        } else if (num == 1) {
            return 'M';
        } else {
            return 'O';
        }
    }

    public static String settingName(char gender, String[] maleNames, String[] femaleNames, String[] surname) {
        int random10 = random(10);
        int random20 = random(20);

        // depend on what gender will be rolled, this type of name will be used
        if (gender == 'M') {
            return maleNames[random10] + " " + surname[random20];
        } else if (gender == 'F') {
            return femaleNames[random10] + " " + surname[random20];
        } else {
            return "Error";
        }
    }

    public static String settingDateOfBirth() {
        int day = random(31) + 1;
        String sDay;
        if (day < 10) {
            sDay = "0" + day;
        } else {
            sDay = String.valueOf(day);
        }
        int month = random(12) + 1;
        String sMonth;
        if (month < 10) {
            sMonth = "0" + month;
        } else {
            sMonth = String.valueOf(month);
        }
        int year = random(101) + 1900;
        return sDay + "/" + sMonth + "/" + year;
    }

    public static int settingStudentID() {
        return random(1000001, 10000000);
    }
}

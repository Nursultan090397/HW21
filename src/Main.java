import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter fileWriter = new FileWriter("san.txt")) {
            for (char i = 'A'; i <= 'Z'; i++) {
                String string = i + " " + Character.toLowerCase(i);
                fileWriter.write(string + " \n");
            }


            for (char i = '0'; i <= '9'; i++) {
                fileWriter.write(i + "\n");
            }

        }
        try (FileReader fileReader = new FileReader("san.txt")) {
            scanner = new Scanner(fileReader);
            int counter = 1;
            while (scanner.hasNextLine()) {
                System.out.println(counter + ")" + scanner.nextLine());
                counter++;

            }

        }


    }


}




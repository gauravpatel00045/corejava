import java.io.*;

/**
 * File create example
 */
public class FileDemo{

    public static void main(String[] args) {
        FileDemo.createFile();
        FileDemo.readExistingFile();
        FileDemo.readFromConsole();
    }

    /**
     * It uses to create new file
     */
    static void createFile() {
        File personalDetails = new File("details.txt");
        try {
            if (personalDetails.exists()) {
                System.out.println("File already exists.");
                FileDemo.writeFile();
            } else {
                System.out.println("New File is created!");
                personalDetails.createNewFile();
                FileDemo.writeFile();
            }
            System.out.println(personalDetails);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * It writes the file
     */
    public static void writeFile() {
        String personalDetails = "Name: Gaurav" + "\n" + "Family Name: Patel";
        try {
            FileWriter fileWriter = new FileWriter("details.txt");
            fileWriter.write(personalDetails);
            fileWriter.close();
            System.out.println("Success...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * It read file's data from console
     */
    public static void readFromConsole() {

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String userInput = "";
            while (!userInput.equals("stop")) {
                System.out.println("Enter data: ");
                userInput = bufferedReader.readLine();
                System.out.println("data is: " + userInput);
            }
            bufferedReader.close();
            inputStreamReader.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    /**
     * It reads the existing file
     */
    public static void readExistingFile() {
        try {
            FileReader fileReader = new FileReader("details.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int i;
            while ((i = bufferedReader.read()) != -1) {
                System.out.print((char) i);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}

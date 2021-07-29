import java.io.*;

public class App2 {

    public static void main(String[] args) {
        File file = new File("test.txt");

        //try with resources : we have to handle 2 exceptions
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("File not found exception " + file.toString());
        }
        catch (IOException ioException) {
            System.out.println("Unable to read file " + file.toString());
        }
    }
}

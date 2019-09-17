import java.io.*;
import java.util.Random;

public class filHantering {
    public static void main(String[] args) {
        String filenameTxt = "RandomNumbers.txt";

        try {
            PrintWriter txtOut = new PrintWriter(new BufferedOutputStream(new FileOutputStream(filenameTxt)));
            Random r = new Random();
            for (int i = 0 ; i < 1000 ; i++) {
                int randomNumber = r.nextInt();
                txtOut.println(randomNumber);
            }
            txtOut.close();
        } catch (IOException e) { 
            e.printStackTrace();
        }
        try {
            int number;
            System.out.println("Text data");
            BufferedReader txtIn = new BufferedReader(new FileReader(filenameTxt));
            for (int i = 0 ; i < 1000 ; i++) {
                number = Integer.parseInt(txtIn.readLine());
                System.out.println(number);
            }
            txtIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
      }
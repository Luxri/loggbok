import java.util.ArrayList;
import java.util.Scanner;
public class logg {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        while (true) {
            printMenu();
            selectOption(op);
        }

    }

    private static void printMenu() {
        System.out.println("Välkommen! Välj någon av alternativen nedan.");
        System.out.println(
                  "1. lägg till post." + "\n"
                + "2. Uppdatera." + "\n"
                + "3. Spara." + "\n"
                + "4. Läs in." + "\n"
                + "5. Avsluta.");
    }
    static ArrayList<LogEntry> userInput = new ArrayList<LogEntry>();
    private static void selectOption(Scanner op) {
        int input = op.nextInt();

        op.nextLine();
        if (input == 1) {
            saveFile(op, userInput);
        } else if (input == 2) {
            System.out.println("Du kan inte uppdatera för tillfället.");
        } else if (input == 3) {
            System.out.println("Du kan inte spara filer för tillfället.");
        } else if (input == 4) {
            System.out.println(userInput);
        } else if (input == 5) {
            System.out.println("Hejdå.");
            System.exit(0);
        }
    }

    private static void saveFile(Scanner op, ArrayList<LogEntry> userInput) {
        System.out.println("Skriv ditt medelande.");
        String newFile = op.nextLine();
        System.out.println("Vill du spara? 1 = ja 2 = nej");
        int saveInput = op.nextInt();
        if (saveInput == 1) {
            userInput.add(new LogEntry(newFile));
            System.out.println("Post har sparats");
        } else if (saveInput == 2){
            System.out.println("Ej sparad");

        }
    }
}

/*Programmet börjar med att visa en meny. Denna meny visar olika alternativ som att uppdatera existernade filer eller att spara den nuvarande filen.*\
 */
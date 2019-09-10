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
                + "2. Uppdatera post." + "\n"
                + "3. Spara till en fil." + "\n"
                + "4. Läs in." + "\n"
                + "5. Avsluta.");
    }
    static ArrayList<String> userInput = new ArrayList<String>();
    private static void selectOption(Scanner op) {
        int input = op.nextInt();

        op.nextLine();
        if (input == 1) {
            saveFile(op, userInput);
        } else if (input == 2) {
            System.out.println("Du kan inte uppdatera.");
        } else if (input == 3) {
            System.out.println("Du kan inte spara filer för tillfället.");
        } else if (input == 4) {
            System.out.println(userInput);
        } else if (input == 5) {
            System.out.println("Hejdå.");
            System.exit(0);
        }
    }

    private static void saveFile(Scanner op, ArrayList<String> userInput) {
        System.out.println("Skriv ditt medelande.");
        String newFile = op.nextLine();
        System.out.println("Vill du spara? 1 = ja 2 = nej");
        int saveInput = op.nextInt();
        if (saveInput == 1) {
            userInput.add(newFile);
            System.out.println("Post har sparats");
        } else if (saveInput == 2){

            System.out.println("Ej sparad");
/*
saveFile börjar med att efter man tryckt på 1. Programmet frågar dig vad du vill skriva för medelande och efter att du har skrivit
ditt medelande så frågar programmet om du vill spara vad du har skrivit. Om du trycker 1 så kommer programmet sparas men om du trycker 2 kommer
det inte sparas.
 */
        }
    }
}

/*Programmet börjar med att visa en meny. Denna meny visar olika alternativ som att uppdatera existernade filer eller att spara den nuvarande filen.*\
 */
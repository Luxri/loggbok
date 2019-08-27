import java.util.Scanner;
public class logg {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Välkommen! Välj någon av alternativen nedan.");
        System.out.println("1. lägg till post." + "\n"
                + "2. Uppdatera." + "\n"
                + "3. Spara." + "\n"
                + "4. Läs in." + "\n"
                + "5. Avsluta.");
            int input = op.nextInt();
            if (input == 1) {
                System.out.println("Du kan inte skapa posts just nu.");
            } else if (input == 2) {
                System.out.println("");
            }
    }
}

/*Programmet börjar med att visa en meny. Denna meny visar olika alternativ som att uppdatera existernade filer eller att spara den nuvarande filen.*\
 */
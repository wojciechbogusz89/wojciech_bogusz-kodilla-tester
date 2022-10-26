import java.util.Scanner;

public class ShowColor {

    public static String nazwaKoloru() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wybierz kolor C-Czerwony, CZ-Czarny, Z-Zielony, N-Niebieski:");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "C":
                    return "Czerwony";
                case "CZ":
                    return "Czarny";
                case "Z":
                    return "Zielony";
                case "F":
                    return "N-Niebieski";
                default:
                    System.out.println("Wrong selection. Try again.");
            }
        }
    }
}

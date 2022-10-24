public class ApplicationApp {
    public static void main(String[] args) {

        Uzytkownik uzytkownik = new Uzytkownik("Adam", 40.5, 178);
        System.out.println(uzytkownik.name + " " + uzytkownik.age + " " + uzytkownik.height);
        uzytkownik.Czlowiek();

    }
}

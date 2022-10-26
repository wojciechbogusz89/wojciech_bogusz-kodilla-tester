public class BookApp {
    public static void main(String[] args) {
      Book ksiazka = Book.of("Rowling", "HarryPotter");
      System.out.println(ksiazka.getTitle());
    }
}

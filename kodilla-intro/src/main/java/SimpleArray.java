public class SimpleArray {
    public static void main(String[] args) {
        String[] movies = new String[4];
        movies[0] = "pies";
        movies[1] = "kot";
        movies[2] = "zaba";
        movies[3] = "kaczka";

        String moviee = movies[2];
        System.out.println(moviee);

        int numberOfElements = movies.length;
        System.out.println("moja tablica zawiera " + numberOfElements + " elementy");



    }
}

public class Uzytkownik {

    String name ;

     double age;
    double height;

    public Uzytkownik(String name, double age, double height ) {
      this.name = name;
       this.age = age;
     this.height = height;

    }

    public void Czlowiek() {



        if (name != null) ;
        {
            if (age > 30 && height > 160) {
                System.out.println("user is older than 30 and higher than 160");
            } else {
                System.out.println("user is younger than 30 and shorter than 160");

            }
        }

    }
}
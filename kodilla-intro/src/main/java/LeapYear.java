public class LeapYear {
    public static void main(String[] args) {
        int rok = 2064;
        System.out.println(rok);


        if (rok % 4 > 0) {
            System.out.println("nieprzestepny");
        }
        else if (rok%100 > 0) {
            System.out.println("przestepny");
        }
        else if (rok % 400 == 0) {
            System.out.println("przestepny");
        }
        else
            System.out.println("nieprzestepny");

    }
}


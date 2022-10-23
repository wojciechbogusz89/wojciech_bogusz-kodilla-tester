public class User {

    String name;
    int age;

    double srednia;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.srednia = srednia;
    }

    public static void main(String[] args) {
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};


        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
            System.out.println(sum);
        }
        double srednia;
        srednia = sum / users.length;
        System.out.println(srednia);


        double ponizejSredniej;
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < srednia) {
                System.out.println(users[i].name);
            }
        }
    }
}





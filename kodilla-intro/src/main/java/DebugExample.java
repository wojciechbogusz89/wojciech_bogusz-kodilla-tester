public class DebugExample {
    public static void main(String[] args) {
        int firstNumber = 11;
        int secondNumber = 22;
        int yourAge = 33;
        System.out.println(firstNumber);
        System.out.println(secondNumber);

        if (firstNumber > secondNumber) {
            subtractAndDisplay(firstNumber, secondNumber);
        } else {
            sumAndDisplay(firstNumber, secondNumber);
        }
        if (yourAge < 10){
            System.out.println("You're a kid");
        } else if (yourAge > 10 && yourAge < 18) {
            System.out.println("You're a teenager");
        } else {
            System.out.println("You're an adult");
        }
    }

    private static void sumAndDisplay(int a, int b) {
        int result = a + b;

        System.out.println(result);
    }

    private static void subtractAndDisplay(int a, int b) {
        int result = a - b;

        System.out.println(result);
    }
}
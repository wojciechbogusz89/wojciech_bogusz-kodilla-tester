import java.util.Random;

public class RandomNumbers {
    Random random = new Random();

    private int min;
    private int max;
    int maximum = 5000;
    int result = 0;

    public void randomowe() {
        int sum = 0;
        int temp = 0;
        this.min = 30;
        this.max = 0;
        while (sum < maximum) {
            temp = random.nextInt(31);
            sum = sum + temp;

            if (temp > this.max) {
                this.max = temp;
            }
            if (temp < this.min) {
                this.min = temp;
            }
        }
    }
    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }


    public static void main(String[] args) {
        RandomNumbers randomowe = new RandomNumbers();
        randomowe.randomowe();
        System.out.println("Min: " + randomowe.getMin());
        System.out.println("Max: " + randomowe.getMax());
    }
}

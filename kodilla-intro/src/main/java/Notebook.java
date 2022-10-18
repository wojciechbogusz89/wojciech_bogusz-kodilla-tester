public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price <= 1000) {
            System.out.println("This price is good.");
        } else if (this.price > 1000) {
            System.out.println("this notebook is expensive");
        }


    }

    public void checkweight() {
        if (this.weight <= 600)
            System.out.println("This notebook is light.");
    else if (this.weight >650&&this.weight <=1600)
        System.out.println("This notebook weight is ok.");
    else if (this.weight>1600)
        System.out.println("this notebook is heavy");
    }

    public void checkyear() {
        if (this.year <= 1998)
            System.out.println("this notebook is old");
        else if (this.year > 1999 && this.year <= 2019)
            System.out.println("this notebook is ok.");
        else if (this.year > 2021)
            System.out.println("this notebook is brand new");
    }
}




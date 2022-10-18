

    public class Firstclass {
        public static void main(String[] args) {

            Notebook notebook = new Notebook(600, 1000, 2022);
            System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
            notebook.checkPrice();
            notebook.checkweight();
            notebook.checkyear();

            Notebook heavyNotebook = new Notebook(2000, 1500, 2017);
            System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
            heavyNotebook.checkPrice();
            heavyNotebook.checkweight();
            heavyNotebook.checkyear();

            Notebook oldNotebook = new Notebook(1600, 500, 1995);
            System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
            oldNotebook.checkPrice();
            oldNotebook.checkweight();
            oldNotebook.checkyear();
        }
    }


    public class Firstclass {
        public static void main(String[] args) {

            Notebook notebook = new Notebook(600, 1000, 2022);
            System.out.println(notebook.price + " " + notebook.weight + " " + notebook.year);
            notebook.checkPrice();
            notebook.checkweight();
            notebook.checkyear();

            Notebook heavyNotebook = new Notebook(2000, 1500, 2017);
            System.out.println(heavyNotebook.price + " " + heavyNotebook.weight + " " + heavyNotebook.year);
            heavyNotebook.checkPrice();
            heavyNotebook.checkweight();
            heavyNotebook.checkyear();

            Notebook oldNotebook = new Notebook(1600, 500, 1995);
            System.out.println(oldNotebook.price + " " + oldNotebook.weight + " " + oldNotebook.year);
            oldNotebook.checkPrice();
            oldNotebook.checkweight();
            oldNotebook.checkyear();

        }
    }
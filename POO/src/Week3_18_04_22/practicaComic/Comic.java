package Week3_18_04_22.practicaComic;

import imonsh.*;

public class Comic {
    public static void main(String[] args) {


        int cantPages=7; // CHANGE IF THE COMIC HAS MORE PAGES


        nextPage(1);
        Dialog dialog = new Dialog();
        int input=-1;
        for(int it=2; it<=cantPages; it++){
            do {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ie) {
                    System.out.println("ERROR: Couldown is not working :(");
                }
                input = dialog.confirm("Go to next page", "¿Next page?");
            } while (input != 0);
            if (input == 0) {
                nextPage(it);
            }
        }
    }
    public static void nextPage(int it){
        Scene page=new Scene(it);
        Thread hilo=new Thread(page);
        // System.out.println(input);
        hilo.setName("Scene"+it);
        hilo.start();
    }
}

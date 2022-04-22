package Week1_04_04_22;

public class Skwinkles {
    String type;
    int amount;
    String flavor;
    int size; //cm
    double price; //MX

    Skwinkles(){
        this.startValues();
    }
    Skwinkles(String flavor){
        this.startValues();
        this.flavor=flavor;
    }

    private void startValues(){
        type="Clasico";
        amount=15;
        flavor="Tamarindo";
        size=15;
        price=10.50;
    }
    void show(){
        System.out.println(
                "Tipo de skwinkles: "+type+
                "\nSabor: "+flavor+
                "\nCantidad de skwinkles: "+amount
        );
    }
    void open(){
        System.out.println("Abriendo tus skwinkles "+type+"s");
    }
}

class SkwinklesRellenos extends Skwinkles {
    String stuffingFlavor="Tamarindo";

    SkwinklesRellenos(){
        this.startValues();
    }
    SkwinklesRellenos(String flavor, String stuffingFlavor){
        super(flavor);
        this.startValues();
        this.stuffingFlavor=stuffingFlavor;
    }
    private void startValues(){
        type="Rellenos";
        amount=12;
        size=10;
        price=15.99;
    }

    void show(){
        System.out.println(
                "Tipo de skwinkles: "+type
                        +"\nSabor: "+flavor
                        +"\nSabor del relleno: "+stuffingFlavor
                        +"\nCantidad de skwinkles: "+amount
        );
    }
}

class SkwinklesSalsaguetis extends Skwinkles {
    String flavorSauce="Tamarindo";
    SkwinklesSalsaguetis(){
        this.startValues();
    }
    SkwinklesSalsaguetis(String flavor, String flavorSauce){
        super(flavor);
        this.startValues();
        this.flavorSauce=flavorSauce;
    }
    private void startValues(){
        type="Salsaguetis";
        amount=20;
        size=15;
        price=15.99;
    }
    void show(){
        System.out.println(
                "Tipo de skwinkles: "+type
                        +"\nSabor: "+flavor
                        +"\nSabor de la salsa: "+flavorSauce
                        +"\nCantidad de skwinkles: "+amount
        );
    }
}

class Skwinklotes extends Skwinkles {
    Skwinklotes(){
        this.startValues();
    }
    Skwinklotes(String flavor){
        super(flavor);
        this.startValues();
    }
    private void startValues(){
        type="Skwinklotes";
        amount=15;
        size=20;
        price=20.00;
    }
}

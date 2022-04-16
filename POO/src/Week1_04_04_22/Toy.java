package Week1_04_04_22;

public class Toy {
    String title;
    int amount_pieces;
    int amount_stickers;

    // Overload
    Toy(){  }
    Toy(String title, int amount_pieces, int amount_stickers){
        this.title=title;
        this.amount_pieces=amount_pieces;
        this.amount_stickers=amount_stickers;
    }

    // Setters
    boolean setTitle(String title){
        if(title.length()>3){
            this.title=title;
            return true;
        }else{
            return false;
        }
    }
    boolean setAmountPieces(int amount_pieces){
        if(amount_pieces>0){
            this.amount_pieces=amount_pieces;
            return true;
        }else{
            return false;
        }
    }
    boolean setAmountStickers(int amount_stickers){
        if(amount_stickers>=0){
            this.amount_stickers=amount_stickers;
            return true;
        }else{
            return false;
        }
    }

    // Methods
    void open(){
        System.out.print("Abriendo la capsula...\n\tSalio un ");
        show();
    }
    void assemble(){
        System.out.println("Armando tu "+title+"!");
    }
    void pasteStickers(){
        System.out.println("Se colocaron todas las pegatinas al "+title+"!");
    }
    void show(){
        System.out.println("Juguete: "+title+" con "+amount_pieces+" piezas y "+amount_stickers+" pegatinas");
    }
}

class Animal extends Toy {
    String race;
    String color;

    // Overload
    Animal(){
        super();
    }
    Animal(String title, int amount_pieces, int amount_stickers, String race, String color){
        super(title, amount_pieces, amount_stickers);
        this.race=race;
        this.color=color;
    }

    // Setters
    boolean setRace(String race){
        if(race.length()>0){
            this.race=race;
            return true;
        }else{
            return false;
        }
    }
    boolean setColor(String color){
        if(color.length()>2){
            this.color=color;
            return true;
        }else{
            return false;
        }
    }

    // Methods
    @Override
    void pasteStickers(){
        System.out.println("Colocando los ojos del animal...");
        System.out.println("Colocando la boca del animal...");
        super.pasteStickers();
    }
    @Override
    void show(){
        System.out.println("Juguete de animales: "+title+" con "+amount_pieces+" piezas y "+amount_stickers+" pegatinas");
    }
}

class Dinosaur extends Animal {
    Dinosaur(String title, int amount_pieces, int amount_stickers, String race, String color){
        super(title, amount_pieces, amount_stickers, race, color);
    }

    @Override
    void pasteStickers(){
        System.out.println("Colocando los ojos del dinosaurio...");
        System.out.println("Colocando la boca del dinosaurio...");
        System.out.println("Se colocaron todas las pegatinas :)");
    }
    @Override
    void show(){
        System.out.println("dinosaurio de juguete: "+race+" "+color+" con "+amount_pieces+" piezas y "+amount_stickers+" pegatinas");
    }
}
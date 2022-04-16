package Week1_04_04_22;

public class KinderSurprise {
    private Toy toy;

    //Overload
    KinderSurprise(){
        System.out.println("Creando un nuevo kinder sorpresa");
    }
    KinderSurprise(Toy toy){
        this.toy=toy;
        System.out.println("Creando un nuevo kinder sorpresa");
    }

    //Setters
    boolean setToy(Toy toy){
        if(toy!=null){
            this.toy=toy;
            return true;
        }else{
            return false;
        }
    }

    //Getters
    Toy getToy(){
        return toy;
    }

    //Methods
    void open(){
        System.out.println("Abriendo el kinder sorpresa");
    }
}
package Week3_18_04_22.practicaMona;

public class SurfToCat extends Mona{
    String surfboard;
    String hawiianShirt;
    SurfToCat(String name, String genre, String surfboard, String hawiianShirt){
        super(name, genre);
        this.surfboard=surfboard;
        this.hawiianShirt=hawiianShirt;
    }
    public void surf(){
        String msg=name+" está encarando las olas. ";
        System.out.println(msg);
    }
    public void swim(){
        String msg=name+" está nada en el mar. ";
        System.out.println(msg);
    }
}

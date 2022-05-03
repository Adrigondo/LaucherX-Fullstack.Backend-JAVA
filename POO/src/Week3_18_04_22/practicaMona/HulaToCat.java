package Week3_18_04_22.practicaMona;

public class HulaToCat extends Mona{
    String ukelele;
    String hawiianShirt;
    HulaToCat(String name, String genre, String ukelele, String hawiianShirt){
        super(name, genre);
        this.ukelele=ukelele;
        this.hawiianShirt=hawiianShirt;
    }
    public void playSong(String song){
        String msg=name+" está cantando "+song+" acompañado de su ukelele "+ukelele;
        System.out.println(msg);
    }
    public void dance(){
        String msg=name+" está bailando ulalantemente. ";
        System.out.println(msg);
    }
}

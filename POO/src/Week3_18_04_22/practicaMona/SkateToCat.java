package Week3_18_04_22.practicaMona;

public class SkateToCat extends Mona{
    String skateboard;
    SkateToCat(String name, String genre, String skateboard){
        super(name, genre);
        this.skateboard=skateboard;
    }

    public void putEquipment(){
        String msg=this.getName()+" está poniendose las protecciones de seguridad... ";
        System.out.println(msg);
    }
    public void rideSkateboard(){
        String msg=this.getName()+" acelera con el skate con mucho estilo! ";
        System.out.println(msg);
    }
}

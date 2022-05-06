package Week3_18_04_22.practicaMona;

public class MaxToCat extends Mona{
    MaxToCat(String name, String genre){
        super(name, genre);
    }
    public void balance(){
        String msg=this.name.toUpperCase()+" comienza a equilibrarse para no caer";
        System.out.println(msg);
    }
    public void dontMove(){
        String msg="¡"+this.name.toUpperCase()+" ESTA EN LA MAXIMA CONCENTRACIÓN PARA NO MOVERSE! ";
        System.out.println(msg);
    }
}

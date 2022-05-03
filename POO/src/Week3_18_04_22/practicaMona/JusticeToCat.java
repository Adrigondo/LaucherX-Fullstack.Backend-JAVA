package Week3_18_04_22.practicaMona;

public class JusticeToCat extends Mona{
    JusticeToCat(String name, String genre){
        super(name, genre);
    }
    public void judge(){
        String msg=this.getName()+" está juzgandote con la mirada (:|)";
        System.out.println(msg);
    }
    public void beFair(){
        String msg=name+" está bailando ulalantemente. ";
        System.out.println(msg);
    }
}

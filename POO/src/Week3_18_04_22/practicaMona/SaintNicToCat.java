package Week3_18_04_22.practicaMona;

import java.util.Random;

public class SaintNicToCat extends Mona {
    String[] reinder;
    String[] gifts;
    SaintNicToCat(String name, String genre, String[] reinder, String[] gifts){
        super(name, genre);
        this.reinder=reinder;
        this.gifts=gifts;
    }

    public void rideSled(){
        String msg=this.getName()+" está preparando su trineo:";
        int length=reinder.length;
        for(int i=0; i<length; i++){
            msg=msg+"\n\t"+reinder[i]+" está listo.";
        }
        msg=msg+"\n¡Todos los renos listos! AL INFINITO Y MAS ALLA!!!.\n";
        System.out.println(msg);
    }

    public void deliverGifts(){
        String msg="¡"+this.getName()+" ya comenzó a llevar los regalos a todas las casas! ";
        System.out.println(msg);
        int length=gifts.length;
        for(int i=0; i<length; i++){
            this.goDownChimney();
            msg="Dejando "+gifts[i]+" en la casa #"+(i+1);
            System.out.println("\t"+msg);
            eatCookiesAndMilk();
            System.out.print("\n");
        }
        msg="¡"+this.getName()+" entregó todos los regalos! ";
        System.out.println(msg);
    }
    private void goDownChimney(){
        String msg=this.getName()+" está bajando la chimenea... ";
        System.out.println("\t"+msg);
    }
    private void eatCookiesAndMilk(){
        String msg;
        Random random=new Random();

        int number=random.nextInt(2);
        // System.out.println("\tDEV | Random number: "+number);

        if(number==1){
            msg=this.getName()+" está comiendose las galletas que le dejaron :) .";
        }else {
            msg="No le dejaron galletas a "+this.getName()+" :( .";
        }
        System.out.println("\t"+msg);
    }
}

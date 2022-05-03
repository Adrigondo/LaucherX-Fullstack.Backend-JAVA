package Week3_18_04_22.practicaMona;

import java.util.Random;

public class SaintNicToCat extends Mona {
    String[] reinder;
    String[] gifts;
    SaintNicToCat(String name, String genre, String[] reinder, String[] gifts){
        super(name, genre);
        this.reinder=reinder;
        this.gifts=reinder;
    }

    public void rideSled(){
        String msg=this.getName()+" está preparando su trineo:";
        for(int i=0; i<7; i++){
            msg=msg+"\n\t"+reinder[i]+" está listo.";
        }
        msg=msg+"\n ¡Todos los renos listos! AL INFINITO Y MAS ALLA!!!.";
        System.out.println(msg);
    }

    public void deliverGifts(){
        String msg="¡"+this.getName()+" ya comenzó a llevar los regalos a todas las casas! ";
        System.out.println(msg);
        for(int i=0; i<7; i++){
            this.goDownChimney();
            msg="Dejando regalo en la casa #"+i;
            System.out.println(msg);
            eatCookiesAndMilk();
        }
    }
    private void goDownChimney(){
        String msg=this.getName()+" está bajando la chimenea... ";
        System.out.println(msg);
    }
    private void eatCookiesAndMilk(){
        String msg;
        Random random=new Random();

        int number=random.nextInt(2);
        System.out.println("DEV | Random number: "+number);

        if(number==1){
            msg=this.getName()+" está comiendose las galletas que le dejaron :) .";
        }else {
            msg="No le dejaron galletas a"+this.getName()+" :( .";
        }
        System.out.println(msg);
    }
}

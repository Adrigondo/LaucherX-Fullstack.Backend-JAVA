package Week2_11_04_22;

import imonsh.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Concert {
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Screen screen = new Screen("Concierto 'Something in the way'");
        Dialog dialog = new Dialog();
        Audio music = new Audio("Something in the dark.wav");
        screen.setVisible(true);

        String input=dialog.readString("¿Comenzamos? s/n");
        while(input.charAt(0)!='s'&&input.charAt(0)!='n'){
            input=dialog.readString("[OPCION NO VALIDA]\n¿Comenzamos? s/n");
        }
        if(input.charAt(0)=='n') {
            screen.out("En otro momento será...", "Centaury Gothic", 25, Colors.FussionRed);
        }


        screen.out("Something in the dark\n", "Century Scholbook", 30, Colors.BoyZone);
        //screen.showImage("img/batman_logo.jpg");
        int it=1;
        try {
            Thread.sleep(3000);
            music.play();
            while(it<=4){
                it++;
                changeRenderWithMusic(screen);
            }
            System.out.println("Entra: Batman");
            screen.showImage("img/batman1.png");
            Thread.sleep(3900); // 22088
            screen.cls();
            it=1;
            while(it<=5){
                it++;
                changeRenderWithMusic(screen);
            }
            screen.showImage("img/batman2.jpeg");

            Thread.sleep(8853); // 44823
            screen.out("Something in the dark - Cover by Adrigondo\n Original Song: Something in the way - Nirvana", "Arial", 30, Colors.BeniukonBronze);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void changeRenderWithMusic(Screen screen) throws InterruptedException {screen.setBackground(Colors.black);
        screen.showImage("img/drums_1.png"); // 0
        Thread.sleep(100);
        screen.cls();
        Thread.sleep(1009);
        screen.showImage("img/drums_1.png"); // 1109
        Thread.sleep(100);
        screen.cls();
        Thread.sleep(572);
        screen.showImage("img/drums_1.png"); // 1781
        Thread.sleep(100);
        screen.cls();
        Thread.sleep(172);
        screen.showImage("img/drums_1.png"); // 2053
        Thread.sleep(100);
        screen.cls();
        Thread.sleep(147);
        screen.showImage("img/drums_1.png"); // 2300
        Thread.sleep(100);
        screen.cls();
        Thread.sleep(1097);
        screen.showImage("img/drums_1.png"); // 3497
        Thread.sleep(100);
        screen.cls();
        Thread.sleep(950); // 4547
    }
}

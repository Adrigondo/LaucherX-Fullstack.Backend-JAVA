package Week3_18_04_22.practicaComic;

import Week2_11_04_22.Audio;
import imonsh.Colors;
import imonsh.Dialog;
import imonsh.Screen;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Scene implements Runnable{
    int id;
    Scene(int id){
        this.id=id;
    }
    @Override
    public void run() {
        Screen screen = new Screen("Hollow Knight comic. PAG: "+id);
        Dialog dialog = new Dialog();
        Audio sound_effect = new Audio();
        screen.setSize(1100, 800);
        screen.setVisible(true);
        screen.showImage("img/hollow_knight_"+id+".jpg");

        int input=dialog.confirm("Play effect sound", "Play media");
        if(input==0){
            try{
                sound_effect.play("hollow_knight_"+id+".wav");
            }catch ( IOException | UnsupportedAudioFileException | LineUnavailableException e){
                try{
                    sound_effect.play("page.wav");
                }catch ( IOException | UnsupportedAudioFileException | LineUnavailableException e2) {
                    e2.printStackTrace();
                }
                System.out.println("ERROR: Song not found, or is not in .wav :(");
            }
            screen.out("\n/> Arte extraído del juego Hollow Knight. Todos los derechos son de TeamCherry :)", "Arial", 16, Colors.BeniukonBronze);
            if(id==3){
                screen.out("\n/> Música de Adrian González (@Adrigondo) :)", "Arial", 16, Colors.BoyZone);
            }else if(id==1){
                screen.out("\n/> Música de nojisuma de Pixabay", "Arial", 16, Colors.BoyZone);
            }else{
                screen.out("\n/>Page sound from Zapsplat.com", "Arial", 16, Colors.BalticSea);
            }
            try {
                Thread.sleep(10000);
                input=dialog.confirm("¿Detener música de la página "+this.id+"?", "Stop music from page "+this.id+"?");
                if(input==0){
                    sound_effect.stop();
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
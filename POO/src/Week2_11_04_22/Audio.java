package Week2_11_04_22;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Audio {
    String song;
    public Audio(String song){
        this.song=song;
    }
    public void play() throws NullPointerException, IOException, UnsupportedAudioFileException, LineUnavailableException {
        String fileName="audio/"+song;
        // System.out.println(fileName);

        File fileAudio=new File(fileName);
        System.out.println(fileAudio);
        System.out.println(fileAudio.getName());
        AudioInputStream audioStream= AudioSystem.getAudioInputStream(fileAudio);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);

        clip.start();
    }

    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Audio music = new Audio("Something in the dark.wav");
        music.play();
    }
}
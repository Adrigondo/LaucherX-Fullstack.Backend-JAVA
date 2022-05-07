package Week3_18_04_22.practicaComic;

import Week2_11_04_22.*;
import imonsh.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Comic implements Runnable{
    @Override
    public void run() {
        Screen screen = new Screen("Concierto 'Something in the way'");
        Dialog dialog = new Dialog();
        Audio music = new Audio(" ");
        screen.setVisible(true);
    }
}

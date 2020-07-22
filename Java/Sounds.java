import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;

public class Sounds {

    // function for playing sound
    // had to look up on internet how to do this
    public void playSound(String soundName) {
        InterfaceAndGraphics._button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    AudioInputStream _ais = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
                    Clip _clip = AudioSystem.getClip();
                    _clip.open(_ais);
                    _clip.start();
                }

                catch (Exception ex) {
                    System.out.println("Error with playing sound.");
                    ex.printStackTrace();
                }
            }
        });
    }
}
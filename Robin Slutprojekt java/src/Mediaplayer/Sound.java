package Mediaplayer;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;



public class Sound {

   
	
	public static void getSounds(String getId) {

        String file = ".\\Sounds\\" + getId + ".Sounds";

        try {
            MediaPlayer mediaPlayer = new MediaPlayer(new Media(new File(file).toURI().toString()));

            Runnable playMusic = mediaPlayer::play;
            mediaPlayer.setOnReady(playMusic);
            mediaPlayer.setAutoPlay(false);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }


}

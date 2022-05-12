/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author IT069 arjun
 */
public class VLC {

    private Media mp4, mp3;

    public VLC() {
        mp4 = new MP4();
        mp3 = new MP3();
    }

    public void playMP3() {
        mp3.play();
    }

    public void playMP4() {
        mp4.play();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author admin
 */
public class User {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VLC vlc = new VLC();
        
        vlc.playMP4();
        vlc.playMP3();
    }
    
}

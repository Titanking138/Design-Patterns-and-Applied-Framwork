/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Shape redCircle = new RedColorDecoretor(new Circle());
       Shape redRec = new RedColorDecoretor(new Rectangle());
       redCircle.draw();
       redRec.draw();
       
    }
    
}

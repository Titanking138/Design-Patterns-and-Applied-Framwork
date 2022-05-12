/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package functioninterface;

/**
 *
 * @author admin
 */

public class FunInterface {
                                                                                                                                  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5;
        Masure area = (int a) -> x * x;
        Masure vol = (int a) -> x * x * x;
        int squareArea = area.calucate(x);
        System.out.println(squareArea);
        int volCube = vol.calucate(x);
        System.out.println(volCube);
    }
    
}

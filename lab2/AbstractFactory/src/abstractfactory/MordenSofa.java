/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractfactory;

/**
 *
 * @author IT069 arjun
 */
public class MordenSofa implements Sofa{

    @Override
    public void createSofa() {
        System.out.println("Mordern sofa created");
    }
    
}

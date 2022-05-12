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
public class MordenChair implements Chair{

    @Override
    public void createChair() {
        System.out.println("Morden chair created");
    }
    
}

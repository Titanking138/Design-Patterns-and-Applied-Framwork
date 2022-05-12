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
public class RoyalFurnitureFactory implements AbstractFactory{

    @Override
    public Chair getChair() {
        return new RoyalChair();
    }

    @Override
    public Sofa getSofa() {
        return new RoyalSofa();
    }

    
    
}

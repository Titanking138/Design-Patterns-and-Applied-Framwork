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
public class Manager {
    
    AbstractFactory fur_Type ;
    Chair chair;
    Sofa sofa;

    public Manager(AbstractFactory fur_type) {
        
        this.fur_Type = fur_type;
        
    }
    
    public void getFurniture()
    {
        this.chair = fur_Type.getChair();
        this.sofa = fur_Type.getSofa();
        this.chair.createChair();
        this.sofa.createSofa();
    }
    
    

}

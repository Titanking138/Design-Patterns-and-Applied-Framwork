/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prototype;

/**
 *
 * @author IT069 arjun
 */
public class Nokia extends Mobile{
    
    public Nokia() {
        comp_name = "Nokia";
    }

    @Override
    void production() {
        System.out.println("Nokia phone has been maded and sold ");
    }

}

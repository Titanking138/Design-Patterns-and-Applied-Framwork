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
public class Samsung extends Mobile {

    public Samsung() {
        comp_name = "samsung";
    }

    @Override
    void production() {
        System.out.println("samsung phone has maded and sold");
    }

}

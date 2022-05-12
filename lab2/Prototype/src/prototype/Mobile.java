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
public abstract class Mobile implements Cloneable{
    protected String comp_name = null;
    
    abstract void production();
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    
    
}


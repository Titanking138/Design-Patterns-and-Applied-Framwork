/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author admin
 */
public abstract class Decorator implements Shape{
    protected Shape decoShape;

    public Decorator(Shape decoShape){
        this.decoShape = decoShape;
    }
    
    @Override
    public void draw() {
        decoShape.draw();
    }

    
}

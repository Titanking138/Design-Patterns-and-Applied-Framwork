/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;


/**
 *
 * @author admin
 */
public class RedColorDecoretor extends Decorator {
    public RedColorDecoretor(Shape decoShape)
    {
        super(decoShape);
    }

    @Override
    public void draw() {
        decoShape.draw();
        setColor(decoShape);
    }

    public void setColor(Shape decoShape) {
        System.out.println(" set red color");
    }
    
}

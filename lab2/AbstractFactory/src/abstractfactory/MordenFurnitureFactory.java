
package abstractfactory;

/**
 *
 * @author IT069 arjun
 */
public class MordenFurnitureFactory implements AbstractFactory{

    @Override
    public Chair getChair() {
        return new MordenChair();
    }

    @Override
    public Sofa getSofa() {
        return new MordenSofa();
    }
    
    
}

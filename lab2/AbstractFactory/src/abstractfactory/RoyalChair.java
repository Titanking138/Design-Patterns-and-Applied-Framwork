
package abstractfactory;

/**
 *
 * @author IT069 arjun
 */
public class RoyalChair implements Chair{

    @Override
    public void createChair() {
        System.out.println("Royal chair has created");
    }
    
}

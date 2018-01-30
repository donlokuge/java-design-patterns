 
package factory;

/**
 *
 * @author ashok
 */
class BlueColor implements Color {

    public BlueColor() {
    }

    @Override
    public void print() {
        System.out.println(BlueColor.class.getName());
    }
    
}

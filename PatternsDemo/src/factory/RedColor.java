 
package factory;

/**
 *
 * @author ashok
 */
class RedColor implements Color {

    public RedColor() {
    }
    @Override
    public void print() {
        System.out.println(RedColor.class.getName());
    }
}

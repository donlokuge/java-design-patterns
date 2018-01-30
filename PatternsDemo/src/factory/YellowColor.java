 
package factory;

/**
 *
 * @author ashok
 */
class YellowColor implements Color {

    public YellowColor() {
    }
    @Override
    public void print() {
        System.out.println(YellowColor.class.getName());
    }
}

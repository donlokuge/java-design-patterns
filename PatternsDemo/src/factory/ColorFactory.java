
package factory;

/**
 *
 * @author ashok
 */

public class ColorFactory {
    
     public enum Colors {
        BLUE, YELLOW, RED
    }
     
     public Color createColor(Colors color){
         if(color == Colors.BLUE){
             return new BlueColor();
         }
         if(color == Colors.YELLOW){
             return new YellowColor();
         }
         if(color == Colors.RED){
             return new RedColor();
         }
         return null;
     }
     
}

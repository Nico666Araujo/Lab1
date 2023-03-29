
package laboratorio.tp1_robot;

import entidades.Hombre;
import entidades.Robot;

/**
 *
 * @author VIB
 */
public class TP1_RobotApp {

  
    public static void main(String[] args) {
        
        Robot unRobot = new Robot( "x7000");
        
        Hombre unHombre = new Hombre();
        
        unHombre.jugarConRobot(unRobot);
        
      
        
        
    }
    
}



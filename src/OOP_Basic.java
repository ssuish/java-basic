/* Classes and Objects
 * 
 * Objects:
 *      - have states and behaviors. 
 * Class: 
 *      - a template/blueprint that describes the 
 *      behavior/state that the object of its 
 *      type support.
 */

// Variables Types
public class OOP_Basic {

    // Class Variables
    private static int class_var = 0; // static fields.
    // Instance Variables
    private int inst_var = 0; // non-static fields.

    // Constructor
    public OOP_Basic() {
        inst_var++;
    }

    // Class Methods
    public void ToCount() {
        // Local Variables
        String msg = String.format("Classes: %d \nInstances: %d ", class_var, inst_var);

        System.out.println(msg);
    }
}

class Entity {
    
}
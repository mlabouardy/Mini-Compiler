
package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeBOOLEAN extends Stree {

    public StreeBOOLEAN(String object){
	super(EnumTag.BOOLEAN, null, null, object);
    }
    
     public StreeBOOLEAN(){
    	super(EnumTag.BOOLEAN,null,null,null);
    }
}

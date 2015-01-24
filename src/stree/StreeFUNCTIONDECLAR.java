
package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeFUNCTIONDECLAR extends Stree {

    public StreeFUNCTIONDECLAR(Stree left, Stree right,Object object){
	super(EnumTag.FUNCTIONDECLAR, left, right, object);
    }
    
}
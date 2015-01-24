
package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeSTRUCTURE extends Stree {

    public StreeSTRUCTURE(Stree left,Stree right){
		super(EnumTag.STRUCTURE, left, right, null);
    }
    
}
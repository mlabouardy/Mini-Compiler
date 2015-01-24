
package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeREPEATWHILE extends Stree {

    public StreeREPEATWHILE(Stree left,Stree right){
		super(EnumTag.REPEATWHILE, left, right, null);
    }
    
}

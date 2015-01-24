package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeORBIT extends Stree {

    public StreeORBIT(Stree left, Stree right){
		super(EnumTag.ORBIT, left, right, null);
    }

    public StreeORBIT(Stree s){
    	this(s,null);
    }
    
}

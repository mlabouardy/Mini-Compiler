package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeVARIABLETYPE extends Stree {

    public StreeVARIABLETYPE(Stree left, Stree right){
		super(EnumTag.VARIABLETYPE, left, right, null);
    }

    public StreeVARIABLETYPE(Stree s,Object o){
    	this(s,null);
    	this.object=o;

    }
    
}

package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeFUNCTIONBODY extends Stree {

    public StreeFUNCTIONBODY(Stree left, Stree right){
	super(EnumTag.FUNCTIONBODY, left, right, null);
    }
    
    public StreeFUNCTIONBODY(Stree left){
	super(EnumTag.FUNCTIONBODY, left, null, null);
    }
}

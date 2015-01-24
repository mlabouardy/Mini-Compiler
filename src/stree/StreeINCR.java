package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;


public class StreeINCR extends Stree {

	public StreeINCR(Stree left){
		super(EnumTag.INCR,left,null,null);
    }
    
}

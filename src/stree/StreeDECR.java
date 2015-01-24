package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;


public class StreeDECR extends Stree {

	public StreeDECR(Stree left){
		super(EnumTag.DECR,left,null,null);
    }
    
}

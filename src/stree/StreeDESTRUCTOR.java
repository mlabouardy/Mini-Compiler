package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeDESTRUCTOR extends Stree {

    public StreeDESTRUCTOR(String object,Stree s){
	super(EnumTag.DESTRUCTOR, s, null, object);
    }
    
}

package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import type.*;
import itree.*;

public class StreeIDENTIFIER extends Stree {

    // str gives type
    public StreeIDENTIFIER(String str, int line, int column) {
	super(EnumTag.IDENTIFIER, null, null, str);
    }
    
    // type given
    public StreeIDENTIFIER(Object object, String str) {
	super(EnumTag.IDENTIFIER, null, null, str);
    }
    
    // without str
    public StreeIDENTIFIER(Object object) {
	super(EnumTag.IDENTIFIER, null, null, null);
    }

    public ITree toITree(){
    	return new TEMP(new Temp());
    }
    
}

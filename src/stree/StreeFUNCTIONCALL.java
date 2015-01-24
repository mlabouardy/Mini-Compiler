package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import type.*;
import itree.*;

public class StreeFUNCTIONCALL extends Stree {

    public StreeFUNCTIONCALL(String object,Stree s){
		super(EnumTag.FUNCTIONCALL, s, null, object);
    }

    public StreeFUNCTIONCALL(String object){
    	super(EnumTag.FUNCTIONCALL,new StreeFUNCTIONCALL(),null,object);
    }

    public StreeFUNCTIONCALL(){
    	super(EnumTag.VOID,null,null,null);
    }
    
    public ITree toITree(){
    	return new CALL(new NAME(new Label((String)object)),left.toITree());
    }
}

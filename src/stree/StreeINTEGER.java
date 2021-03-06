package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import itree.*;
import type.*;

public class StreeINTEGER extends Stree implements ITreeInterface,TypeInterface{

    public StreeINTEGER(Object object){
	super(EnumTag.INTEGER, null, null, object);
    }

    public StreeINTEGER(){
    	super(EnumTag.INTEGER,null,null,null);
    }
	

	public ITree toITree(){
		return new CONST((Integer)object);
	}

	public Type toType(){
		return new Type(EnumType.FLOAT);
	}
    
}

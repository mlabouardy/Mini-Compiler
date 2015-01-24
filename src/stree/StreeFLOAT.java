package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import type.*;
import itree.*;
public class StreeFLOAT extends Stree implements TypeInterface,ITreeInterface{

    public StreeFLOAT(Object object){
	super(EnumTag.FLOAT, null, null, object);
    }

    public StreeFLOAT(){
    	super(EnumTag.FLOAT,null,null,null);
    }

	public ITree toITree(){
		return new CONST((Float)object);
	}

	public Type toType(){
		return new Type(EnumType.FLOAT);
	}

}

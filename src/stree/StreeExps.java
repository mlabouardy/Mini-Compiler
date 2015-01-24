package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import itree.*;
import type.*;

public class StreeExps extends Stree implements ITreeInterface,TypeInterface{

    public StreeExps(Stree left, Stree right){
		super(EnumTag.EXP, left, right, null);
    }


	public ITree toITree(){
		return new ExpList(left.toITree(),right.toITree());
	}

	public Type toType(){
		return new Type(EnumType.FLOAT);
	}
    
}
package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import itree.*;
public class StreeAFF extends Stree implements ITreeInterface{

    public StreeAFF(Stree left, Stree right){
	super(EnumTag.AFF, left, right, null);
    }

	
	public ITree toITree(){
		return new MOVE(left.toITree(),right.toITree());
	}
    
}

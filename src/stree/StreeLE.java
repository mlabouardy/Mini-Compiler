package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import itree.*;
import type.*;

public class StreeLE extends Stree {

    public StreeLE(Stree left, Stree right){
	super(EnumTag.LE, left, right, null);
    }

    public ITree toITree(){
    	Label l1=new Label();
    	Label l2=new Label();
    	return new CJUMP(CJUMP.LE,left.toITree(),right.toITree(),l1,l2);
    }
    
}

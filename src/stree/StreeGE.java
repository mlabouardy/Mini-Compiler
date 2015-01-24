package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import type.*;
import itree.*;

public class StreeGE extends Stree {

    public StreeGE(Stree left, Stree right){
	super(EnumTag.GE, left, right, null);
    }

    public ITree toITree(){
    	Label l1=new Label();
    	Label l2=new Label();
    	return new CJUMP(CJUMP.GE,left.toITree(),right.toITree(),l1,l2);
    }
    
}

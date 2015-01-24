package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import itree.*;
import type.*;

public class StreeAND extends Stree {

    public StreeAND(Stree left, Stree right){
	super(EnumTag.AND, left, right, null);
    }
    
    public ITree toITree(){
    	Label l1=new Label();
    	Label l2=new Label();
    	return new CJUMP(CJUMP.AND,left.toITree(),right.toITree(),l1,l2);
    }
}

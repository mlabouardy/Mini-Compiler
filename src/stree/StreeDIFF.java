package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import itree.*;
import type.*;


public class StreeDIFF extends Stree {

    public StreeDIFF(Stree left, Stree right){
	super(EnumTag.DIFF, left, right, null);
    }

    public ITree toITree(){
    	Label l1=new Label();
    	Label l2=new Label();
    	return new CJUMP(CJUMP.DIFF,left.toITree(),right.toITree(),l1,l2);
    }
    
}

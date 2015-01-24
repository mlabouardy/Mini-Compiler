package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import type.*;
import itree.*;
public class StreeGT extends Stree {

    public StreeGT(Stree left, Stree right){
		super(EnumTag.GT, left, right, null);
    }
    
    public ITree toITree(){
    	Label l1=new Label();
    	Label l2=new Label();
    	return new CJUMP(CJUMP.GT,left.toITree(),right.toITree(),l1,l2);
    }
}

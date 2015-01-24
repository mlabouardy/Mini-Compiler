package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import itree.*;
import type.*;

public class StreeLT extends Stree {

    public StreeLT(Stree left, Stree right){
	super(EnumTag.LT, left, right, null);
    }

    public ITree toITree(){
    	Label l1=new Label();
    	Label l2=new Label();
    	return new CJUMP(CJUMP.LT,left.toITree(),right.toITree(),l1,l2);
    }
}

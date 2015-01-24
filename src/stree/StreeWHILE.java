package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import itree.*;
import type.*;

public class StreeWHILE extends Stree {

    public StreeWHILE(Stree left, Stree right){
		super(EnumTag.WHILE, left, right, null);
    }
    
	public ITree toITree(){
		ITree e1=left.left.toITree();
		ITree e2=left.right.toITree();
		EnumTag tag=left.tag;
		Label l1=new Label();
		Label l2=new Label();
		ITree s=right.toITree();
		return new SEQ(new CJUMP(1,e1,e2,l1,l2),new SEQ(new LABEL(l1),new SEQ(s,new LABEL(l2))));
	}
	public int getNbr(EnumTag tag){
		switch(tag){
			case EQ: return CJUMP.EQ;
			case LT: return CJUMP.LT;
			case GE: return CJUMP.GE;
			case LE: return CJUMP.LE;
			case GT: return CJUMP.GT;
			default:return -1;
		}
	}
}

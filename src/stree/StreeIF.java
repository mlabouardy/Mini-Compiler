package stree;

import java.lang.String;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import itree.*;
import type.*;

public class StreeIF extends Stree {

    public StreeIF(Stree left, Stree right){
		super(EnumTag.IF, left, right, null);
    }
	public ITree toITree(){
		ITree e1=left.left.toITree();
		ITree e2=left.right.toITree();
		EnumTag tag=left.tag;
		Label l1=new Label();
		Label l2=new Label();
		Label l3=new Label();
		ITree s1=right.left.toITree();
		ITree s2=right.right.toITree();
		return new SEQ(new CJUMP(getNbr(tag),e1,e2,l1,l2),new SEQ(new LABEL(l1),new SEQ(s1,new SEQ(new JUMP(l3),new SEQ(new LABEL(l2),new SEQ(s2,new LABEL(l3)))))));

	}
    

	public int getNbr(EnumTag tag){
		switch(tag){
			case EQ: return CJUMP.EQ;
			case LT: return CJUMP.LT;
			case GE: return CJUMP.GE;
			case LE: return CJUMP.LE;
			case GT: return CJUMP.GT;
			case AND: return CJUMP.AND;
			case DIFF:return CJUMP.DIFF;
			case OR:return CJUMP.OR;
			default:return -1;
		}
	}
}

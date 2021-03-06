package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import itree.*;
import type.*;

public class StreeFOREACHHEADER extends Stree {

    public StreeFOREACHHEADER(Stree left, Stree right){
		super(EnumTag.FOREACHHEADER, left, right, null);
    }
    
	 public static Stm build(int rel,Exp e1,Exp e2,Stm s){
		Label l1=new Label();
		Label l2=new Label();
		return new SEQ(new CJUMP(rel,e1,e2,l1,l2),s);
	}

	public Stm toStm(){
		Stree t1=left;
		Exp e1=t1.left.toExp();
		EnumTag tag=left.tag;
		Exp e2=t1.right.toExp();
		Stree t2=right;
		Stm s1=t2.toStm();
		return StreeFOREACHHEADER.build(getNbr(tag),e1,e2,s1);
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

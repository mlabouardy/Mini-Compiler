package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import type.*;
import itree.*;


public class StreeEQ extends Stree {

    public StreeEQ(Stree left, Stree right){
	super(EnumTag.EQ, left, right, null);
    }

	public static Stm build(int rel,Exp left,Exp right,Label iftrue,Label iffalse){
		return new CJUMP(rel,left,right,iftrue,iffalse);
	}

	public Stm toStm(){
		int rel=0;
		Exp l=left.toExp();
		Exp r=right.toExp();
		Label iftrue=new Label();
		Label iffalse=new Label();
		return StreeEQ.build(rel,l,r,iftrue,iffalse);
	}
    
}

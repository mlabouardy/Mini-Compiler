package stree;

import itree.BINOP;
import itree.ITree;

public class StreeMULT extends Stree {

    public StreeMULT(Stree left, Stree right){
		super(EnumTag.MULT, left, right, null);
    }
    
    public ITree toITree(){
    	return new BINOP(BINOP.MUL,left.toITree(),right.toITree());
    }

}

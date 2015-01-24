package stree;

import itree.BINOP;
import itree.ITree;

public class StreeMINUS extends Stree {

    public StreeMINUS(Stree left, Stree right){
		super(EnumTag.MINUS, left, right, null);
    }
    
    public ITree toITree(){
    	return new BINOP(BINOP.MINUS,left.toITree(),right.toITree());
    }

}

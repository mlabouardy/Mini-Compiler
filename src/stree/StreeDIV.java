package stree;

import itree.BINOP;
import itree.ITree;

public class StreeDIV extends Stree {

    public StreeDIV(Stree left, Stree right){
		super(EnumTag.DIV, left, right, null);
    }
    
    public ITree toITree(){
    	return new BINOP(BINOP.DIV,left.toITree(),right.toITree());
    }

}

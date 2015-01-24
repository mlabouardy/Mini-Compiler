package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import itree.*;

public class StreePLUS extends Stree implements ITreeInterface{

    public StreePLUS(Stree left, Stree right){
		super(EnumTag.PLUS, left, right, null);
    }
    
    public ITree toITree(){
    	return new BINOP(0,left.toITree(),right.toITree());
    }

}

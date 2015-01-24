package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;


public class StreeARRAY extends Stree {

	public StreeARRAY(Stree left){
		super(EnumTag.ARRAY,left,null,null);
    }

    public StreeARRAY(){
    	super(EnumTag.VOID,null,null,null);
    }


    
}

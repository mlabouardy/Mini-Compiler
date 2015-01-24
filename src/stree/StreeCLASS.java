package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import itree.*;
import type.*;

public class StreeCLASS extends Stree {

    public StreeCLASS(String object,Stree s){
	super(EnumTag.CLASS, s, null, object);
    }

    public static Exp build(Label l){
		return new NAME(l);
	}

	public Exp toExp(){
		Label l=new Label((String)object);
		return StreeCLASS.build(l);
	}
    
}

package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeLISTOF extends Stree {

    public StreeLISTOF(Stree left){
	super(EnumTag.LISTOF, left, null, null);
    }
    
}

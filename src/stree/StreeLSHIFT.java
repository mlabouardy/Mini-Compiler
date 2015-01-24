package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeLSHIFT extends Stree {

    public StreeLSHIFT(Stree left, Stree right){
	super(EnumTag.LSHIFT, left, right, null);
    }
    
}

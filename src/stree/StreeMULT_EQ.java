
package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeMULT_EQ extends Stree {

    public StreeMULT_EQ(Stree left,Stree right){
		super(EnumTag.MULT_EQ, left, right, null);
    }
    
}

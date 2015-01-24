
package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeMINUS_EQ extends Stree {

    public StreeMINUS_EQ(Stree left,Stree right){
		super(EnumTag.MINUS_EQ, left, right, null);
    }
    
}


package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeDIV_EQ extends Stree {

    public StreeDIV_EQ(Stree left,Stree right){
		super(EnumTag.DIV_EQ, left, right, null);
    }
    
}

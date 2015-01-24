
package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeMOD_EQ extends Stree {

    public StreeMOD_EQ(Stree left,Stree right){
		super(EnumTag.MOD_EQ, left, right, null);
    }
    
}

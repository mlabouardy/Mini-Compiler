package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import type.*;
import itree.*;

public class StreeVARIABLEDECLAR extends Stree implements ITreeInterface{

    public StreeVARIABLEDECLAR(Stree left,Stree right){
		super(EnumTag.VARIABLEDECLAR, left, right, null);
    }

    public ITree toITree(){
		return new TEMP(new Temp());
	}
    
}

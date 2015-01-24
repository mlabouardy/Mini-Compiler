package itree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import itree.*;

public class Exp extends ITree{
	
	public Exp(){
		super();
    }

    public String toString(){return new String("EXP");};

        public void toDot(StringBuffer str){
		str.append("e_"+id+" [");
		str.append("shape=\"ellipse\", label=\""+toString());
		str.append("\"];\n");
	}

}

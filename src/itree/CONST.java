package itree;
import type.*;

public class CONST extends Stm {
    public double value;
    public CONST(double v) {super(); value=v;}
    
    public String toString(){return new String("CONST");};

    public void toDot(StringBuffer str) {
	str.append("e_"+id+" [");
	str.append("shape=\"ellipse\", label=\""+toString());
	str.append("\"];\n");
	str.append("e_v_"+id+" [");
	str.append("shape=\"ellipse\", label=\""+value);
	str.append("\"];\n");
	str.append("e_"+id+" -> e_v_"+id+";\n");
    }
}

